package gameMechanics;

import accountService.AccountServiceImpl;
import base.Address;
import base.MessageSystem;
import messageSystem.MessageSystemImpl;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;
import resourceSystem.DatabaseResource;
import resourceSystem.ResourceFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class MsgSaveResultTest {

	@Test
	public void testMsgSaveResult() throws InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException, ParserConfigurationException, SAXException, IOException {
        ResourceFactory factory = ResourceFactory.getInstance();
		MessageSystem ms = new MessageSystemImpl();
		AccountServiceImpl accountServiceImpl = new AccountServiceImpl(ms, (DatabaseResource)factory.get("DatabaseResource.xml"));
		ms.addService(accountServiceImpl);
		MsgSaveResult msgSaveResult = new MsgSaveResult(new Address(), new Address(), 1, 100500);
		msgSaveResult.exec(accountServiceImpl);		
		assertNotNull(msgSaveResult);
	}

	@Test
	public void testGetTo() {
		MsgSaveResult msgSaveResult = new MsgSaveResult(new Address(), new Address(), 1, 100500);
		assertNotNull(msgSaveResult.getTo());
	}
}
