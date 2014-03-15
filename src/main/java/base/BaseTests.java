package base;

import frontend.MsgGetUserId;
import org.junit.Assert;
import org.junit.Test;

public class BaseTests {

    @Test
    public void testAddress() {
        Address address = new Address();
        Assert.assertEquals(address.hashCode(), address.getSubscriberIdGenerator().intValue());
        address.setThreadUsed(true);
        Assert.assertEquals(address.isThreadUsed(), true);
    }

    @Test
    public void testMsg() {
        Address from = new Address();
        Address to = new Address();
        Msg msg = new MsgGetUserId(from, to, "chemisov", 10);
        Assert.assertEquals(msg.getFrom(), from);
        Assert.assertEquals(msg.getTo(), to);
    }
}
