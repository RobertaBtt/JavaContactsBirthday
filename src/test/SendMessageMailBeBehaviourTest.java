package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import com.touche.client.contactbook.messagesender.SendMessageMailBehaviour;


public class SendMessageMailBeBehaviourTest {
	
	private SendMessageMailBehaviour sendMessageMailBehaviour;
	private List<String> contactsListTest = new ArrayList<String>();
	private List<String> voidContactList = new ArrayList<String>();
	
	@Before
	public void setUp() throws Exception {		
		sendMessageMailBehaviour = new SendMessageMailBehaviour();
		contactsListTest.add("Fowler , Mark, 1988/11/12, mark@foobar.com");
		voidContactList.add("");
	}
	
	@Test
	public final void testSendMailBirthdayCorrectly(){	
		assertEquals(true, sendMessageMailBehaviour.sendBirthdayMessage(contactsListTest));		
	}
	
	@Test
	public final void testSendNoEmail(){	
		assertEquals(false, sendMessageMailBehaviour.sendBirthdayMessage(null));		
	}
	
	@Test
	public final void testMessageCorrectly(){	
		assertEquals(true, sendMessageMailBehaviour.sendMessage("Message Test", "Subject Test", "myMailBox@gmail.com"));		
	}
	

	@Test
	public final void testSendMailBirthdayNotCorrectly(){	
		assertEquals(false, sendMessageMailBehaviour.sendBirthdayMessage(voidContactList));		
	}
	
	
	
}
