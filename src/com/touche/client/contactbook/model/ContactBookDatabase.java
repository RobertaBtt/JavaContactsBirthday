/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.model;

import com.touche.client.contactbook.sourcereader.*;


public class ContactBookDatabase extends ContactBook {

	public ContactBookDatabase(){
		setReadSourceBehaviour(new DatabaseReaderBehaviour());
		
	}
	
}
