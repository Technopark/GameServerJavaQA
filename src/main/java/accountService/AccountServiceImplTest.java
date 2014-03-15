package accountService;

import base.MessageSystem;
import messageSystem.MessageSystemImpl;
import org.junit.Assert;
import org.junit.Test;

public class AccountServiceImplTest {

    @Test
    public void testAccountServiceImpl() {
        MessageSystem ms = new MessageSystemImpl();
        AccountServiceImpl accountService = new AccountServiceImpl(ms, null);
        Assert.assertEquals(accountService.getMessageSystem(), ms);
        Assert.assertNull(accountService.getResource());
        Assert.assertNotNull(accountService.getAddress());
    }

    @Test
    public void testInitGamer() {
        MessageSystem ms = new MessageSystemImpl();
        AccountServiceImpl accountService = new AccountServiceImpl(ms, null);
        accountService.initGamer(null, 100);
        Assert.assertEquals(accountService.getUserId().get(null).intValue(), accountService.getUserIdGenerator().intValue());
    }
}
