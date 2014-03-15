package messageSystem;

import base.Abonent;
import base.Address;
import base.AddressService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;


public class AddressServiceImpl implements AddressService {
    private Map<Class<?>, ConcurrentLinkedQueue<Address>> addresses = new HashMap<Class<?>, ConcurrentLinkedQueue<Address>>();

    public Address getAddress(Class<?> abonentClass) {
        return addresses.get(abonentClass).peek();
    }

    public void setAddress(Abonent abonent) {
        if (!addresses.containsKey(abonent.getClass())) {
            addresses.put(abonent.getClass(), new ConcurrentLinkedQueue<Address>());
        }
        addresses.get(abonent.getClass()).add(abonent.getAddress());
    }

    public ConcurrentLinkedQueue<Address> getServiceAddressesQueue(Abonent abonent) {
        return addresses.get(abonent.getClass());
    }
}
