import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;









public class Dlink extends JFrame {
	class Node{
		int data;
		Node prelink;
		Node nextlink;
	}

	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;
	private Node first;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dlink frame = new Dlink();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dlink() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 382);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(124, 21, 161, 17);
		contentPane.add(lblNewLabel);

		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT TO INSERT");
		lblEnterTheElement.setForeground(new Color(64, 0, 64));
		lblEnterTheElement.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheElement.setBounds(10, 64, 222, 17);
		contentPane.add(lblEnterTheElement);
		
		JButton insertrare = new JButton("INSERT RARE");
		insertrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rare
				Node node = new Node();
				int ele = Integer.valueOf(ele1.getText());
				
			node.data =ele;
			node.prelink=null;
			node.nextlink=null;
				if(first == null) {
					first = node;
				}
				else {
					Node temp ;
					temp= first;
					while(temp.nextlink!=null) {
					temp=temp.nextlink;	
					}
					temp.nextlink=node;
					node.prelink=temp;
					JOptionPane.showMessageDialog(contentPane, "inserted at rare successfull");
					ele1.setText("");
				}
			}
				
				
				
				
				
			
		});
		insertrare.setBounds(351, 62, 99, 23);
		contentPane.add(insertrare);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT TO INSERT");
		lblEnterTheElement_1.setForeground(new Color(64, 0, 64));
		lblEnterTheElement_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheElement_1.setBounds(10, 108, 222, 17);
		contentPane.add(lblEnterTheElement_1);
		
		ele2 = new JTextField();
		ele2.setColumns(10);
		ele2.setBounds(242, 107, 86, 20);
		contentPane.add(ele2);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//inser at front
			
			int ele = Integer.valueOf(ele2.getText());
			Node node = new Node();
			
			node.data=ele;
			node.nextlink=null;
			node.prelink=null;
			if(first==null) {
				first=node;
			}
			else {
				node.nextlink=first;
				first.prelink=node;
				
				first=node;
				JOptionPane.showMessageDialog(contentPane, "insetred front succfully");
				ele2.setText("");
			}
				
			}
		});
		insertfront.setBounds(351, 106, 105, 23);
		contentPane.add(insertfront);
		
		JButton deleteR = new JButton("DELETE RARE");
		deleteR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletee rare
				if(first == null) {
			JOptionPane.showMessageDialog(contentPane, "no node to delete");
				}
				if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "the deleted element is "+first.data);
					
					first=null;
				}
				else {
					Node temp;
					temp = first;
					while(temp.nextlink.nextlink!=null) {
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane, "the deleted element is "+temp.data);
				
					temp.nextlink=null;
				}
			}
		});
		deleteR.setBounds(174, 138, 111, 23);
		contentPane.add(deleteR);
		
		JButton deletef = new JButton("DELETE FRONT");
		deletef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front code
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "no node to delete");
				}
				else if(first.nextlink==null) {
					JOptionPane.showMessageDialog(contentPane, "the deleted element is " +first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "the deleted element is " +first.data);
					first=first.nextlink;
					first.prelink=null;
					
				}
				
			}
		});
		deletef.setBounds(174, 179, 111, 23);
		contentPane.add(deletef);
		
		JButton displayr = new JButton("DISPLAY FORWORD");
		displayr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "no node to delete");
				}
				
				if(first.nextlink==null)
				{
					String msg1 ="" +first.data;
				//	msg1=msg1+ " "+first.data;
					displaybox.setText(msg1);
				}
			
				else {
					Node temp=first;
					String msg="";
					while(temp!=null) {
						
						msg=msg+ " "+temp.data;
					
						temp=temp.nextlink;
					}
					
					displaybox.setText(msg);
					
					
				}
				
			
				
			}
		});
		displayr.setBounds(117, 215, 129, 23);
		contentPane.add(displayr);
		
		ele1 = new JTextField();
		ele1.setBounds(242, 63, 86, 20);
		contentPane.add(ele1);
		ele1.setColumns(10);
		
		displaybox = new JTextField();
		displaybox.setBounds(99, 265, 308, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton displayf = new JButton("DISPLAY REVERSE");
		displayf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//code for reverse
				
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "no node to delete");
				}
				
				if(first.nextlink==null)
				{
					String msg1 ="" +first.data;
				//	msg1=msg1+ " "+first.data;
					displaybox.setText(msg1);
				}
				else {
					Node temp=first;
					while(temp.nextlink!=null) {
						temp=temp.nextlink;
					}
					String msg="";
					while(temp!=null) {
						
						msg=msg+ " "+temp.data;
						temp=temp.prelink;
					}
					displaybox.setText(msg);
				
				}
			}
		});
		displayf.setBounds(256, 215, 121, 23);
		contentPane.add(displayf);
		displaybox.setColumns(10);
		
		
	}

}
