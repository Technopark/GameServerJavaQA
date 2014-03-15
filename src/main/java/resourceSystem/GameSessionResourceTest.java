package resourceSystem;

import org.junit.Test;

import static junit.framework.Assert.*;

public class GameSessionResourceTest {

    @Test
    public void testGameSessionResource() {
        GameSessionResource gameSessionResource = new GameSessionResource();
        assertEquals(gameSessionResource.getCountGamers(), 0);
        assertEquals(gameSessionResource.getTime(), 0);
        gameSessionResource = new GameSessionResource(100, 100);
        assertEquals(gameSessionResource.getTime(), 100);
        assertEquals(gameSessionResource.getCountGamers(), 100);
    }
}
