package umbcs680.hw12.util;

import umbcs680.hw12.filesystemcomparator.*;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileSearchVisitor implements FSVisitor{
    private LinkedList<umbcs680.hw12.filesystemcomparator.File> foundfiles;
    private String fileName;
    
    public  FileSearchVisitor(String fileName){
        this.fileName=fileName;
        foundfiles= new LinkedList<umbcs680.hw12.filesystemcomparator.File>();
    }
    
    @Override
    public void visit(umbcs680.hw12.filesystemcomparator.File file){
        if (file.getName().equals(fileName)){
            foundfiles.add(file);
        }
    }
    
    @Override
    public void visit(Directory dir){
        return;
    }

    @Override
    public void visit(umbcs680.hw12.filesystemcomparator.Link link){
        return;
    }
    
    public LinkedList<umbcs680.hw12.filesystemcomparator.File> getFoundfiles(){
        return foundfiles;
    }
    
}
