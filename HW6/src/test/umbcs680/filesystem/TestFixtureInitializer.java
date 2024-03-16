package umbcs680.filesystem;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestFixtureInitializer {

    public static umbcs680.filesystem.FileSystem createFS(){
        umbcs680.filesystem.FileSystem fs = umbcs680.filesystem.FileSystem.getFileSystem();
        Directory CDrive = new Directory(null,"CDrive",0,LocalDateTime.now());
        Directory FDrive = new Directory(null,"FDrive",0,LocalDateTime.now());
        fs.appendRootDir(CDrive);
        fs.appendRootDir(FDrive);
        Directory desktop1 = new Directory(CDrive,"desktop1",0,LocalDateTime.now());
        Directory desktop2 = new Directory(FDrive,"desktop2",0,LocalDateTime.now());
        Directory documents1 = new Directory(CDrive,"document1",0,LocalDateTime.now());
        CDrive.appendChild(desktop1);
        CDrive.appendChild(documents1);
        FDrive.appendChild(desktop2);
        umbcs680.filesystem.File file1 = new umbcs680.filesystem.File(desktop1,"file1",20,LocalDateTime.now());
        umbcs680.filesystem.File file2 = new umbcs680.filesystem.File(desktop1,"file2",45,LocalDateTime.now());
        umbcs680.filesystem.File file3 = new umbcs680.filesystem.File(desktop2,"file3",60,LocalDateTime.now());
        umbcs680.filesystem.File file4 = new umbcs680.filesystem.File(desktop2,"file4",70,LocalDateTime.now());
        desktop1.appendChild(file1);
        desktop1.appendChild(file2);
        desktop2.appendChild(file3);
        desktop2.appendChild(file4);

        return fs;
    }


}