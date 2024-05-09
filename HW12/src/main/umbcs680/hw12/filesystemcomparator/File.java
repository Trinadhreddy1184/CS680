package umbcs680.hw12.filesystemcomparator;
import  umbcs680.hw12.util.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class File extends FSElement{

    private String  permission;

    public  File(Directory parent,String name, int size,LocalDateTime creationTime){
        super(parent,name,size,creationTime);
        this.permission="rw-rw-r–";
    }
    @Override
    public void accept(FSVisitor v){
        v.visit(this);
    }
    @Override
    public boolean isDirectory(){
        return false;
    }


    public void changePermission(String newPermission){
        this.permission = newPermission;
    }

    public String getPermission(){
        return permission;
    }

    @Override
    public int getTotalSize(){
        return this.getSize();
    }

}