package gameMechanics;

import base.MessageSystem;
import messageSystem.MessageSystemImpl;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;
import resourceSystem.GameSessionResource;
import resourceSystem.ResourceFactory;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static org.junit.Assert.*;

public class MsgSetGamerNamesTest {

    @Test
    public void testMsgSetGamerNames() throws InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException, ParserConfigurationException, SAXException, IOException {
        ResourceFactory factory = ResourceFactory.getInstance();
        MessageSystem ms = new MessageSystemImpl();
        GameMechanicImpl gameMechanic = new GameMechanicImpl(ms, (GameSessionResource) factory.get("GameResource.xml"));
        ms.addService(gameMechanic);
        assertNotNull(gameMechanic.getAddress());
    }

}
