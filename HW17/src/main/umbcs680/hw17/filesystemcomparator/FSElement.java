package umbcs680.hw17.filesystemcomparator;

import java.time.LocalDateTime;
import java.util.LinkedList;

public abstract class FSElement {
    protected Directory parent;
    protected String name;
    protected  int size;
    protected LocalDateTime creationTime;
    protected  String permission;

    public  FSElement(Directory parent,String name, int size,LocalDateTime creationTime){
        this.parent=parent;
        this.name=name;
        this.size=size;
        this.creationTime=creationTime;
    }

    public Directory getParent(){
        return this.parent;
    }

    public int getSize(){
        return this.size;
    }

    public String getName(){
        return this.name;
    }
    
    public LocalDateTime getCreationTime(){
        return this.creationTime;
    }

    public void setParent(Directory newParent){
        this.parent=newParent;
    }

    public abstract boolean isDirectory();
    public abstract int getTotalSize();
}