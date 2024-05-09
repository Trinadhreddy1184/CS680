package umbcs680.hw12.filesystemcomparator;
import  umbcs680.hw12.util.*;
import java.time.LocalDateTime;
import java.util.LinkedList;

public class FileSystem{
    private static LinkedList<Directory> rootDirectories;
    private static  FileSystem fileSystemInstance;

    private FileSystem(){}

    public static FileSystem getFileSystem(){
        if(fileSystemInstance == null)
            fileSystemInstance = new FileSystem();
        rootDirectories = new LinkedList<Directory>();
        return fileSystemInstance;
    }

    public  void  appendRootDir(Directory root){
        rootDirectories.add(root);
    }

    public  LinkedList<Directory> getRootDirs(){
        return rootDirectories;
    }
    
    public int getRootCount(){
        return rootDirectories.size();
    }
    
    public void removeRootDir(Directory root){
        rootDirectories.remove(root);
    }
}