package resourceSystem;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class VirtualFileSystemImpl implements VirtualFileSystem {


    private String root;
    private File file;
    private static VirtualFileSystemImpl virtualFileSystemImpl;

    public static VirtualFileSystemImpl getInstance() {
        if (virtualFileSystemImpl == null) {
            virtualFileSystemImpl = new VirtualFileSystemImpl();
        }
        return virtualFileSystemImpl;
    }

    private VirtualFileSystemImpl() {
        this.root = System.getProperty("user.dir") + File.separator + "data";
    }


    private class FileIterator implements Iterator<String> {

        private Queue<File> files = new LinkedList<File>();

        public FileIterator(String path) {
            files.add(new File(root + path));
        }

        public boolean hasNext() {
            return !files.isEmpty();
        }

        public String next() {
            File file = files.peek();
            if (file.isDirectory()) {
                try {
                    for (File subFile : file.listFiles()) {
                        files.add(subFile);
                    }
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
            return files.poll().getAbsolutePath();
        }

        public void remove() {
        }
    }

    public Iterator<String> getIterator(String startDir) {
        return new FileIterator(startDir);
    }

    public static VirtualFileSystemImpl getVirtualFileSystemImpl() {
        return virtualFileSystemImpl;
    }

    public  String getRoot() {
        return root;
    }
}
