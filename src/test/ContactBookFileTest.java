package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.touche.client.contactbook.messagesender.SendMessageMailBehaviour;
import com.touche.client.contactbook.model.ContactBookFile;
import com.touche.client.contactbook.sourcereader.FileReaderBehaviour;

public class ContactBookFileTest {
	
	private ContactBookFile contactBookFile;
	
	@Before
	public void setUp() throws Exception {
		contactBookFile = new ContactBookFile();
		
	}
	
	@Test
	public final void testSourceReaderClass(){		
		assertEquals(FileReaderBehaviour.class, contactBookFile.getSourceReaderBehaviour().getClass());		
	}
	
	@Test
	public final void testSendMessageBehaviourClass(){		
		assertEquals(SendMessageMailBehaviour.class, contactBookFile.getSendMessageBehaviour().getClass());		
	}
	
	
}
