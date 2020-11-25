package supplier;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import csc330Final.HomePage;

import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class tickets {
	private static JFrame frame;
	private static JTextField ItemText;
	private static JTextField AmountText;
	private static DefaultTableModel model ;
	private static JTable table;
	private static JTextField textField;
	
	public static void main(String[] args) {
	
		frame = new JFrame("Tickets");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Object[] columns = {"Item ID", " Supplier", "Amount", "Cost"};
		
		
		frame.getContentPane().setLayout(null);
		frame.setSize(678, 502);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 291, 585, 106);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ItemText = new JTextField();
		ItemText.setBounds(82, 25, 105, 20);
		panel.add(ItemText);
		ItemText.setColumns(10);
		
		AmountText = new JTextField();
		AmountText.setBounds(82, 64, 105, 20);
		panel.add(AmountText);
		AmountText.setColumns(10);
		
		JLabel ItemLabel = new JLabel("Ticket ID:");
		ItemLabel.setBounds(10, 28, 62, 14);
		panel.add(ItemLabel);
		
		JLabel AmountLabel = new JLabel("Status:");
		AmountLabel.setBounds(10, 67, 50, 14);
		panel.add(AmountLabel);
		
		
		JButton AddItemButton = new JButton("Update Status");

		AddItemButton.setBounds(435, 72, 140, 23);
		panel.add(AddItemButton);
		
		JLabel lblNewLabel = new JLabel("Discription:");
		lblNewLabel.setBounds(230, 42, 74, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(314, 39, 140, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 609, 269);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 589, 247);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Ticket_ID", "Issue", "Status", "item ID"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage.main(null);
				frame.setVisible(false);
			}
		});
		backButton.setBounds(471, 412, 148, 40);
		frame.getContentPane().add(backButton);
		
		frame.setVisible(true);
	}
}