package com.touche.client.contactbook.messagesender;

import java.util.List;

public interface SendMessageBehaviour{

	public boolean sendMessage(String message, String subject, String destination);
	public boolean sendBirthdayMessage(List<String> contacts);
	public boolean sendWelcomeMessage(List<String> contacts);
}
