package umbcs680.hw17.util;

import umbcs680.hw17.filesystemcomparator.*;

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
    public void visit(umbcs680.hw17.filesystemcomparator.File file){
        fileNum++;
    }

    @Override
    public void visit(Directory dir){
        dirNum++;
    }

    @Override
    public void visit(umbcs680.hw17.filesystemcomparator.Link link){
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