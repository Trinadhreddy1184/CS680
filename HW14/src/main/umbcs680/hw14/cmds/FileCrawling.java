package umbcs680.hw14.cmds;

import  umbcs680.hw14.util.*;
import  umbcs680.hw14.filesystemcomparator.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileCrawling implements FSCommand{

    private LinkedList<umbcs680.hw14.filesystemcomparator.File> files;

    @Override
    public void execute(){
        FileCrawlingVisitor fileCrawlingVisitor = new FileCrawlingVisitor();
        umbcs680.hw14.filesystemcomparator.FileSystem fs = umbcs680.hw14.filesystemcomparator.TestFixtureInitializer.createFS();
        Directory repo = fs.getRootDirs().getFirst();;
        repo.accept(fileCrawlingVisitor);
        files=fileCrawlingVisitor.getFiles();
    }

    public LinkedList<umbcs680.hw14.filesystemcomparator.File> getFiles(){
        return files;
    }
}