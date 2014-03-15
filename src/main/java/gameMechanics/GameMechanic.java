package gameMechanics;

import base.Abonent;

import java.util.List;

public interface GameMechanic extends Abonent {
    void setGamerNames(List<Integer> userIds);

    void processMessages(int userId, int countClicks);
}
