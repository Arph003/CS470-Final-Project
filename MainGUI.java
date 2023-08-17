import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JButton btnSendMessage;
	private JButton btnMessageHistory;
	private JButton btnExit;
	
	public MainGUI(int account, String filename) {
		setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		setTitle("Message Sender");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSendMessage = new JButton("Send Message");
		btnSendMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_send_message_click(account, filename);
			}
		});
		btnSendMessage.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnSendMessage.setBounds(150, 34, 145, 35);
		contentPane.add(btnSendMessage);
		
		btnMessageHistory = new JButton("Message History");
		btnMessageHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_message_history_click(account, filename);
			}
		});
		btnMessageHistory.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnMessageHistory.setBounds(150, 108, 145, 35);
		contentPane.add(btnMessageHistory);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnExit.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnExit.setBounds(150, 183, 145, 35);
		contentPane.add(btnExit);
	}
	public void btn_send_message_click(int account, String filename) {
		SendMessageGUI s = new SendMessageGUI(account, filename);
		s.show();
	}
	public void btn_message_history_click(int account, String filename) {
		MessageHistoryGUI m = new MessageHistoryGUI(account, filename);
		m.show();
	}
}
