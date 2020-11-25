package csc330Final;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;

import customer.customers;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class customerLogin  extends JPanel{

	private JFrame frame;
	Connection conn = null;
	private JTextField UNField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerLogin window = new customerLogin();
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
	public customerLogin() {
		initialize();
		conn = sqliteConnection.dbConnector();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton logInButton = new JButton("Login");
		logInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query = " SELECT * FROM Admins WHERE username = ? and password = ? ";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1, UNField.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					int count = 0; 
					while(rs.next()){
						System.out.println(rs.toString());
						count ++;	
					}
					if(count == 1){
						JOptionPane.showMessageDialog(null, "Username and Password are correct");
						customers x = new customers();
						x.main(null);
						frame.setVisible(false);
					}else if (count > 1){
						JOptionPane.showMessageDialog(null, "Duplicate Username and password");
					}else{
						JOptionPane.showMessageDialog(null, "Username and Passwrod are not correct. Try Again!!");
					}
					rs.close();
					pst.close();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
				frame.setVisible(false);
			}
		});
	
		logInButton.setBounds(146, 166, 133, 36);
		frame.getContentPane().add(logInButton);
		
		JLabel UNLabel = new JLabel("User Name :");
		UNLabel.setBounds(48, 52, 88, 23);
		frame.getContentPane().add(UNLabel);
		
		JLabel passLabel = new JLabel("Password :");
		passLabel.setBounds(48, 96, 77, 23);
		frame.getContentPane().add(passLabel);
		
		UNField = new JTextField();
		UNField.setBounds(146, 53, 86, 20);
		frame.getContentPane().add(UNField);
		UNField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(146, 97, 89, 20);
		frame.getContentPane().add(passwordField);
	}
}
