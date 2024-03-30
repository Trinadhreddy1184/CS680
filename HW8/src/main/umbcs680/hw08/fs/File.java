package umbcs680.hw08.fs;

import  umbcs680.hw08.util.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class File extends FSElement{

    private String  permission;

    public  File(Directory parent,String name, int size,LocalDateTime creationTime){
        super(parent,name,size,creationTime);
        this.permission="rw-rw-r–";
    }

    @Override
    public boolean isDirectory(){
        return false;
    }

    @Override
    public void accept(FSVisitor v){
        v.visit(this);
    }


    public void changePermission(String newPermission){
        this.permission = newPermission;
    }

    public String getPermission(){
        return permission;
    }

}