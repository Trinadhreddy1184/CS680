package umbcs680.filesystem;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestFixtureInitializer {

    public static umbcs680.filesystem.FileSystem createFS(){
        umbcs680.filesystem.FileSystem fs = umbcs680.filesystem.FileSystem.getFileSystem();
        Directory repo = new Directory(null,"repo",0,LocalDateTime.of(2022,04, 24, 14, 33));
        fs.appendRootDir(repo);
        Directory src = new Directory(repo,"src",0,LocalDateTime.of(2022,04, 24, 14, 36));
        umbcs680.filesystem.File readmemd = new umbcs680.filesystem.File(repo,"readme.md",20,LocalDateTime.of(2022,04, 24, 14, 40));
        repo.appendChild(src);
        repo.appendChild(readmemd);
        Directory main = new Directory(src,"main",0,LocalDateTime.of(2022,04, 24, 20,10));
        Directory test = new Directory(src,"test",0,LocalDateTime.of(2022,04, 24, 20,10));
        src.appendChild(main);
        src.appendChild(test);
        umbcs680.filesystem.File Ajava = new umbcs680.filesystem.File(main,"A.java",35,LocalDateTime.of(2022,04, 24, 22, 10));
        umbcs680.filesystem.File Bjava = new umbcs680.filesystem.File(main,"B.java",50,LocalDateTime.of(2022,04, 24, 22, 15));
        umbcs680.filesystem.File ATestjava = new umbcs680.filesystem.File(test,"ATest.java",20,LocalDateTime.of(2022,04, 24, 23, 00));
        umbcs680.filesystem.File BTestjava = new umbcs680.filesystem.File(test,"BTest.java",25,LocalDateTime.of(2022,04, 24, 23, 10));
        main.appendChild(Ajava);
        main.appendChild(Bjava);
        test.appendChild(ATestjava);
        test.appendChild(BTestjava);

        return fs;
    }


}