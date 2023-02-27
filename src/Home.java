import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE THE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setBounds(82, 11, 264, 21);
		contentPane.add(lblNewLabel);
		
		JButton array1 = new JButton("ARRAY");
		array1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place array window opening here
				//object of array jfream
				//Array a=new Array();
				//a.setVisible(true);
				new Array().setVisible(true);
				
			}
		});
		array1.setBackground(new Color(128, 255, 0));
		array1.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		array1.setBounds(27, 66, 89, 23);
		contentPane.add(array1);
		
		JButton array3 = new JButton("QUEUE");
		array3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place queue window opening here
				
				new Queue().setVisible(true);
			}
		});
		array3.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		array3.setBackground(new Color(128, 255, 0));
		array3.setBounds(282, 67, 89, 23);
		contentPane.add(array3);
		
		JButton array2 = new JButton("STACK");
		array2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place stack window opening here
				new Stack().setVisible(true);
			}
		});
		array2.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		array2.setBackground(new Color(128, 255, 0));
		array2.setBounds(27, 135, 89, 23);
		contentPane.add(array2);
		
		JButton array4 = new JButton("CIRCULAR QUEUE");
		array4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place CQ window opening here
				new CircularQ().setVisible(true);
			}
		});
		array4.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		array4.setBackground(new Color(128, 255, 0));
		array4.setBounds(282, 136, 129, 23);
		contentPane.add(array4);
		
		JButton ll = new JButton(" SINGLY LINKED LIST");
		ll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place singly linked list window opening here
				new Slinked().setVisible(true);
			}
		});
		ll.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		ll.setBackground(new Color(128, 255, 0));
		ll.setBounds(51, 201, 143, 23);
		contentPane.add(ll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Place doubly linked list window opening here
				new Dlink().setVisible(true);
			}
		});
		dll.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 12));
		dll.setBackground(new Color(128, 255, 0));
		dll.setBounds(235, 201, 147, 23);
		contentPane.add(dll);
	}
}
