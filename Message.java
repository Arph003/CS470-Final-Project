import java.io.*;
import java.util.*;
import java.lang.*;

public class Message implements Serializable{
	private String name;
	private String content;
	private String day;
	private String mood;  
	private static int number_of_messages = 0;
	
	public Message(String n, String c, String d, String l){
		name = n;
		content = c;
		day = d;
		mood = l;
		number_of_messages++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMood() {
		return mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
		
	}
	
	public static int getNumber_of_messages() {
		return number_of_messages;
	}

	public static void setNumber_of_messages(int number_of_messages) {
		Message.number_of_messages = number_of_messages;
	}

	
	
	
}
