package umbcs680.filesystem;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileTest {

    private static umbcs680.filesystem.FileSystem fs;

    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS();
    }
    
    @Test
    public void filCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        Directory desktop = CDrive.getSubDirectories().getFirst();
        File file1 = desktop.getFiles().getFirst();
        assertFalse(file1.isDirectory());
    }

    @Test
    public void fileNameCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        Directory desktop = CDrive.getSubDirectories().getFirst();
        File file1 = desktop.getFiles().getFirst();
        assertEquals("file1",file1.getName());
    }

    @Test
    public void fileSizeCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        Directory desktop = CDrive.getSubDirectories().getFirst();
        File file1 = desktop.getFiles().getFirst();
        assertEquals(20,file1.getSize());
    }

    @Test
    public void filePermissionCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        Directory desktop = CDrive.getSubDirectories().getFirst();
        File file1 = desktop.getFiles().getFirst();
        file1.changePermission("rwx-rwxrw-");
        assertEquals("rwx-rwxrw-",file1.getPermission());
    }
    
}