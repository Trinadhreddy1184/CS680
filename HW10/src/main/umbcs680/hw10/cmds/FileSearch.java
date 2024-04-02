package umbcs680.hw10.cmds;

import  umbcs680.hw10.util.*;
import  umbcs680.hw10.fs.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileSearch implements FSCommand{

    private LinkedList<umbcs680.hw10.fs.File> foundfiles;
    private String fileName;
    
    public FileSearch(String fileName){
        this.fileName = fileName;
    }
    
    @Override
    public void execute(){
        FileSearchVisitor fileSearchVisitor = new FileSearchVisitor(fileName);
        umbcs680.hw10.fs.FileSystem fs = TestFixtureInitializer.createFS();
        Directory repo = fs.getRootDirs().getFirst();;
        repo.accept(fileSearchVisitor);
        foundfiles=fileSearchVisitor.getFoundfiles();
    }

    public LinkedList<umbcs680.hw10.fs.File> getFoundfiles(){
        return foundfiles;
    }
}