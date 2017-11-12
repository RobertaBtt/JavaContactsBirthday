package com.touche.client.contactbook.messagesender;

import static java.lang.System.out;

import java.util.List;

public class SendMessageMailBehaviour implements SendMessageBehaviour {

	public boolean sendMessage(String message, String subject, String destination) {
		try{
			out.print("Sending e-Mail with Subject[" + subject+ "] to " + destination);			
		}catch (Exception ex){
			out.print("Error while sending e-Mail " + ex.getMessage());
			return false;
		}
		
		return true;
		
	}

	public boolean sendBirthdayMessage(List<String> contacts) {
		return true;		
	}
	
	public boolean sendWelcomeMessage(List<String> contacts) {
		return true;
	}
	
	
}
