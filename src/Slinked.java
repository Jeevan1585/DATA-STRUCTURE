import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Slinked extends JFrame {
	//creating the node
	class Node{
		int data;
		Node link;
	}
	private JPanel contentPane;
	private JTextField ele1;
	private JTextField ele2;
	private JTextField displaybox;

	//declaring fistr ad note type
private Node first;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slinked frame = new Slinked();
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
	public Slinked() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 360);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SINGLY LINKED LIST");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(124, 21, 161, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT TO INSERT");
		lblEnterTheElement.setForeground(new Color(64, 0, 64));
		lblEnterTheElement.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheElement.setBounds(10, 64, 222, 17);
		contentPane.add(lblEnterTheElement);
		
		ele1 = new JTextField();
		ele1.setColumns(10);
		ele1.setBounds(242, 63, 86, 20);
		contentPane.add(ele1);
		
		JButton insertrare = new JButton("INSERT RARE");
		insertrare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rare
				Node temp;
				int ele = Integer.valueOf(ele1.getText());
				
				
				Node newnode=new Node();
				newnode.data=ele;
				newnode.link=null;
				if(first == null) {
					first=newnode;
				}
				else {
					temp=first;
					while(temp.link!=null) {
						temp=temp.link;
					}
					temp.link=newnode;
					//message box display
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
			
					
					Node n= new Node();
					n.data=ele;
					n.link=null;
					
					if(first==null) {
						first=n;
					}
					else {
						n.link=first;
						first=n;
						//message diloug box
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
				if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "the deleted element is "+first.data);
					
					first=null;
				}
				else {
					Node temp;
					temp=first;
					while(temp.link.link!=null) {
						temp=temp.link;
					}
					JOptionPane.showMessageDialog(contentPane, "the deleted element is "+temp.data);
				
					temp.link=null;
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
				else if(first.link==null) {
					JOptionPane.showMessageDialog(contentPane, "the deleted element is " +first.data);
					first=null;
				}
				else {
					JOptionPane.showMessageDialog(contentPane, "the deleted element is " +first.data);
					first=first.link;
					
				}
				
			}
		});
		deletef.setBounds(174, 179, 111, 23);
		contentPane.add(deletef);
		
		JButton dis = new JButton("DISPLAY");
		dis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(first==null) {
					JOptionPane.showMessageDialog(contentPane, "no node to delete");
				}
				
				if(first.link==null)
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
					
						temp=temp.link;
					}
					
					displaybox.setText(msg);
					
					
				}
				
			
				
			}
		});
		dis.setBounds(195, 217, 73, 23);
		contentPane.add(dis);
		
		displaybox = new JTextField();
		displaybox.setBounds(96, 258, 289, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
