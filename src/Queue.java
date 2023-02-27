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

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField lenbox;
	private JTextField elebox;
	private JTextField displaybox;
	private int arr[];
	private int rare=-1;
	private int front=0;
	private int size;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(142, 11, 182, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheQueue = new JLabel("ENTER THE QUEUE SIZE");
		lblEnterTheQueue.setForeground(new Color(64, 0, 64));
		lblEnterTheQueue.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheQueue.setBounds(42, 77, 178, 17);
		contentPane.add(lblEnterTheQueue);
		
		lenbox = new JTextField();
		lenbox.setColumns(10);
		lenbox.setBounds(238, 76, 86, 20);
		contentPane.add(lenbox);
		
		JButton create = new JButton("CREATE QUEUE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating queue code
				 size = Integer.valueOf(lenbox.getText());
					arr=new int[size];
					//string message for dilog box display
					String message="the size of " +size+ "is created";
					//dilog box message display
					JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		create.setBounds(161, 119, 139, 23);
		contentPane.add(create);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT TO INSERT");
		lblEnterTheElement.setForeground(new Color(64, 0, 64));
		lblEnterTheElement.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheElement.setBounds(10, 179, 222, 17);
		contentPane.add(lblEnterTheElement);
		
		elebox = new JTextField();
		elebox.setColumns(10);
		elebox.setBounds(250, 178, 86, 20);
		contentPane.add(elebox);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertion code
				int ele;
				if(rare==size-1){
			
					JOptionPane.showMessageDialog(contentPane, "insrtion is not possible");
				
					}
				else {
					ele=Integer.valueOf(elebox .getText());
				
					rare++;
					arr[rare]=ele;
					JOptionPane.showMessageDialog(contentPane, "inserted successfull");
					elebox.setText("");
				}
			}
		});
		insert.setBounds(346, 177, 96, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deleetion code
				if(rare==-1 || front>rare) {
					JOptionPane.showMessageDialog(contentPane, "deletion is not possible");
				}
				else {
					String message = "the element deleted is "+arr[front];
					JOptionPane.showMessageDialog(contentPane, message);
					
					front++;
					
				}
			}
		});
		delete.setBounds(143, 207, 123, 23);
		contentPane.add(delete);
		
		JButton btnNewButton = new JButton("DISPLAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//display code displaybox
			if(rare==-1 ||front>rare) {
				JOptionPane.showMessageDialog(contentPane, "display is not possible");
				
			}
			else {
				//displaying in the form of string
				String msg ="";
				for(int i=front;i<=rare;i++) {
					msg=msg+ " "+arr[i];
				}
				displaybox.setText(msg);
			
			}
			}
			});
		btnNewButton.setBounds(142, 241, 124, 23);
		contentPane.add(btnNewButton);
		
		displaybox = new JTextField();
		displaybox.setBounds(65, 276, 297, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
