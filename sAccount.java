package supplier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class sAccount {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sAccount window = new sAccount();
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
	public sAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(109, 68, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 71, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblAddress = new JLabel("Street Address:");
		lblAddress.setBounds(10, 115, 90, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblEmail = new JLabel("email:");
		lblEmail.setBounds(240, 98, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(240, 143, 46, 14);
		frame.getContentPane().add(lblCity);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(10, 162, 92, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(296, 95, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 112, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(296, 140, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(109, 159, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblUpdateAccount = new JLabel("Update Account");
		lblUpdateAccount.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUpdateAccount.setHorizontalTextPosition(SwingConstants.CENTER);
		lblUpdateAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateAccount.setBounds(160, 11, 116, 37);
		frame.getContentPane().add(lblUpdateAccount);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBounds(160, 197, 126, 33);
		frame.getContentPane().add(btnNewButton);
	}
}
