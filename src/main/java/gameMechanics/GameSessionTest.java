package gameMechanics;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameSessionTest {

    @Test
    public void testSetCountClicks() {
        GameSession gameSession = new GameSession(1);
        gameSession.setCountClicks(1);
        GameSession mockGameSession = mock(GameSession.class);
        when(mockGameSession.getCountClicks()).thenReturn(1);
        assertEquals(gameSession.getCountClicks(), mockGameSession.getCountClicks());
    }

}
