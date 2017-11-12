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
		
		if (contacts!= null){
			for (String contact : contacts){
				try{
					String[] splittedString = contact.split(", ");
					
					String dateOfBirth = splittedString[2];
					String name = splittedString[1];
					String destination = splittedString[3];
					
					if (MessageUtilities.isTodayBirth(dateOfBirth.substring(5), "yyyy/MM/dd")){
						sendMessage("Happy birthday, dear " + name +" !", "Happy Birthday!", destination);
					}
				}
				catch(Exception ex){
					System.out.println("Check Data Content");
					return false;
				}
			}
		
			return true;		
		}
		return false;				
		
	}
	
	public boolean sendWelcomeMessage(List<String> contacts) {
		return true;
	}
	
	
	public boolean isNewRegisteredContact(String contactTocheck){
		return true;
	}
	
	
}
