package umbcs680.filesystem;

import java.time.LocalDateTime;
import java.util.Dictionary;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileSystemTest {

    private static umbcs680.filesystem.FileSystem fs;

    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS();
    }
    
    @Test
    public void instanceCheck(){
        assertNotNull(fs);
    }

    @Test
    public void rootCountCheck(){
        assertEquals(2,fs.getRootCount());
    }


    @Test
    public void rootsCheck(){
        LinkedList<Directory> expectedRoots = new LinkedList<Directory>();
        expectedRoots.add(new Directory(null,"CDrive",0,LocalDateTime.now()));
        expectedRoots.add(new Directory(null,"FDrive",0,LocalDateTime.now()));
        assertEquals(expectedRoots.getFirst().getName(),fs.getRootDirs().getFirst().getName());
    }

    
    
}