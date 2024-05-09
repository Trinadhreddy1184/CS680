package umbcs680.hw12.util;
import  umbcs680.hw12.filesystemcomparator.*;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CountingVisitorTest {

    private static CountingVisitor countingVisitor;
    

    @BeforeAll
    public static void setUp(){
        countingVisitor = FSVisitorFixture.getCountingVisitorInstance();
        
    }


    @Test
    public void countingVisitorInstanceCheck(){
        assertNotNull(countingVisitor);
    }
    

    @Test
    public void countingVisitorFileNumCheck(){
        assertEquals(5,countingVisitor.getFileNum());
    }

    @Test
    public void countingVisitorDirNumCheck(){
        assertEquals(4,countingVisitor.getDirNum());
    }

    @Test
    public void countingVisitorLinkNumCheck(){
        assertEquals(1,countingVisitor.getLinkNum());
    }

}   