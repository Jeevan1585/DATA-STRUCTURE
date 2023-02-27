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

public class CircularQ extends JFrame {

	private JPanel contentPane;
	private JTextField lenbox;
	private JTextField elebox;
	private JTextField displaybox;
	private int arr[];
	private int rare=-1;
	private int front=0;
	private int size;
	private int count=0;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQ frame = new CircularQ();
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
	public CircularQ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 327);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		
contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCLEQ  DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(119, 11, 202, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheQueue = new JLabel("ENTER THE QUEUE SIZE");
		lblEnterTheQueue.setForeground(new Color(64, 0, 64));
		lblEnterTheQueue.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheQueue.setBounds(25, 39, 178, 17);
		contentPane.add(lblEnterTheQueue);
		
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
		create.setBounds(143, 67, 139, 23);
		contentPane.add(create);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT TO INSERT");
		lblEnterTheElement.setForeground(new Color(64, 0, 64));
		lblEnterTheElement.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheElement.setBounds(10, 122, 222, 17);
		contentPane.add(lblEnterTheElement);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insertion code
				int ele;
				if(count ==size) {
					JOptionPane.showMessageDialog(contentPane, "insrtion is not possible");
				}
				else {
					ele=Integer.valueOf(elebox .getText());
					rare = (rare+1) % size;
					arr[rare]= ele;
					count++;
					JOptionPane.showMessageDialog(contentPane, "inserted successfull");
					elebox.setText("");
				}
			}
		});
		insert.setBounds(338, 120, 96, 23);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deleetion code
				if(count==0) {
					JOptionPane.showMessageDialog(contentPane, "deletion is not possible");
				}
				else {
					String message = "the element deleted is "+arr[front];
					JOptionPane.showMessageDialog(contentPane, message);
					
					 front = (front+1)%size;
					 count--;
					
				}
			}
		});
		delete.setBounds(143, 166, 123, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//display code displaybox
				 int f=front;
				 if(count==0) {
				JOptionPane.showMessageDialog(contentPane, "display is not possible");
				
			}
			else {
				//displaying in the form of string
				String msg ="";
				for(int i=1;i<=count;i++) {
					msg=msg+ " "+arr[f];
					 f=(f+1)%size;
				}
				displaybox.setText(msg);
			
			}
			}
			});
		display.setBounds(143, 200, 124, 23);
		contentPane.add(display);
		
		lenbox = new JTextField();
		lenbox.setBounds(202, 38, 86, 20);
		contentPane.add(lenbox);
		lenbox.setColumns(10);
		
		elebox = new JTextField();
		elebox.setBounds(242, 121, 86, 20);
		contentPane.add(elebox);
		elebox.setColumns(10);
		
		displaybox = new JTextField();
		displaybox.setBounds(91, 230, 243, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		displaybox.setColumns(10);
	}

}
