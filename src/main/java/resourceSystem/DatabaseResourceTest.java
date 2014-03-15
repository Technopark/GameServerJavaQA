package resourceSystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseResourceTest {

    @Test
    public void testDatabaseResourse() {
        DatabaseResource dbResourse = new DatabaseResource();
        assertNull(dbResourse.getDialect());
        assertNull(dbResourse.getDriver_class());
        assertNull(dbResourse.getPassword());
        assertNull(dbResourse.getShow_sql());
        assertNull(dbResourse.getStatement());
        assertNull(dbResourse.getUrl());
        assertNull(dbResourse.getUsername());
    }
}
