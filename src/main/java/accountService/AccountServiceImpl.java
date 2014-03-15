package accountService;


import base.AccountService;
import base.Address;
import base.MessageSystem;
import resourceSystem.Resource;
import utils.TimeHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AccountServiceImpl implements AccountService {

    private static final Map<String, Integer> userId = new HashMap<>();

    private Address address;
    private MessageSystem ms;
    private Resource resource;
    private static AtomicInteger userIdGenerator = new AtomicInteger();


    public AccountServiceImpl(MessageSystem ms, Resource resource) {
        this.ms = ms;
        this.resource = resource;
        address = new Address();
        ms.addService(this);
    }

    public void run() {
        while (true) {
            ms.execForAbonent(this);
            TimeHelper.sleep(100);
        }
    }

    public Object initGamer(String userName, Integer sessionId) {
        this.getAddress().setThreadUsed(true);
        if (userId.get(userName) == null){
            userId.put(userName, userIdGenerator.incrementAndGet());
        }
        this.getAddress().setThreadUsed(false);
        return null;
    }

    public Address getAddress() {
        return address;
    }

    public MessageSystem getMessageSystem() {
        return ms;
    }

    @Override
    public void saveResult(int id, int countClicks) {
            // TODO Auto-generated method stub

    }
}
