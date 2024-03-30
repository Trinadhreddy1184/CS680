package umbcs680.filesystem;

import java.io.File;
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
    
}