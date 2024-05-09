package umbcs680.hw12.cmds;
import umbcs680.hw12.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CountingTest {
    
    @Test
    public void countingInstanceCheck(){
        Counting cut = new Counting();
        assertNotNull(cut);
    }

    @Test
    public void countingFileNumCheck(){
        Counting cut = new Counting();
        cut.execute();
        assertEquals(5,cut.getFileNum());
    }

    @Test
    public void countingDirNumCheck(){
        Counting cut = new Counting();
        cut.execute();
        assertEquals(4,cut.getDirNum());
    }

    @Test
    public void countingLinkNumCheck(){
        Counting cut = new Counting();
        cut.execute();
        assertEquals(1,cut.getLinkNum());
    }
    
}