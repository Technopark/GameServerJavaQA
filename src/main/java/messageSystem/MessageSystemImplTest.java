package messageSystem;

import base.Abonent;
import base.MessageSystem;
import databaseService.DatabaseServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class MessageSystemImplTest {

    @Test
    public void testMessageSystemImpl() {
        MessageSystemImpl messageSystem = new MessageSystemImpl();
        MessageSystem ms = new MessageSystemImpl();
        Abonent abonent = new DatabaseServiceImpl(ms, null);
        messageSystem.addService(abonent);
        Assert.assertNotNull(messageSystem.getAddressService());
        Assert.assertNotNull(messageSystem.getMessages());
    }
}
