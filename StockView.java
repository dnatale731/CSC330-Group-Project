package csc330Final;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
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
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class StockView {
	private static JFrame frame;
	private static JTextField ItemText;
	private static JTextField SupplierText;
	private static JTextField AmountText;
	private static JTextField CostText;
	private static DefaultTableModel model ;
	private static JTable table;
	
	public static void main(String[] args) {
	
		frame = new JFrame("Stock View");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Object[] columns = {"Item ID", " Supplier", "Amount", "Cost"};
		
		
		frame.getContentPane().setLayout(null);
		frame.setSize(678, 502);
		
		JPanel panel = new JPanel();
		panel.setBounds(33, 322, 490, 99);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ItemText = new JTextField();
		ItemText.setBounds(74, 25, 86, 20);
		panel.add(ItemText);
		ItemText.setColumns(10);
		
		SupplierText = new JTextField();
		SupplierText.setBounds(74, 56, 86, 20);
		panel.add(SupplierText);
		SupplierText.setColumns(10);
		
		AmountText = new JTextField();
		AmountText.setBounds(253, 25, 86, 20);
		panel.add(AmountText);
		AmountText.setColumns(10);
		
		CostText = new JTextField();
		CostText.setBounds(253, 56, 86, 20);
		panel.add(CostText);
		CostText.setColumns(10);
		
		JLabel ItemLabel = new JLabel("Item ID:");
		ItemLabel.setBounds(10, 28, 46, 14);
		panel.add(ItemLabel);
		
		JLabel SupplierLabel = new JLabel("Supplier:");
		SupplierLabel.setBounds(10, 59, 46, 14);
		panel.add(SupplierLabel);
		
		JLabel AmountLabel = new JLabel("Amount:");
		AmountLabel.setBounds(197, 28, 46, 14);
		panel.add(AmountLabel);
		
		JLabel CostLabel = new JLabel("Cost:");
		CostLabel.setBounds(197, 59, 46, 14);
		panel.add(CostLabel);
		
		
		JButton AddItemButton = new JButton("Add Item");
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
		AddItemButton.setBounds(379, 38, 89, 23);
		panel.add(AddItemButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 609, 269);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 29, 537, 216);
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
				"New column", "New column", "New column", "item ID"
			}
		));
		scrollPane.setViewportView(table);
		
		
		frame.setVisible(true);
	}
}
