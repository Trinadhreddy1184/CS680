package umbcs680.hw08.util;
import  umbcs680.hw08.fs.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileCrawlingVisitorTest {

    private static FileCrawlingVisitor fileCrawlingVisitor;


    @BeforeAll
    public static void setUp(){
        fileCrawlingVisitor = FSVisitorFixture.getFileCrawlingVisitorInstance();
    }

    private String[] fileToStringArray(umbcs680.hw08.fs.File f){
        String[] fileInfo = {f.getName(),String.valueOf(f.getSize()),f.getPermission(),String.valueOf(f.getCreationTime()),f.getParent().getName()};
        return fileInfo;
    }

    @Test
    public void fileCrawlingVisitorInstanceCheck(){
        assertNotNull(fileCrawlingVisitor);
    }

    
    @Test
    public void fileCrawlingVisitorSizeCheck(){
        assertEquals(5,fileCrawlingVisitor.getFiles().size());
    }


}   