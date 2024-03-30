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


    private String[] dirToStringArray(Directory d){
        String[] dirInfo = {d.getName(),String.valueOf(d.getTotalSize()),d.getPermission(),
                String.valueOf(d.countChildren()),String.valueOf(d.getCreationTime())};
        return dirInfo;
    }

    

    
    @Test
    public void driveCheck(){
        Directory repo = fs.getRootDirs().getFirst();
        assertTrue(repo.isDirectory());
    }

    @Test
    public void toatalSizeCheck(){
        Directory repo = fs.getRootDirs().getFirst();
        assertEquals(150,repo.getTotalSize());

    }


    @Test
    public void verifyDirectoryEqualityRoot(){
        String[] expectedDirInfo = {"repo","150","drwx-r-xr-x","2","2022-04-24T14:33"};
        Directory repo = fs.getRootDirs().getFirst();
        assertArrayEquals(expectedDirInfo,dirToStringArray(repo));
    }


    @Test
    public void subDirectoryParentCheck(){
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        assertEquals(repo,src.getParent());
    }


    @Test
    public void verifyDirectoryEqualitysrc() {
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        String[] expectedDirInfo = {"src","130","drwx-r-xr-x","2","2022-04-24T14:36"};
        assertArrayEquals(expectedDirInfo,dirToStringArray(src));
    }



    @Test
    public void subDirectoryChildrenCountCheck(){
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        assertEquals(2,src.countChildren());
    }

    @Test
    public void verifyDirectoryEqualitymain() {
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        Directory main = src.getSubDirectories().get(0);
        String[] expectedDirInfo = {"main", "85", "drwx-r-xr-x", "2", "2022-04-24T20:10"};
        assertArrayEquals(expectedDirInfo,dirToStringArray(main));
    }

    @Test
    public void verifyDirectoryEqualitytestWithChangePermission() {
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        Directory test = src.getSubDirectories().get(1);
        test.changePermission("drwxrwxrwx");
        String[] expectedDirInfo = {"test", "45", "drwxrwxrwx", "3", "2022-04-24T20:10"};
        assertArrayEquals(expectedDirInfo,dirToStringArray(test));
    }

    

    

}
