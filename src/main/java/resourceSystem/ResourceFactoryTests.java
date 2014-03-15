package resourceSystem;


import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ResourceFactoryTests {

    @Test
    public void testNewInstance() throws ParserConfigurationException, SAXException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        ResourceFactory resourceFactory = ResourceFactory.getInstance();
        Assert.assertEquals(resourceFactory, ResourceFactory.getResourceFactory());
        Assert.assertEquals(resourceFactory.getVfs(), VirtualFileSystemImpl.getVirtualFileSystemImpl());
        Assert.assertNotNull(resourceFactory.getResources());
        Assert.assertNull(resourceFactory.get("myFile.xml"));
        Assert.assertNotNull(resourceFactory.get("GameResource.xml"));
    }

    @Test
    public void testGetResourceFromFile() throws ParserConfigurationException, SAXException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException, DOMException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        ResourceFactory resourceFactory = ResourceFactory.getInstance();
        File file = new File("data//GameResource.xml");
        Assert.assertNotNull(resourceFactory.getResourcesFromFile(file));
    }
}
