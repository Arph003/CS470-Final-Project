import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.awt.event.ActionEvent;

public class LoginWindowGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblAccountNo;
	private JLabel lblPassword;
	private JTextField txtAccountNo;
	private JTextField txtPassword;
	private JButton btnLogIn;

	public LoginWindowGUI() {
		setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		setTitle("Login Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAccountNo = new JLabel("Account no:");
		lblAccountNo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblAccountNo.setBounds(90, 52, 139, 33);
		contentPane.add(lblAccountNo);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPassword.setBounds(90, 118, 123, 26);
		contentPane.add(lblPassword);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int acct = Integer.parseInt(txtAccountNo.getText());
				int pass = Integer.parseInt(txtPassword.getText());
				btn_log_in_click(acct, pass);
			}
		});
		btnLogIn.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnLogIn.setBounds(161, 185, 130, 42);
		contentPane.add(btnLogIn);
		
		txtAccountNo = new JTextField();
		txtAccountNo.setBounds(225, 58, 130, 26);
		contentPane.add(txtAccountNo);
		txtAccountNo.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(225, 121, 130, 26);
		contentPane.add(txtPassword);
	}
	public void btn_log_in_click(int account, int password){
		if(password == 123) {
			MainGUI m1 = new MainGUI(account, "AccountNo" + account + ".txt");
			m1.show();
		}else {
			System.out.println("Wrong password. Please re-enter.");
			txtAccountNo.setText("");
			txtPassword.setText("");
		}
	}
}
