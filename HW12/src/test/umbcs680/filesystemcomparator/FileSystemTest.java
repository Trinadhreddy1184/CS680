package umbcs680.filesystemcomparator;

import java.time.LocalDateTime;
import java.util.Dictionary;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileSystemTest {

    private static umbcs680.filesystemcomparator.FileSystem fs;

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
        assertEquals(1,fs.getRootCount());
    }


    @Test
    public void rootsCheck(){
        LinkedList<Directory> expectedRoots = new LinkedList<Directory>();
        expectedRoots.add(new Directory(null,"repo",0,LocalDateTime.now()));
        assertEquals(expectedRoots.getFirst().getName(),fs.getRootDirs().getFirst().getName());
    }

    
    
}