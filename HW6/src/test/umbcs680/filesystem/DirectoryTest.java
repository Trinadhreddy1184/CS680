package umbcs680.filesystem;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class DirectoryTest {
    private static umbcs680.filesystem.FileSystem fs;
    
    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS();
    }

    @Test
    public void driveCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        assertTrue(CDrive.isDirectory());
    }

    @Test
    public void toatalSizeCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        assertEquals(65,CDrive.getTotalSize());
        
    }

    @Test
    public void permissionCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        CDrive.changePermission("drwx-rwxrw-");
        assertEquals("drwx-rwxrw-",CDrive.getPermission());
    }

    @Test
    public void subDirectoryCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        Directory desktop = CDrive.getSubDirectories().getFirst();
        assertEquals("desktop1",desktop.getName());
    }

    @Test
    public void subDirectoryParentCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        Directory desktop = CDrive.getSubDirectories().getFirst();
        assertEquals(CDrive,desktop.getParent());
    }
    
    @Test
    public void subDirectoryChildrenCountCheck(){
        Directory CDrive = fs.getRootDirs().getFirst();
        Directory desktop = CDrive.getSubDirectories().getFirst();
        assertEquals(2,desktop.countChildren());
    }
    

    @Test
    public void removeChildCheck(){
        Directory FDrive = fs.getRootDirs().getLast();
        Directory desktop = FDrive.getSubDirectories().getFirst();
        FDrive.removeChild(desktop);
        assertEquals(0,FDrive.countChildren());
    }
    
    

}
