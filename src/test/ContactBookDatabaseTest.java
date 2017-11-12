package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.touche.client.contactbook.messagesender.SendMessageSMSBehaviour;
import com.touche.client.contactbook.model.ContactBookDatabase;
import com.touche.client.contactbook.sourcereader.DatabaseReaderBehaviour;


public class ContactBookDatabaseTest {
	
	private ContactBookDatabase contactBookDatabase;
	
	@Before
	public void setUp() throws Exception {
		contactBookDatabase = new ContactBookDatabase();		
	}
	
	@Test
	public final void testSourceReaderClass(){		
		assertEquals(DatabaseReaderBehaviour.class, contactBookDatabase.getSourceReaderBehaviour().getClass());		
	}
	
	@Test
	public final void testSendMessageBehaviourClass(){		
		assertEquals(SendMessageSMSBehaviour.class, contactBookDatabase.getSendMessageBehaviour().getClass());		
	}
	
	
}

