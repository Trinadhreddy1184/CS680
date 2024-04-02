package umbcs680.hw10.fs;

import  umbcs680.hw10.util.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement{
    private String  permission;
    private LinkedList<FSElement> children;
    private LinkedList<Directory> subDirectories;
    private  LinkedList<umbcs680.hw10.fs.File> files;
    private  LinkedList<umbcs680.hw10.fs.Link> links;
    public Directory(Directory parent,String name, int size,LocalDateTime creationTime){
        super(parent,name,size,creationTime);
        this.permission="drwx-r-xr-x";
        children = new LinkedList<FSElement>();
        files = new LinkedList<umbcs680.hw10.fs.File>();
        subDirectories = new LinkedList<Directory>();
        links = new LinkedList<umbcs680.hw10.fs.Link>();
    }

    @Override
    public void accept(FSVisitor v){
        v.visit(this);
        for(FSElement element : children){
            element.accept(v);
        }
    }

    @Override
    public boolean isDirectory(){
        return true;
    }

    public void appendChild(FSElement child){
        if (child.isDirectory()) {
            subDirectories.add((Directory) child);
        }else if (child instanceof umbcs680.hw10.fs.Link ) {
            links.add((umbcs680.hw10.fs.Link) child);
        }
        else{
            files.add((umbcs680.hw10.fs.File) child);
        }    
        children.add(child);
    }
    
    public void removeChild(FSElement child){
        if (child.isDirectory()) {
            subDirectories.remove((Directory) child);
        }else if (child instanceof umbcs680.hw10.fs.Link ) {
            links.remove((umbcs680.hw10.fs.Link) child);
        } else {
            files.remove((umbcs680.hw10.fs.File) child);
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

    public  LinkedList<umbcs680.hw10.fs.File> getFiles(){
        return this.files;
    }

    public int getTotalSize(){
        int size =0;
        for (Directory d : getSubDirectories()){
            size += d.getTotalSize();
        }
        for (umbcs680.hw10.fs.File f : getFiles()){
            size += f.getSize();
        }
        return size;
    }


    public void changePermission(String newPermission){
        this.permission = newPermission;
    }

    public String getPermission(){
        return permission;
    }

    public LinkedList<umbcs680.hw10.fs.Link> getLinks() {
        return this.links;
    }
}