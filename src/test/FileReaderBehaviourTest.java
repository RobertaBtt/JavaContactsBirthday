package test;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

import com.touche.client.contactbook.sourcereader.FileReaderBehaviour;


public class FileReaderBehaviourTest {
	
	private  static final String FILE_EMPTY = "EmptyTestInput.txt";
	private  static final String FILE = "contacts.txt";
	private  static final int NUMBER_OF_LINES = 10;
	private FileReaderBehaviour fileReaderBehaviour;
	
	@Before
	public void setUp() throws Exception {		
		fileReaderBehaviour = new FileReaderBehaviour();
	}
	
	@Test
	public final void testGetLinesFromSource(){		
		List<String> linesFromSource = fileReaderBehaviour.readSource(FILE);
		assertEquals(NUMBER_OF_LINES, linesFromSource.size());
	}
	
	@Test
	public final void testGetLinesFromSourceEmpty(){		
		List<String> linesFromSource = fileReaderBehaviour.readSource(FILE_EMPTY);
		assertEquals(0, linesFromSource.size());
	}
	
	@Test
	public final void testGetFirstLine(){		
		List<String> linesFromSource = fileReaderBehaviour.readSource(FILE);
		assertEquals("Doe, John, 1982/10/08, john.doe@foobar.com", linesFromSource.get(1));
	}
}
