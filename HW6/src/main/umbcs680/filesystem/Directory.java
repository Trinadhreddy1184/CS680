package umbcs680.filesystem;

import java.io.File;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement{
    private String  permission;
    private LinkedList<FSElement> children;
    private LinkedList<Directory> subDirectories;
    private  LinkedList<umbcs680.filesystem.File> files;

    public Directory(Directory parent,String name, int size,LocalDateTime creationTime){
        super(parent,name,size,creationTime);
        this.permission="drwx-r-xr-x";
        children = new LinkedList<FSElement>();
        files = new LinkedList<umbcs680.filesystem.File>();
        subDirectories = new LinkedList<Directory>();
    }

    @Override
    public boolean isDirectory(){
        return true;
    }

    public void appendChild(FSElement child){
        if (child.isDirectory()) {
            subDirectories.add((Directory) child);
        } else {
            files.add((umbcs680.filesystem.File) child);
        }    
        children.add(child);
    }
    
    public void removeChild(FSElement child){
        if (child.isDirectory()) {
            subDirectories.remove((Directory) child);
        } else {
            files.remove((umbcs680.filesystem.File) child);
        }
        children.remove(child);
    }
    
    public void removeChildren(LinkedList<FSElement> children){
        for (FSElement child: children){
            removeChild(child);
        }
    }
    

    public LinkedList<FSElement> getChildren(){
        return this.children;
    }

    public int countChildren(){
       return children.size();
    }

    public  LinkedList<Directory> getSubDirectories(){
        return this.subDirectories;
    }

    public  LinkedList<umbcs680.filesystem.File> getFiles(){
        return this.files;
    }

    public int getTotalSize(){
        int size =0;
        for (Directory d : getSubDirectories()){
            size += d.getTotalSize();
        }
        for (umbcs680.filesystem.File f : getFiles()){
            size += f.getSize();
        }
        return size;
    }

    @Override
    public void changePermission(String newPermission){
        this.permission = newPermission;
    }

    public String getPermission(){
        return permission;
    }

}