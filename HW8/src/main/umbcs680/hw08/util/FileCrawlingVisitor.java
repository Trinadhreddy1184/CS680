package umbcs680.hw08.util;

import umbcs680.hw08.fs.*;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileCrawlingVisitor implements FSVisitor{
    private LinkedList<umbcs680.hw08.fs.File> files;


    public  FileCrawlingVisitor(){
        files= new LinkedList<umbcs680.hw08.fs.File>();
    }

    @Override
    public void visit(umbcs680.hw08.fs.File file){
        files.add(file);
    }

    @Override
    public void visit(Directory dir){
        return;
    }

    @Override
    public void visit(umbcs680.hw08.fs.Link link){
        return;
    }

    public LinkedList<umbcs680.hw08.fs.File> getFiles(){
        return files;
    }

}