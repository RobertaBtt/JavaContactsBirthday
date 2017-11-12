package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.touche.client.contactbook.messagesender.MessageUtilities;


public class MessageUtilitiesTest {
	
	
	@Before
	public void setUp() throws Exception {		
	
	}
	
	@Test
	public final void testNewUser(){		
		assertEquals(true,  MessageUtilities.isNewRegisteredContact("newRegisteredUser@mail.com"));		
	}
	
	@Test
	public final void testIsBirthday(){		
		assertEquals(false,  MessageUtilities.isTodayBirth("04-23", "YYY-mm-dd"));
		
	}
	
	
}
