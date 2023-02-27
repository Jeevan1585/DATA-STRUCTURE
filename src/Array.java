import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField lengthbox;
	private JTextField elementbox;
	private JTextField posbox;
	private JTextField deletebox;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 345);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 128, 0));
		contentPane.setBackground(new Color(128, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setBounds(110, 10, 213, 21);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1.setBounds(60, 42, 147, 14);
		contentPane.add(lblNewLabel_1);
		
		lengthbox = new JTextField();
		lengthbox.setBounds(217, 42, 86, 20);
		contentPane.add(lengthbox);
		lengthbox.setColumns(10);
		
		JButton create = new JButton("CREATE");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//write a code to creat an array
		int len = Integer.valueOf(lengthbox.getText());
				arr=new int[len];
				//message to display after creating the array
				String message = "Array of length" +len+"Created";
				// dialog box 
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		create.setBounds(170, 76, 89, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN INT NUMBER:");
		lblNewLabel_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_1.setBounds(10, 113, 147, 14);
		contentPane.add(lblNewLabel_1_1);
		
		elementbox = new JTextField();
		elementbox.setColumns(10);
		elementbox.setBounds(155, 110, 59, 20);
		contentPane.add(elementbox);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("POSITION :");
		lblNewLabel_1_1_1.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_1_1.setBounds(217, 113, 86, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		posbox = new JTextField();
		posbox.setColumns(10);
		posbox.setBounds(286, 110, 59, 20);
		contentPane.add(posbox);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insrtion code
				//converting the sting elemnt to interger
				int ele = Integer.valueOf(elementbox.getText());
				int pos = Integer.valueOf(posbox.getText());
				arr[pos]=ele;
				//message to print
				String message = "Element " +ele+ "is inseted at" +pos;
				JOptionPane.showMessageDialog(contentPane, message);
				
				//setting the text box for next element stop displayiing the previsously insetred element
				elementbox.setText("");
				posbox.setText("");
				
				
			}
		});
		insert.setBounds(365, 109, 79, 23);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("ENTER THE POSITION :");
		lblNewLabel_1_1_2.setForeground(new Color(255, 128, 0));
		lblNewLabel_1_1_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_1_2.setBounds(10, 153, 147, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		deletebox = new JTextField();
		deletebox.setColumns(10);
		deletebox.setBounds(155, 150, 59, 20);
		contentPane.add(deletebox);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//deletion codee
				
				int pos= Integer.valueOf(deletebox.getText());
				arr[pos]=0;
				//message on dialogbox
				String message = "Element deleted @ position "  +pos;
				JOptionPane.showMessageDialog(contentPane, message);
				//vanish the deleted element setting elemet
				deletebox.setText("");
			}
		});
		delete.setBounds(244, 149, 79, 23);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code displaybox
				String msg = "";
				for(int i=0;i<=arr.length-1;i++) {
					//we are printing the arr[i] as message gormate on text box beecause if we print te
					//the element as it is it will overridden like 100,100,100
					msg=msg+ " "+arr[i];
				
				}
				displaybox.setText(msg);
			}
		});
		display.setBounds(180, 217, 107, 23);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(123, 256, 222, 20);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
