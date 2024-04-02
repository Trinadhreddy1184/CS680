package umbcs680.hw10.cmds;

import  umbcs680.hw10.util.*;
import  umbcs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileCrawling implements FSCommand{

    private LinkedList<umbcs680.hw10.fs.File> files;

    @Override
    public void execute(){
        FileCrawlingVisitor fileCrawlingVisitor = new FileCrawlingVisitor();
        umbcs680.hw10.fs.FileSystem fs = umbcs680.hw10.fs.TestFixtureInitializer.createFS();
        Directory repo = fs.getRootDirs().getFirst();;
        repo.accept(fileCrawlingVisitor);
        files=fileCrawlingVisitor.getFiles();
    }

    public LinkedList<umbcs680.hw10.fs.File> getFiles(){
        return files;
    }
}