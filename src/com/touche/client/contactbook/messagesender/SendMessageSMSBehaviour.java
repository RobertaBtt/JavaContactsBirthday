package com.touche.client.contactbook.messagesender;

import static java.lang.System.out;

import java.util.List;

public class SendMessageSMSBehaviour implements SendMessageBehaviour {

	public boolean sendMessage(String message, String subject, String destination) {
		
		try{
			out.println("Sending SMS to " + destination);			
		}catch (Exception ex){
			out.println("Error while sending SMS " + ex.getMessage());
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
	
	
	public boolean isNewRegisteredContact(String contactTocheck){
		return true;
	}
	
	
}
