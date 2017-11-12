/**
 * @author RobertaBtt
 *
 */
package com.touche.client.contactbook.model;

import com.touche.client.contactbook.sourcereader.*;


public abstract class ContactBook{
	
	SourceReaderBehaviour sourceReaderBehaviour;
	
	public ContactBook() {
		
	}
	
	/*Setting class that performs Actions*/
	public void setReadSourceBehaviour(SourceReaderBehaviour srb) {
		sourceReaderBehaviour = srb;
	}
	
	public SourceReaderBehaviour getSourceReaderBehaviour(){
		return sourceReaderBehaviour;
	}
	
	

}
