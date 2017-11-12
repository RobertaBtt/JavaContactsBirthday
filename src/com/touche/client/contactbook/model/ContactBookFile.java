/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.model;

import com.touche.client.contactbook.messagesender.*;
import com.touche.client.contactbook.sourcereader.*;


/*This class has FileReader as ReadeSource*/
/*This class has MailMessage as SendMessage*/


public class ContactBookFile extends ContactBook {

	public ContactBookFile(){
		setReadSourceBehaviour(new FileReaderBehaviour());
		setSendMessageBehaviour(new SendMessageMailBehaviour());
	}
	
}
