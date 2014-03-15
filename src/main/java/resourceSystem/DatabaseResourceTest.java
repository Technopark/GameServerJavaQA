package resourceSystem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseResourceTest {

    private DatabaseResource dbResourse;

    @Before
    public void testBefore() {
        dbResourse = new DatabaseResource();
    }

    @Test
    public void testDatabaseResourseDialect() {
        assertNull(dbResourse.getDialect());
    }

    @Test
    public void testDatabaseResourseDriver_class() {
        assertNull(dbResourse.getDriver_class());
    }

    @Test
    public void testDatabaseResoursePassword() {
        assertNull(dbResourse.getPassword());
    }

    @Test
    public void testDatabaseResourseShow_sql() {
        assertNull(dbResourse.getShow_sql());
    }

    @Test
    public void testDatabaseResourseStatement() {
        assertNull(dbResourse.getStatement());
    }

    @Test
    public void testDatabaseResourseUrl() {
        assertNull(dbResourse.getUrl());
    }

    @Test
    public void testDatabaseResourseUsername() {
        assertNull(dbResourse.getUsername());
    }

}
