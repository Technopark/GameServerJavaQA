package resourceSystem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ResourceFactoryTests {

    ResourceFactory resourceFactory;

    @Before
    public void testBefore() throws ParserConfigurationException, SAXException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        resourceFactory = ResourceFactory.getInstance();
    }

    @Test
    public void testNewInstance() {
        Assert.assertEquals(resourceFactory, ResourceFactory.getResourceFactory());
    }

    @Test
    public void testVfsInNewInstance() {
        Assert.assertEquals(resourceFactory.getVfs(), VirtualFileSystemImpl.getVirtualFileSystemImpl());
    }

    @Test
    public void testGetResourseInNewInstance() {
        Assert.assertNotNull(resourceFactory.getResources());
    }

    @Test
    public void testFileNotExist() {
        Assert.assertNull(resourceFactory.get("myFile.xml"));
    }

    @Test
    public void testFileExist() {
        Assert.assertNotNull(resourceFactory.get("GameResource.xml"));
    }

    @Test
    public void testGetResourceFromFile() throws ParserConfigurationException, SAXException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        File file = new File("data//GameResource.xml");
        Assert.assertNotNull(resourceFactory.getResourcesFromFile(file));
    }
}
