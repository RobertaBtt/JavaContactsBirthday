package com.touche.client.contactbook.main;
import java.util.List;

import com.touche.client.contactbook.model.ContactBookDatabase;
import com.touche.client.contactbook.model.ContactBookFile;


public class Main {

	
	public static void main(String[] args) {

		String source = args[0];
		//ContactBookFile contactBookFile = new ContactBookFile();
		ContactBookDatabase contactBookFile = new ContactBookDatabase();
		List<String>contacts = contactBookFile.performReadSource(source);
		contactBookFile.performSendBirthdayMessage(contacts);
		
	}

}
