package test;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.InputVerifier;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class sample2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField[] jTextFields;
	private JLabel[] jLabels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sample2 window = new sample2();
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
	public sample2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 740, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("Can message calculator");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Please Enter a Can ID");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 9));
		lblNewLabel_2.setVisible(false);

		InputVerifier inputVerifier = new InputVerifier() {

			@Override
			public boolean verify(JComponent input) {
				// TODO Auto-generated method stub
				JTextField field = (JTextField) input;
				if (field.getText() != "") {
					return true;
				}
				lblNewLabel_2.setVisible(true);
				return false;
			}
		};
		textField.setInputVerifier(inputVerifier);

		JLabel lblNewLabel_1 = new JLabel("Enter Message ID");

		JScrollPane scrollPane = new JScrollPane();

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel);

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				GridBagLayout gbl_panel = new GridBagLayout();
				gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
				gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
				gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
				gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
				panel.setLayout(gbl_panel);
				jTextFields = new JTextField[12];
				jLabels = new JLabel[12];

				for (int i = 0; i < 12; i++) {

					jLabels[i] = new JLabel("New label");
					GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
					gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
					gbc_lblNewLabel.gridx = 1;
					gbc_lblNewLabel.gridy = i + 1;
					panel.add(jLabels[i], gbc_lblNewLabel);

					jTextFields[i] = new JTextField();
					GridBagConstraints gbc_textField = new GridBagConstraints();
					gbc_textField.fill = GridBagConstraints.HORIZONTAL;
					gbc_textField.insets = new Insets(0, 0, 5, 5);
					gbc_textField.gridx = 3;
					gbc_textField.gridy = i + 1;
					panel.add(jTextFields[i], gbc_textField);
					jTextFields[i].setColumns(10);
				}
				frame.revalidate();
				/*
				 * JComboBox<String> comboBox = new JComboBox<>(); comboBox.addItem("a");
				 * comboBox.addItem("b"); comboBox.addItem("c"); GridBagConstraints gbc_comboBox
				 * = new GridBagConstraints(); gbc_comboBox.fill =
				 * GridBagConstraints.HORIZONTAL; gbc_comboBox.insets = new Insets(0, 0, 0, 5);
				 * gbc_comboBox.gridx = 3; gbc_comboBox.gridy = 4; panel.add(comboBox,
				 * gbc_comboBox); frame.revalidate();
				 */
			}
		});

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(10)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE).addGap(10))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addGap(65)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE).addGap(99)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(textField, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
												.addGap(120)
												.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 89,
														Short.MAX_VALUE)
												.addGap(110))
										.addGroup(groupLayout
												.createSequentialGroup().addComponent(lblNewLabel,
														GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
												.addGap(293))))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE).addGap(15)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
						.addGap(15).addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
						.addGap(11)));
		frame.getContentPane().setLayout(groupLayout);
	}
}
