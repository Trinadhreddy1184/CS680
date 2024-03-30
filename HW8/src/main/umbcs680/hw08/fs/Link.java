package umbcs680.hw08.fs;

import umbcs680.hw08.util.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Link extends FSElement{
    private FSElement target;
    public Link (Directory parent,String name,int size,LocalDateTime creationTime,FSElement target){
        super(parent,name,size,creationTime);
        this.target= target;
    }

    public FSElement getTarget() {
        return target;
    }

    @Override
    public boolean isDirectory(){
        return false;
    }

    @Override
    public void accept(FSVisitor v){
        v.visit(this);
    }
    
}