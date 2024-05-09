package umbcs680.hw14.util;
import  umbcs680.hw14.filesystemcomparator.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileSearchVisitorTest {

    private static FileSearchVisitor fileSearchVisitor;
    private static umbcs680.hw14.filesystemcomparator.FileSystem fs;
    
    @BeforeAll
    public static void setUp(){
        fileSearchVisitor = FSVisitorFixture.getFileSearchVisitorInstance("readme.md");
    }

    private String[] fileToStringArray(umbcs680.hw14.filesystemcomparator.File f){
        String[] fileInfo = {f.getName(),String.valueOf(f.getSize()),f.getPermission(),String.valueOf(f.getCreationTime()),f.getParent().getName()};
        return fileInfo;
    }
    
    @Test
    public void fileSearchVisitorInstanceCheck(){
        assertNotNull(fileSearchVisitor);
    }

    

    @Test
    public void fileSearchVisitorEqualityCheck(){
        String[] expectedFileInfo = {"readme.md","20","rw-rw-r–","2022-04-24T14:40","repo"};
        assertArrayEquals(expectedFileInfo,fileToStringArray(fileSearchVisitor.getFoundfiles().get(0)));
    }
    
    
}