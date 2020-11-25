package customer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class itemView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String x) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					itemView window = new itemView(x);
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
	public itemView(String x) {
		initialize(x);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String f) {
		frame = new JFrame();
		frame.setBounds(100, 100, 492, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		String m = f + ".png";
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/"+m));
		JLabel lblNewLabel = new JLabel(img3);
		lblNewLabel.setBounds(26, 45, 89, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Buy");
		btnNewButton.setBounds(26, 165, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(377, 225, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Price:");
		lblNewLabel_1.setBounds(210, 108, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Discription:");
		lblNewLabel_2.setBounds(197, 144, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Seller:");
		lblNewLabel_3.setBounds(210, 75, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Name:");
		lblNewLabel_4.setBounds(197, 45, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}

}
