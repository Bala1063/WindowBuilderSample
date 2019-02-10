package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class test {

	private JFrame frame;
	private final JScrollPane scrollPane = new JScrollPane();
	private JTextField textField;
	private JTextField[] jTextFields;
	private JLabel[] jLabels;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 651, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE));

		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);

		JLabel lblNewLabel = new JLabel("Add Elements ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));

		JLabel lblNewLabel_1 = new JLabel("Enter CAN ID");

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Enter");
		JButton btnNewButton_1 = new JButton("Reset");
		JScrollPane scrollPane_1 = new JScrollPane();

		JLabel lblNewLabel_2 = new JLabel("Please Enter CAN ID!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setVisible(false);

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(133)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
					.addGap(144))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(60)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
							.addGap(40)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
							.addGap(63)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
							.addGap(46)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
							.addGap(75))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
							.addGap(67))))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(171)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
					.addGap(318))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
					.addGap(32)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_2)
					.addGap(22)
					.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
					.addGap(49))
		);

		panel_1 = null;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().isEmpty()) {
					lblNewLabel_2.setVisible(false);
					panel_1=new JPanel();
					scrollPane_1.setViewportView(panel_1);
					GroupLayout gl_panel_1 = new GroupLayout(panel_1);
					panel_1.setLayout(gl_panel_1);
					gl_panel_1.setAutoCreateGaps(true);
					gl_panel_1.setAutoCreateContainerGaps(true);
					ParallelGroup parallel = gl_panel_1.createParallelGroup();
					gl_panel_1.setHorizontalGroup(gl_panel_1.createSequentialGroup().addGroup(parallel));
					SequentialGroup sequential = gl_panel_1.createSequentialGroup();
					gl_panel_1.setVerticalGroup(sequential);
					int size = Integer.parseInt(textField.getText());
					jTextFields = new JTextField[size];
					jLabels = new JLabel[size];
					for (int i = 0; i < size; i++) {

						jLabels[i] = new JLabel("New label");
						jTextFields[i] = new JTextField();
						jLabels[i].setLabelFor(jTextFields[i]);
						parallel.addGroup(gl_panel_1.createSequentialGroup().addComponent(jLabels[i])
								.addComponent(jTextFields[i]));
						sequential.addGroup(gl_panel_1.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabels[i]).addComponent(jTextFields[i]));
					}
				}
				else
				{
					lblNewLabel_2.setVisible(true);
					btnNewButton_1.doClick();
				}
				frame.revalidate();
			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				panel_1 = new JPanel();
				scrollPane_1.setViewportView(panel_1);
				scrollPane_1.revalidate();
				frame.revalidate();
			}
		});

		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
