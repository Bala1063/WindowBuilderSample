package test;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class sample {

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
					sample window = new sample();
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
	public sample() {
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
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Can message calculator");
		lblNewLabel.setBounds(307, 11, 158, 14);
		frame.getContentPane().add(lblNewLabel);
		textField = new JTextField();
		textField.setBounds(307, 61, 132, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Enter Message ID");
		lblNewLabel_1.setBounds(138, 64, 109, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 704, 320);
		frame.getContentPane().add(scrollPane);

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
		btnNewButton.setBounds(527, 60, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
