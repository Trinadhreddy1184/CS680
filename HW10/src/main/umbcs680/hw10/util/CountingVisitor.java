package umbcs680.hw10.util;

import umbcs680.hw10.fs.*;

import java.time.LocalDateTime;
import java.util.LinkedList;

public class CountingVisitor implements FSVisitor{
    private int dirNum,fileNum,linkNum;


    public  CountingVisitor(){
        dirNum=0;
        fileNum=0;
        linkNum=0;
    }

    @Override
    public void visit(umbcs680.hw10.fs.File file){
        fileNum++;
    }

    @Override
    public void visit(Directory dir){
        dirNum++;
    }

    @Override
    public void visit(umbcs680.hw10.fs.Link link){
        linkNum++;
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