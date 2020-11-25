package supplier;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StockView {
	private static JFrame frame;
	private static JTextField ItemText;
	private static JTextField SupplierText;
	private static JTextField AmountText;
	private static JTextField CostText;
	private static DefaultTableModel model ;
	private static JTable table;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	
	public static void main(String[] args) {
	
		frame = new JFrame("Stock View");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.getContentPane().setLayout(null);
		frame.setSize(678, 502);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 283, 484, 125);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ItemText = new JTextField();
		ItemText.setBounds(60, 25, 86, 20);
		panel.add(ItemText);
		ItemText.setColumns(10);
		
		SupplierText = new JTextField();
		SupplierText.setBounds(60, 56, 86, 20);
		panel.add(SupplierText);
		SupplierText.setColumns(10);
		
		AmountText = new JTextField();
		AmountText.setBounds(227, 25, 86, 20);
		panel.add(AmountText);
		AmountText.setColumns(10);
		
		CostText = new JTextField();
		CostText.setBounds(227, 56, 86, 20);
		panel.add(CostText);
		CostText.setColumns(10);
		
		JLabel ItemLabel = new JLabel("Item ID:");
		ItemLabel.setBounds(10, 28, 46, 14);
		panel.add(ItemLabel);
		
		JLabel SupplierLabel = new JLabel("Name:");
		SupplierLabel.setBounds(10, 59, 46, 14);
		panel.add(SupplierLabel);
		
		JLabel AmountLabel = new JLabel("Price:");
		AmountLabel.setBounds(171, 28, 46, 14);
		panel.add(AmountLabel);
		
		JLabel CostLabel = new JLabel("color:");
		CostLabel.setBounds(171, 59, 47, 14);
		panel.add(CostLabel);
		
		JLabel lblNewLabel = new JLabel("Stock:");
		lblNewLabel.setBounds(323, 28, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Description:");
		lblNewLabel_1.setBounds(84, 101, 57, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(389, 25, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(171, 98, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton AddItemButton = new JButton("Add Item");
		AddItemButton.setBounds(323, 97, 89, 23);
		panel.add(AddItemButton);
		
		JLabel lblNewLabel_2 = new JLabel("Make:");
		lblNewLabel_2.setBounds(323, 59, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(389, 56, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		AddItemButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
	
				 TableModel tModel = table.getModel();
				  ((DefaultTableModel) tModel).addRow(new Object[] { 
						  ItemText.getText(),
						  SupplierText.getText(),
						  AmountText.getText(),
						  CostText.getText()});
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 631, 269);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 615, 257);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
					"Item ID", " Name", "Price", "color", "Stock", "description", "Make"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton backButton = new JButton("Back");
		backButton.setBounds(504, 412, 148, 40);
		frame.getContentPane().add(backButton);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				supplierHome.main(null);
				frame.setVisible(false);
			}
		});
		
		
		frame.setVisible(true);
	}
}
