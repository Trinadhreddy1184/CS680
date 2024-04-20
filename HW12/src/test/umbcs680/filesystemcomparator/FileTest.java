package umbcs680.filesystemcomparator;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileTest {

    private static umbcs680.filesystemcomparator.FileSystem fs;

    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS();
    }


    private String[] fileToStringArray(umbcs680.filesystemcomparator.File f){
        String[] fileInfo = {f.getName(),String.valueOf(f.getSize()),f.getPermission(),String.valueOf(f.getCreationTime()),f.getParent().getName()};
        return fileInfo;
    }
    
    
    @Test
    public void filCheck(){
        Directory repo = fs.getRootDirs().getFirst();;
        File readme = repo.getFiles().get(0);
        assertFalse(readme.isDirectory());
    }


    @Test
    public void verifyFileEqualityReadme(){
        String[] expectedFileInfo = {"readme.md","20","rw-rw-r–","2022-04-24T14:40","repo"};
        Directory repo = fs.getRootDirs().getFirst();
        File readme = repo.getFiles().get(0);
        assertArrayEquals(expectedFileInfo,fileToStringArray(readme));
    }

    @Test
    public void verifyFileEqualityAjava(){
        String[] expectedFileInfo = {"A.java","35","rw-rw-r–","2022-04-24T22:10","main"};
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        Directory main = src.getSubDirectories().get(0);
        File Ajava = main.getFiles().get(0);
        assertArrayEquals(expectedFileInfo,fileToStringArray(Ajava));
    }

    @Test
    public void verifyFileEqualityBjava(){
        String[] expectedFileInfo = {"B.java","50","rw-rw-r–","2022-04-24T22:15","main"};
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        Directory main = src.getSubDirectories().get(0);
        File Bjava = main.getFiles().get(1);
        assertArrayEquals(expectedFileInfo,fileToStringArray(Bjava));
    }

    @Test
    public void verifyFileEqualityATestjava(){
        String[] expectedFileInfo = {"ATest.java","20","rw-rw-r–","2022-04-24T23:00","test"};
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        Directory test = src.getSubDirectories().get(1);
        File ATestjava = test.getFiles().get(0);
        assertArrayEquals(expectedFileInfo,fileToStringArray(ATestjava));
    }

    @Test
    public void verifyFileEqualityBTestjavaWithChangePermission(){
        String[] expectedFileInfo = {"BTest.java","25","rwxrwxrw-","2022-04-24T23:10","test"};
        Directory repo = fs.getRootDirs().getFirst();
        Directory src = repo.getSubDirectories().getFirst();
        Directory test = src.getSubDirectories().get(1);
        File BTestjava = test.getFiles().get(1);
        BTestjava.changePermission("rwxrwxrw-");
        assertArrayEquals(expectedFileInfo,fileToStringArray(BTestjava));
    }


}