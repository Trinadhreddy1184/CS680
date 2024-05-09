package umbcs680.hw12.cmds;
import umbcs680.hw12.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileCrawlingTest {

    @Test
    public void fileCrawlingInstanceCheck(){
        FileCrawling cut = new FileCrawling();
        assertNotNull(cut);
    }

    @Test
    public void fileCrawlingSizeCheck(){
        FileCrawling cut = new FileCrawling();
        cut.execute();
        assertEquals(5,cut.getFiles().size());
        
    }



}