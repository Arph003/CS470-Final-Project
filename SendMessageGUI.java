import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.lang.*;

public class SendMessageGUI extends JFrame implements Serializable{
	private JPanel contentPane;
	private JLabel lblTo;
	private JTextField txtName;
	private JTextField txtMessageContent;
	private JLabel lblDay;
	private JSeparator separator;
	private JRadioButton rdbtnMonday;
	private JRadioButton rdbtnTuesday;
	private JRadioButton rdbtnWednesday;
	private JRadioButton rdbtnThursday;
	private JRadioButton rdbtnFriday;
	private JRadioButton rdbtnSaturday;
	private JRadioButton rdbtnSunday;
	private JSeparator separator_1;
	private JLabel lblMood;
	private JCheckBox chckbxHappy;
	private JCheckBox chckbxSad;
	private JCheckBox chckbxCalm;
	private JCheckBox chckbxSleepy;
	private JCheckBox chckbxAngry;
	private JSeparator separator_1_1;
	private JButton btnSend;

	public SendMessageGUI(int account, String filename) {
		setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		setTitle("Send Message");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 583, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTo = new JLabel("To: ");
		lblTo.setBounds(6, 6, 31, 16);
		contentPane.add(lblTo);
		
		txtName = new JTextField();
		txtName.setBounds(35, 1, 130, 26);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtMessageContent = new JTextField();
		txtMessageContent.setBounds(6, 26, 571, 181);
		contentPane.add(txtMessageContent);
		txtMessageContent.setColumns(10);
		
		lblDay = new JLabel("Today's Day:");
		lblDay.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblDay.setBounds(6, 219, 112, 16);
		contentPane.add(lblDay);
		
		separator = new JSeparator();
		separator.setBounds(6, 208, 571, 16);
		contentPane.add(separator);
		
		rdbtnMonday = new JRadioButton("Monday");
		rdbtnMonday.setBounds(0, 237, 81, 23);
		contentPane.add(rdbtnMonday);
		
		rdbtnTuesday = new JRadioButton("Tuesday");
		rdbtnTuesday.setBounds(77, 237, 88, 23);
		contentPane.add(rdbtnTuesday);
		
		rdbtnWednesday = new JRadioButton("Wednesday");
		rdbtnWednesday.setBounds(156, 237, 102, 23);
		contentPane.add(rdbtnWednesday);
		
		rdbtnThursday = new JRadioButton("Thursday");
		rdbtnThursday.setBounds(253, 236, 94, 23);
		contentPane.add(rdbtnThursday);
		
		rdbtnFriday = new JRadioButton("Friday");
		rdbtnFriday.setBounds(340, 237, 70, 23);
		contentPane.add(rdbtnFriday);
		
		rdbtnSaturday = new JRadioButton("Saturday");
		rdbtnSaturday.setBounds(410, 237, 88, 23);
		contentPane.add(rdbtnSaturday);
		
		rdbtnSunday = new JRadioButton("Sunday");
		rdbtnSunday.setBounds(492, 237, 85, 23);
		contentPane.add(rdbtnSunday);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(6, 264, 571, 16);
		contentPane.add(separator_1);
		
		lblMood = new JLabel("Today's Mood:");
		lblMood.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMood.setBounds(6, 272, 112, 16);
		contentPane.add(lblMood);
		
		chckbxHappy = new JCheckBox("Happy");
		chckbxHappy.setFont(new Font("Dialog", Font.PLAIN, 15));
		chckbxHappy.setBounds(0, 292, 81, 45);
		contentPane.add(chckbxHappy);
		
		chckbxSad = new JCheckBox("Sad");
		chckbxSad.setFont(new Font("Dialog", Font.PLAIN, 15));
		chckbxSad.setBounds(77, 292, 81, 45);
		contentPane.add(chckbxSad);
		
		chckbxCalm = new JCheckBox("Calm");
		chckbxCalm.setFont(new Font("Dialog", Font.PLAIN, 15));
		chckbxCalm.setBounds(156, 292, 81, 45);
		contentPane.add(chckbxCalm);
		
		chckbxSleepy = new JCheckBox("Sleepy");
		chckbxSleepy.setFont(new Font("Dialog", Font.PLAIN, 15));
		chckbxSleepy.setBounds(241, 292, 84, 45);
		contentPane.add(chckbxSleepy);
		
		chckbxAngry = new JCheckBox("Angry");
		chckbxAngry.setFont(new Font("Dialog", Font.PLAIN, 15));
		chckbxAngry.setBounds(323, 292, 87, 45);
		contentPane.add(chckbxAngry);
		
		separator_1_1 = new JSeparator();
		separator_1_1.setBounds(6, 330, 571, 16);
		contentPane.add(separator_1_1);
		
		btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String content = txtMessageContent.getText();
				String day = null;
				if(rdbtnMonday.isSelected()) {
					day = "Monday";
				}else if(rdbtnTuesday.isSelected()) {
					day = "Tuesday";
				}else if(rdbtnWednesday.isSelected()) {
					day = "Wednesday";
				}else if(rdbtnThursday.isSelected()) {
					day = "Thursday";
				}else if(rdbtnFriday.isSelected()) {
					day = "Friday";
				}else if(rdbtnSaturday.isSelected()) {
					day = "Saturday";
				}else if(rdbtnSunday.isSelected()) {
					day = "Sunday";
				}
//				List<String> moodList=new ArrayList<String>();  
				String moodList = "Today's mood: ";
					if(chckbxHappy.isSelected()) 
						moodList += "Happy ";
					if(chckbxSad.isSelected()) 
						moodList += "Sad ";
					if(chckbxCalm.isSelected()) 
						moodList += "Calm ";
					if(chckbxSleepy.isSelected()) 
						moodList += "Sleepy ";
					if(chckbxAngry.isSelected()) 
						moodList += "Angry ";
				
				Message m = new Message(name, content, day, moodList);
				
				//Write to a txt file
				File f = new File(filename);
				try {
				   FileWriter fw = new FileWriter(f, true);
				   fw.write("To: " + m.getName() + "\n"
						   + m.getContent() + "\n"
						   + "Today's day: " + m.getDay() + "\n"
						   + m.getMood() + "\n"
						   + "-------------------------------------\n");
				   fw.close();
				} catch (Exception ex) {
				    System.out.println(ex);
				}
				dispose();
			}
		});
		btnSend.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		btnSend.setBounds(460, 358, 117, 29);
		contentPane.add(btnSend);
	}
}
