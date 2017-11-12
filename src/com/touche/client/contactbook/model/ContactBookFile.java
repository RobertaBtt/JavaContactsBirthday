/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.model;

import com.touche.client.contactbook.sourcereader.*;

public class ContactBookFile extends ContactBook {

	public ContactBookFile(){
		setReadSourceBehaviour(new FileReaderBehaviour());
	}
	
}
