package umbcs680.hw17.util;
import  umbcs680.hw17.filesystemcomparator.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileCrawlingVisitorTest {

    private static FileCrawlingVisitor fileCrawlingVisitor;


    @BeforeAll
    public static void setUp(){
        fileCrawlingVisitor = FSVisitorFixture.getFileCrawlingVisitorInstance();
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