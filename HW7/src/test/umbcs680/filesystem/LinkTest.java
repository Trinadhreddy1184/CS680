package umbcs680.filesystem;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class LinkTest {

    private static umbcs680.filesystem.FileSystem fs;

    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS();
    }


    private String[] linkToStringArray(umbcs680.filesystem.Link l){
        String[] linkInfo = {l.getName(),String.valueOf(l.getSize()),l.getTarget().getName(),String.valueOf(l.getCreationTime()),l.getParent().getName()};
        return linkInfo;
    }

    private String[] linkTargetFileToStringArray(umbcs680.filesystem.File f){
        String[] fileInfo = {f.getName(),String.valueOf(f.getSize()),f.getPermission(),String.valueOf(f.getCreationTime()),f.getParent().getName()};
        return fileInfo;
    }

    private String[] linkTargetDirToStringArray(Directory d){
        String[] dirInfo = {d.getName(),String.valueOf(d.getTotalSize()),d.getPermission(),
                String.valueOf(d.countChildren()),String.valueOf(d.getCreationTime())};
        return dirInfo;
    }


    @Test
    public void linkCheck(){
        Directory repo = fs.getRootDirs().getFirst();;
        Directory src = repo.getSubDirectories().getFirst();
        Directory test = src.getSubDirectories().get(1);
        umbcs680.filesystem.Link readme = test.getLinks().get(0);
        assertFalse(readme.isDirectory());
    }

    @Test
    public void linkEqualityCheck(){
        String[] expectedLinkInfo = {"rm.md","0","readme.md","2022-04-24T23:10","test"};
        Directory repo = fs.getRootDirs().getFirst();;
        Directory src = repo.getSubDirectories().getFirst();
        Directory test = src.getSubDirectories().get(1);
        umbcs680.filesystem.Link readme = test.getLinks().get(0);
        assertArrayEquals(expectedLinkInfo,linkToStringArray(readme));
    }

    @Test
    public void linkTargetEqualityCheck(){
        String[] expectedLinkTargetInfo = {"readme.md","20","rw-rw-r–","2022-04-24T14:40","repo"};
        Directory repo = fs.getRootDirs().getFirst();;
        Directory src = repo.getSubDirectories().getFirst();
        Directory test = src.getSubDirectories().get(1);
        umbcs680.filesystem.File readme = (umbcs680.filesystem.File) test.getLinks().get(0).getTarget();
        assertArrayEquals(expectedLinkTargetInfo,linkTargetFileToStringArray(readme));
    }
}
