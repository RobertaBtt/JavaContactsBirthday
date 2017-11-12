/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.model;

import com.touche.client.contactbook.messagesender.*;
import com.touche.client.contactbook.sourcereader.*;


public abstract class ContactBook{
	
	SourceReaderBehaviour sourceReaderBehaviour;
	SendMessageBehaviour sendMessageBehaviour;
	
	public ContactBook() {
		
	}
	
	/*Setting classes that performs Actions*/
	public void setReadSourceBehaviour(SourceReaderBehaviour srb) {
		sourceReaderBehaviour = srb;
	}
	
	public void setSendMessageBehaviour(SendMessageBehaviour smb) {
		sendMessageBehaviour = smb;
	}
	
	
	/*Check what classes have been setted*/
	public SourceReaderBehaviour getSourceReaderBehaviour(){
		return sourceReaderBehaviour;
	}
	
	public SendMessageBehaviour getSendMessageBehaviour(){
		return sendMessageBehaviour;
	}
	
	

}
