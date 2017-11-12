package test;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

import com.touche.client.contactbook.DatabaseReaderBehaviour;


public class DatabaseReaderBehaviourTest {
	
	private  static final String CONNECTION_STRING = "	jdbc:mysql://HOST/DATABASE/contactTable";
	
	private DatabaseReaderBehaviour databaseReaderBehaviour;
	
	@Before
	public void setUp() throws Exception {		
		databaseReaderBehaviour = new DatabaseReaderBehaviour();
	}
	
	@Test
	public final void testGetLinesFromSource(){		
		List<String> linesFromSource = databaseReaderBehaviour.readSource(CONNECTION_STRING);
		assertEquals(null, linesFromSource);
	}
	
	
}
