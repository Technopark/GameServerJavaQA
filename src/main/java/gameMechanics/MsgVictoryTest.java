package gameMechanics;

import base.MessageSystem;
import frontend.FrontendImpl;
import junit.framework.Assert;
import messageSystem.MessageSystemImpl;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;
import resourceSystem.GameSessionResource;
import resourceSystem.ResourceFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class MsgVictoryTest {

	@Test
	public void testMsgVictory() throws InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException, ParserConfigurationException, SAXException, IOException {
        ResourceFactory factory = ResourceFactory.getInstance();
		MessageSystem ms = new MessageSystemImpl();
		GameMechanic gameMechanic = new GameMechanicImpl(ms, (GameSessionResource)factory.get("GameResource.xml"));
		ms.addService(gameMechanic);
		FrontendImpl frontendImpl = new FrontendImpl(ms, (GameSessionResource)factory.get("GameResource.xml"));
		ms.addService(frontendImpl);

		MsgVictory msgVictory = new MsgVictory(gameMechanic.getAddress(), ms.getAddressService().getAddress(FrontendImpl.class), 1, 20, "�� �����������" + " ���� ��������" );
		msgVictory.exec(frontendImpl);
        Assert.assertNotNull(msgVictory.getTo());
    }
}
