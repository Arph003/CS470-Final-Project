import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;

import javax.swing.JTextArea;

public class MessageHistoryGUI extends JFrame {

	private JPanel contentPane;
	private JTextArea txtHistory;
	private JButton btnBack;
	private String allMessageHistory;

	public MessageHistoryGUI(int account, String filename) {
		setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		setTitle("Message History");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHistory = new JTextArea();
		txtHistory.setBounds(6, 6, 538, 470);
		contentPane.add(txtHistory);
		
		//Read from a txt file
		File f = new File(filename);
		try {
			Scanner myScanner = new Scanner(f);
			while(myScanner.hasNext()) {
				txtHistory.append(myScanner.nextLine() + "\n");
			}
			myScanner.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnBack.setBounds(427, 488, 117, 29);
		contentPane.add(btnBack);
		
		
	}
}
