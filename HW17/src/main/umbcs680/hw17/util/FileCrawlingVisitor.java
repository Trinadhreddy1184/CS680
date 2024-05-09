package umbcs680.hw17.util;

import umbcs680.hw17.filesystemcomparator.*;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileCrawlingVisitor implements FSVisitor{
    private LinkedList<umbcs680.hw17.filesystemcomparator.File> files;


    public  FileCrawlingVisitor(){
        files= new LinkedList<umbcs680.hw17.filesystemcomparator.File>();
    }

    @Override
    public void visit(umbcs680.hw17.filesystemcomparator.File file){
        files.add(file);
    }

    @Override
    public void visit(Directory dir){
        return;
    }

    @Override
    public void visit(umbcs680.hw17.filesystemcomparator.Link link){
        return;
    }

    public LinkedList<umbcs680.hw17.filesystemcomparator.File> getFiles(){
        return files;
    }

}