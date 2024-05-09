package umbcs680.hw17.cmds;

import  umbcs680.hw17.util.*;
import  umbcs680.hw17.filesystemcomparator.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Counting implements FSCommand{

    private int dirNum,fileNum,linkNum;

    @Override
    public void execute(){
        CountingVisitor countingVisitor = new CountingVisitor();
        umbcs680.hw17.filesystemcomparator.FileSystem fs = TestFixtureInitializer.createFS();
        Directory repo = fs.getRootDirs().getFirst();;
        repo.accept(countingVisitor);
        dirNum = countingVisitor.getDirNum();
        fileNum= countingVisitor.getFileNum();
        linkNum= countingVisitor.getLinkNum();
    }

    public int getDirNum() {
        return dirNum;
    }

    public int getFileNum() {
        return fileNum;
    }

    public int getLinkNum() {
        return linkNum;
    }
    
    
    
}