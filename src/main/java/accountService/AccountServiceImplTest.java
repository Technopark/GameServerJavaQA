package accountService;

import base.MessageSystem;
import messageSystem.MessageSystemImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountServiceImplTest {

    private MessageSystem ms;
    private AccountServiceImpl accountService;

    @Before
    public void testBefore() {
        ms = new MessageSystemImpl();
        accountService = new AccountServiceImpl(ms, null);
    }

    @Test
    public void testAccountServiceImplMs() {
        Assert.assertEquals(accountService.getMessageSystem(), ms);
    }

    @Test
    public void testAccountServiceImplResource() {
        Assert.assertNull(accountService.getResource());
    }

    @Test
    public void testAccountServiceImplAddress() {
        Assert.assertNotNull(accountService.getAddress());
    }

    @Test
    public void testInitGamer() {
        accountService.initGamer(null, 100);
        Assert.assertEquals(accountService.getUserId().get(null).intValue(), accountService.getUserIdGenerator().intValue());
    }
}
