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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizebox;
	private JTextField elebox;
	private int arr[];
	private int size;
	private int top=-1;
	/**
	 * @wbp.nonvisual location=218,-31
	 */
	private final JButton push_1 = new JButton("PUSH");
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 348);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel.setBounds(168, 24, 178, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE");
		lblEnterTheStack.setForeground(new Color(0, 128, 128));
		lblEnterTheStack.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterTheStack.setBounds(56, 73, 178, 17);
		contentPane.add(lblEnterTheStack);
		
		sizebox = new JTextField();
		sizebox.setBounds(244, 72, 86, 20);
		contentPane.add(sizebox);
		sizebox.setColumns(10);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating the stack 
 size = Integer.valueOf(sizebox.getText());
			arr=new int[size];
	
		//string message for dilog box display
		String message="the size of " +size+ "is created";
		//dilog box message display
		JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		create.setBounds(163, 112, 107, 23);
		contentPane.add(create);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(new Color(0, 128, 128));
		lblEnterAnElement.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblEnterAnElement.setBounds(56, 164, 178, 17);
		contentPane.add(lblEnterAnElement);
		
		elebox = new JTextField();
		elebox.setColumns(10);
		elebox.setBounds(222, 163, 86, 20);
		contentPane.add(elebox);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code elebox
				int ele;
				if(top==size-1){
			
					JOptionPane.showMessageDialog(contentPane, "push is not possible");
				
					}
				else {
					ele=Integer.valueOf( elebox.getText());
					
					++top;
					arr[top]=ele;
					JOptionPane.showMessageDialog(contentPane, "push successfull");
					elebox.setText("");
				}
				
			}
		});
		push.setBounds(333, 162, 107, 23);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code elebox
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "pop is not possible");
				}
				else {
					String message = "the element deleted is "+arr[top];
					JOptionPane.showMessageDialog(contentPane, message);
					
					--top;
					
				}
				
			}
			
		});
		pop.setBounds(168, 192, 107, 23);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// display code
				if(top==-1) {
					JOptionPane.showMessageDialog(contentPane, "display is not possible");
				}
				else {
					//displaying in the form of string
					String msg ="";
					for(int i=top;i>=0;i--) {
						
					
						msg=msg+ " "+arr[i];
						
						
						
					
					}
					displaybox.setText(msg);
				}
			}
		});
		display.setBounds(168, 226, 107, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(110, 265, 262, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}

}
