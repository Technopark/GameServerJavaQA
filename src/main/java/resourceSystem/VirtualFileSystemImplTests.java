package resourceSystem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class VirtualFileSystemImplTests {

    private VirtualFileSystemImpl virtualFileSystem;
    private Iterator<String> stringIterator;
    private Queue<File> files = new LinkedList<File>();

    @Before
    public void testBefore() {
        virtualFileSystem = VirtualFileSystemImpl.getInstance();
    }

    @Test
    public void testNewInstanceIsExist() {
        Assert.assertNotNull(virtualFileSystem);
    }

    @Test
    public void testNewInstance() {
        Assert.assertEquals(VirtualFileSystemImpl.getVirtualFileSystemImpl(), virtualFileSystem);
    }

    @Test
    public void testNewInstanceRoot() {
        Assert.assertEquals(virtualFileSystem.getRoot(), System.getProperty("user.dir") + File.separator + "data");
    }

    @Test
    public void testIterator() {
        stringIterator =  virtualFileSystem.getIterator("data");
        Assert.assertNotNull(stringIterator);
    }

    @Test
    public void testIteratorHasNext() {
        for(File file : files) {
            Assert.assertFalse(stringIterator.hasNext());
        }
    }

    @Test
    public void testIteratorNext() {
        for(File file : files) {
            Assert.assertNull(stringIterator.next());
        }
    }
}
