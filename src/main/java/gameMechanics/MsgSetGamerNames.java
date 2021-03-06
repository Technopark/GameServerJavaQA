package gameMechanics;

import base.Address;
import frontend.MsgToGameMechanic;
import frontend.UserSession;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MsgSetGamerNames extends MsgToGameMechanic {

    private List<Integer> usersId;

    public MsgSetGamerNames(Address from, Address to, Collection<UserSession> names) {
        super(from, to);
        usersId = new ArrayList<>(names.size());
        for (UserSession userSession : names) {
            usersId.add(userSession.getUserId());
        }
    }

    public void exec(GameMechanic gameMechanic) {
        gameMechanic.setGamerNames(usersId);
    }

}
