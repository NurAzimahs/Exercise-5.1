import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.Font;

public class AddMinus {

	private JFrame frame;
	private JTextField textFieldInteger1;
	private JTextField textFieldInteger2;
	private JButton AddButton;
	private JButton MinusButton;
	private JLabel Integer1Label;
	private JLabel Integer2Label;
	private JLabel AnswerLabel;
	private JTextField textFieldAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMinus window = new AddMinus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddMinus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		AddButton = new JButton("ADD");
		AddButton.setBackground(Color.PINK);
		AddButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		AddButton.setForeground(Color.MAGENTA);
		AddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldInteger1.getText());
					no2 = Integer.parseInt(textFieldInteger2.getText());
					ans = no1 + no2 ;
					textFieldAnswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong input !! Please insert number only .");
				}
			}
		});
		AddButton.setBounds(82, 149, 106, 33);
		frame.getContentPane().add(AddButton);
		
		MinusButton = new JButton("MINUS");
		MinusButton.setBackground(Color.PINK);
		MinusButton.setForeground(Color.MAGENTA);
		MinusButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		MinusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no1, no2, ans;
				try {
					no1 = Integer.parseInt(textFieldInteger1.getText());
					no2 = Integer.parseInt(textFieldInteger2.getText());
					ans = no1 - no2 ;
					textFieldAnswer.setText(Integer.toString(ans));
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(null, "Wrong input !! Please insert number only .");
				}
			}
		});
		MinusButton.setBounds(230, 149, 106, 33);
		frame.getContentPane().add(MinusButton);
		
		textFieldInteger1 = new JTextField();
		textFieldInteger1.setBackground(Color.WHITE);
		textFieldInteger1.setForeground(new Color(0, 0, 0));
		textFieldInteger1.setBounds(93, 82, 86, 28);
		frame.getContentPane().add(textFieldInteger1);
		textFieldInteger1.setColumns(10);
		
		textFieldInteger2 = new JTextField();
		textFieldInteger2.setColumns(10);
		textFieldInteger2.setBounds(239, 82, 86, 28);
		frame.getContentPane().add(textFieldInteger2);
		
		Integer1Label = new JLabel("Integer 1");
		Integer1Label.setFont(new Font("Serif", Font.BOLD, 15));
		Integer1Label.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		Integer1Label.setBounds(101, 33, 67, 20);
		frame.getContentPane().add(Integer1Label);
		
		Integer2Label = new JLabel("Integer 2");
		Integer2Label.setFont(new Font("Serif", Font.BOLD, 15));
		Integer2Label.setBounds(250, 24, 82, 38);
		frame.getContentPane().add(Integer2Label);
		
		AnswerLabel = new JLabel("ANSWER :");
		AnswerLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		AnswerLabel.setBounds(112, 211, 67, 20);
		frame.getContentPane().add(AnswerLabel);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(189, 207, 96, 28);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
	}

}
