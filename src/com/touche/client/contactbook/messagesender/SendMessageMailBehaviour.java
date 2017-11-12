package com.touche.client.contactbook.messagesender;

import static java.lang.System.out;

import java.util.List;

public class SendMessageMailBehaviour implements SendMessageBehaviour {

	public boolean sendMessage(String message, String subject, String destination) {
		
		try{
			out.println("Sending e-Mail with Subject[" + subject+ "] to " + destination);			
		}catch (Exception ex){
			out.println("Error while sending e-Mail " + ex.getMessage());
			return false;
		}
		
		return true;
		
	}

	public boolean sendBirthdayMessage(List<String> contacts) {
		
		for (String contact : contacts){
			String[] splittedString = contact.split(", ");
			String dateOfBirth = splittedString[2];
			if (MessageUtilities.isTodayBirth(dateOfBirth.substring(5), "yyyy/MM/dd")){
				sendMessage("Happy birthday, dear " + splittedString[1]+" !", "Happy Birthday!", splittedString[3]);
			}
		}
		return true;		
	}
	
	public boolean sendWelcomeMessage(List<String> contacts) {
		
		for (String contact : contacts){
			String[] splittedString = contact.split(", ");

			if (MessageUtilities.isNewRegisteredContact(splittedString[3])){
				sendMessage("Welcome " + splittedString[1]+" !", "Welcome", splittedString[3]);
			}
		}

		return true;
	}
	
	
}
