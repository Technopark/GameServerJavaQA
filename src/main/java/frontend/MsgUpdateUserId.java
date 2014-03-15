package frontend;

import base.Address;
import base.Frontend;
import messageSystem.MsgToFrontend;

import java.util.Calendar;

public class MsgUpdateUserId extends MsgToFrontend {

    final private int sessionId;
    final private int userId;
    final private int bestCountClick;
    final private Calendar lastVisit;

    public MsgUpdateUserId(Address from, Address to, int userId, int sessionId, int bestCountClick, Calendar lastVisit) {
        super(from, to);
        this.sessionId = sessionId;
        this.userId = userId;
        this.bestCountClick = bestCountClick;
        this.lastVisit = lastVisit;
    }

    public int getSessionId() {
        return sessionId;
    }

    public int getUserId() {
        return userId;
    }

    public int getBestCountClick() {
        return bestCountClick;
    }

    public Calendar getLastVisit() {
        return lastVisit;
    }

    public void exec(Frontend frontend) {
        frontend.updateUserId(sessionId, userId, bestCountClick, lastVisit);
    }
}
