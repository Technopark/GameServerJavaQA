package gameMechanics;

import base.Address;
import base.MessageSystem;
import frontend.FrontendImpl;
import messageSystem.MessageSystemImpl;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;
import resourceSystem.GameSessionResource;
import resourceSystem.ResourceFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class MsgStartOrStopGameTest {

    @Test
    public void testMsgStartOrStopGame() throws InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException, ParserConfigurationException, SAXException, IOException {
        ResourceFactory factory = ResourceFactory.getInstance();
        MessageSystem ms = new MessageSystemImpl();
        FrontendImpl frontendImpl = new FrontendImpl(ms, (GameSessionResource) factory.get("GameResource.xml"));
        ms.addService(frontendImpl);
        MsgStartOrStopGame msg = new MsgStartOrStopGame(new Address(), new Address(), true);
        msg.exec(frontendImpl);
        assertNotNull(msg.getTo());
    }

}
