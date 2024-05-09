package umbcs680.hw12.filesystemcomparator;
import  umbcs680.hw12.util.*;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Directory extends FSElement{
    private String  permission;
    private LinkedList<FSElement> children;
    private LinkedList<Directory> subDirectories;
    private  LinkedList<umbcs680.hw12.filesystemcomparator.File> files;
    private  LinkedList<umbcs680.hw12.filesystemcomparator.Link> links;
    public Directory(Directory parent,String name, int size,LocalDateTime creationTime){
        super(parent,name,size,creationTime);
        this.permission="drwx-r-xr-x";
        children = new LinkedList<FSElement>();
        files = new LinkedList<umbcs680.hw12.filesystemcomparator.File>();
        subDirectories = new LinkedList<Directory>();
        links = new LinkedList<umbcs680.hw12.filesystemcomparator.Link>();
    }

    @Override
    public boolean isDirectory(){
        return true;
    }

    public void appendChild(FSElement child){
        if (child.isDirectory()) {
            subDirectories.add((Directory) child);
        }else if (child instanceof umbcs680.hw12.filesystemcomparator.Link ) {
            links.add((umbcs680.hw12.filesystemcomparator.Link) child);
        }
        else{
            files.add((umbcs680.hw12.filesystemcomparator.File) child);
        }    
        children.add(child);
        Collections.sort(this.children,new AlphabeticalComparator());
        Collections.sort(this.subDirectories,new AlphabeticalComparator());
        Collections.sort(this.files,new AlphabeticalComparator());
        Collections.sort(this.links,new AlphabeticalComparator());
    }
    @Override
    public void accept(FSVisitor v){
        v.visit(this);
        for(FSElement element : children){
            element.accept(v);
        }
    }
    public void removeChild(FSElement child){
        if (child.isDirectory()) {
            subDirectories.remove((Directory) child);
        }else if (child instanceof umbcs680.hw12.filesystemcomparator.Link ) {
            links.remove((umbcs680.hw12.filesystemcomparator.Link) child);
        } else {
            files.remove((umbcs680.hw12.filesystemcomparator.File) child);
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

    public  LinkedList<umbcs680.hw12.filesystemcomparator.File> getFiles(){
        return this.files;
    }
    
    @Override
    public int getTotalSize(){
        int size =0;
        for (Directory d : getSubDirectories()){
            size += d.getTotalSize();
        }
        for (umbcs680.hw12.filesystemcomparator.File f : getFiles()){
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

    public LinkedList<umbcs680.hw12.filesystemcomparator.Link> getLinks() {
        return this.links;
    }
    
    // comparator getter methods

    public LinkedList<umbcs680.hw12.filesystemcomparator.Link> getLinks(Comparator<FSElement> c) {
        
        Collections.sort(this.links, c);
        return this.links;
    }

    public LinkedList<umbcs680.hw12.filesystemcomparator.File> getFiles(Comparator<FSElement> c) {

        Collections.sort(this.files, c);
        return this.files;
    }

    public LinkedList<Directory> getSubDirectories(Comparator<FSElement> c) {

        Collections.sort(this.subDirectories, c);
        return this.subDirectories;
    }

    public LinkedList<FSElement> getChildren(Comparator<FSElement> c){
        Collections.sort(this.children, c);
        return this.children;
    }


    public LinkedList<FSElement> getChildrenElementBased(Comparator<FSElement> c){
        LinkedList<FSElement> elements = new LinkedList<FSElement>();
        Collections.sort(this.files, c);
        Collections.sort(this.subDirectories, c);
        Collections.sort(this.links, c);
        for (FSElement f:
             this.subDirectories) {
            elements.add(f);
        }
        for (FSElement f:
                this.files) {
            elements.add(f);
        }
        for (FSElement f:
                this.links) {
            elements.add(f);
        }
        return elements;
    }


    public LinkedList<FSElement> getChildrenElementBased(){
        LinkedList<FSElement> elements = new LinkedList<FSElement>();
        Collections.sort(this.files,new AlphabeticalComparator() );
        Collections.sort(this.subDirectories, new AlphabeticalComparator());
        Collections.sort(this.links, new AlphabeticalComparator());
        for (FSElement f:
                this.subDirectories) {
            elements.add(f);
        }
        for (FSElement f:
                this.files) {
            elements.add(f);
        }
        for (FSElement f:
                this.links) {
            elements.add(f);
        }
        return elements;
    }
}