package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.touche.client.contactbook.messagesender.SendMessageSMSBehaviour;


public class SendMessageSMSBehaviourTest {
	
	private SendMessageSMSBehaviour sendMessageSMSBehaviour;
	
	@Before
	public void setUp() throws Exception {		
		sendMessageSMSBehaviour = new SendMessageSMSBehaviour();
	}
	
	@Test
	public final void testMailCorrectly(){	
		assertEquals(true, sendMessageSMSBehaviour.sendMessage("Message Test", "Subject Test", "myMailBox@gmail.com"));		
	}
	
}
