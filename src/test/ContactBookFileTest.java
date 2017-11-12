package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.touche.client.contactbook.model.ContactBookFile;
import com.touche.client.contactbook.sourcereader.FileReaderBehaviour;


public class ContactBookFileTest {
	
	private ContactBookFile contactBookFile;
	
	@Before
	public void setUp() throws Exception {
		contactBookFile = new ContactBookFile();
		
	}
	
	@Test
	public final void testGetLinesFromSource(){		
		assertEquals(FileReaderBehaviour.class, contactBookFile.getSourceReaderBehaviour().getClass());
		
	}
	
	
}
