package customer;

import javax.swing.*;

import csc330Final.HomePage;
import supplier.supplierHome;

import java.awt.*;
import java.util.*;
import java.net.URL;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customers extends JApplet {
	public customers() {
		getContentPane().setBackground(new Color(47, 79, 79));
		setBackground(new Color(47, 79, 79));
		setBounds(new Rectangle(0, 0, 450, 260));
		setPreferredSize(new Dimension(400, 250));
		setSize(new Dimension(452, 280));
		setMinimumSize(new Dimension(500, 300));
	}
    // 1. Create a scroll pane object and the other
    //    necessary objects.

    JScrollPane scrollPane = null;
    JLabel label = null;  // Not a canvas for JScrollPane!
    JLabel label2 = null;
    JLabel label3 = null; 
    JLabel label4 = null; 
    JPanel panel = null;  // supports double buffering
    Icon icon = null;
    private final JButton btnRefresh = new JButton("Refresh");

    public  void init() {

        // 2. Get a handle on the JApplet's container.

        Container container = getContentPane();
        container.setLayout(new GridLayout(1,1));



        ImageIcon img1 = new ImageIcon(this.getClass().getResource("/Case.png"));
        ImageIcon img2 = new ImageIcon(this.getClass().getResource("/bag.png"));
        ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Piano.png"));
        ImageIcon img4 = new ImageIcon(this.getClass().getResource("/Adidas.png"));
        panel = new JPanel();
        panel.setBackground(new Color(47, 79, 79));
        panel.setSize(400, 250);

        // 5. Create a scroll pane and add the panel to it.

        scrollPane = new JScrollPane(panel,
                     JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                     JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBackground(new Color(47, 79, 79));
                        panel.setLayout(null);
                
                
                String x = "Piano";
                        label3 = new JLabel(img3);
                        label3.setBounds(0, 128, 64, 64);
                        panel.add(label3);
                        JButton btnNewButton = new JButton(x);
                        btnNewButton.setBounds(0, 197, 72, 28);
                        btnNewButton.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent arg0) {
                        		final String k = "piano";
                        		itemView s= new itemView(k);
                        		s.main(k);
                        		
                        	}
                        });
                        
                                // 4. Create a Swing label and a panel for double buffering.
                        
                                label = new JLabel(img1);
                                label.setBounds(123, 136, 48, 48);
                                panel.add(label);
                        label2 = new JLabel(img2);
                        label2.setBounds(223, 128, 64, 64);
                        panel.add(label2);
                        
                                        label4 = new JLabel(img4);
                                        label4.setBounds(343, 128, 64, 64);
                                        panel.add(label4);
                        panel.add(btnNewButton);
                        x = "Suit Case"; //could come from database
                                JButton btnSuitCaseX = new JButton(x);
                                btnSuitCaseX.setBounds(98, 197, 90, 28);
                                btnSuitCaseX.addActionListener(new ActionListener() {
                                	public void actionPerformed(ActionEvent e) {
                                	}
                                });
                                panel.add(btnSuitCaseX);
                x = "Bag" ; //get from database
                                
                                JButton btnNewButton_1 = new JButton(x);
                                btnNewButton_1.setBounds(223, 197, 64, 28);
                                panel.add(btnNewButton_1);
                x="Adidas";//get from database
                JButton btnNewButton_2 = new JButton(x);
                btnNewButton_2.setBounds(342, 197, 82, 28);
                btnNewButton_2.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                	}
                });
                panel.add(btnNewButton_2);
                btnRefresh.setBounds(156, 232, 90, 28);
                panel.add(btnRefresh);
                
                JButton btnLogOut = new JButton("Log out");
                btnLogOut.setBounds(343, 13, 86, 28);
                panel.add(btnLogOut);
                
                JButton btnNewButton_3 = new JButton("Orders");
                btnNewButton_3.setBounds(183, 13, 86, 28);
                panel.add(btnNewButton_3);
                
                JButton btnNewButton_4 = new JButton("Account");
                btnNewButton_4.setBounds(12, 13, 88, 28);
                panel.add(btnNewButton_4);
                btnNewButton_4.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		cAccount x = new cAccount();
                		x.main(null);
                		container.setVisible(false);
                	}
                });
                btnLogOut.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		HomePage x = new HomePage();
                		x.main(null);
                		container.setVisible(false);
                	}
                });
                
                
        // 6. Add the scroll pane to the contentpane of JApplet.

        container.add(scrollPane);
        container.setSize(400, 250);
    }
   
public static void main(String[] args) {
	customers x = new customers();
	JFrame myFrame=new JFrame("Test");
    myFrame.setBounds(400, 250, 400, 250);
	myFrame.getContentPane().add(x);
    myFrame.pack();
    myFrame.setVisible(true);
    x.init();
}
}

