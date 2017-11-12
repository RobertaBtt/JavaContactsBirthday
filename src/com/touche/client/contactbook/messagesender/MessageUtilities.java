package com.touche.client.contactbook.messagesender;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MessageUtilities {

	public static boolean isTodayBirth(String dateToCheck, String formatDate){
		
		String timeStamp = new SimpleDateFormat(formatDate).format(Calendar.getInstance().getTime());
		
		if (timeStamp.substring(5).equalsIgnoreCase(dateToCheck))
			return true;
		return false;
	}
	
	public static boolean isNewRegisteredContact(String contactTocheck){
		return true;
	}
	
}
