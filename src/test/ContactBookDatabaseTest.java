package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.touche.client.contactbook.model.ContactBookDatabase;
import com.touche.client.contactbook.sourcereader.DatabaseReaderBehaviour;


public class ContactBookDatabaseTest {
	
	private ContactBookDatabase contactBookDatabase;
	
	@Before
	public void setUp() throws Exception {
		contactBookDatabase = new ContactBookDatabase();		
	}
	
	@Test
	public final void testGetLinesFromSource(){		
		assertEquals(DatabaseReaderBehaviour.class, contactBookDatabase.getSourceReaderBehaviour().getClass());
		
	}
	
	
}
