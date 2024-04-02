package umbcs680.hw10.util;

import umbcs680.hw10.fs.*;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileCrawlingVisitor implements FSVisitor{
    private LinkedList<umbcs680.hw10.fs.File> files;


    public  FileCrawlingVisitor(){
        files= new LinkedList<umbcs680.hw10.fs.File>();
    }

    @Override
    public void visit(umbcs680.hw10.fs.File file){
        files.add(file);
    }

    @Override
    public void visit(Directory dir){
        return;
    }

    @Override
    public void visit(umbcs680.hw10.fs.Link link){
        return;
    }

    public LinkedList<umbcs680.hw10.fs.File> getFiles(){
        return files;
    }

}