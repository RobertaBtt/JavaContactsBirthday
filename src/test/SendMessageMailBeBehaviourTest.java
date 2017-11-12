package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import com.touche.client.contactbook.messagesender.SendMessageMailBehaviour;


public class SendMessageMailBeBehaviourTest {
	
	private SendMessageMailBehaviour sendMessageMailBehaviour;
	
	@Before
	public void setUp() throws Exception {		
		sendMessageMailBehaviour = new SendMessageMailBehaviour();
	}
	
	@Test
	public final void testMailCorrectly(){	
		assertEquals(true, sendMessageMailBehaviour.sendMessage("Message Test", "Subject Test", "myMailBox@gmail.com"));		
	}
	
}
