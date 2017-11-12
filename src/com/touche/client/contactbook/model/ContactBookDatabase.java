/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.model;

import com.touche.client.contactbook.messagesender.SendMessageSMSBehaviour;
import com.touche.client.contactbook.sourcereader.*;


/*This class has DatabaseReader as ReadeSource*/
/*This class has SMSMessage as SendMessage*/

public class ContactBookDatabase extends ContactBook {

	public ContactBookDatabase(){
		setReadSourceBehaviour(new DatabaseReaderBehaviour());
		setSendMessageBehaviour(new SendMessageSMSBehaviour());		
	}
	
}
