package umbcs680.hw17.cmds;
import umbcs680.hw17.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class FileSearchTest {

    @Test
    public void fileSearchInstanceCheck(){
        FileSearch cut = new FileSearch("readme.md");
        assertNotNull(cut);
    }

    

    @Test
    public void fileSearchNameheck(){
        FileSearch cut = new FileSearch("readme.md");
        cut.execute();
        assertEquals("readme.md",cut.getFoundfiles().get(0).getName());
    }

}