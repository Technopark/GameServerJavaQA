package messageSystem;

import accountService.AccountServiceImpl;
import base.Abonent;
import base.MessageSystem;
import databaseService.DatabaseServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class AddressServiceImplTest {

    @Test
    public void testAddressServiceImpl() {
        MessageSystem messageSystem = new MessageSystemImpl();
        Abonent abonent = new DatabaseServiceImpl(messageSystem, null);
        AddressServiceImpl addressService = new AddressServiceImpl();
        addressService.setAddress(abonent);
        Assert.assertNotNull(addressService.getServiceAddressesQueue(abonent));
    }
}
