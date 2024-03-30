package umbcs680.hw08.fs;

import java.time.LocalDateTime;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestFixtureInitializer {

    public static umbcs680.hw08.fs.FileSystem createFS(){
        umbcs680.hw08.fs.FileSystem fs = umbcs680.hw08.fs.FileSystem.getFileSystem();
        Directory repo = new Directory(null,"repo",0,LocalDateTime.of(2022,04, 24, 14, 33));
        fs.appendRootDir(repo);
        Directory src = new Directory(repo,"src",0,LocalDateTime.of(2022,04, 24, 14, 36));
        umbcs680.hw08.fs.File readmemd = new umbcs680.hw08.fs.File(repo,"readme.md",20,LocalDateTime.of(2022,04, 24, 14, 40));
        repo.appendChild(src);
        repo.appendChild(readmemd);
        Directory main = new Directory(src,"main",0,LocalDateTime.of(2022,04, 24, 20,10));
        Directory test = new Directory(src,"test",0,LocalDateTime.of(2022,04, 24, 20,10));
        src.appendChild(main);
        src.appendChild(test);
        umbcs680.hw08.fs.File Ajava = new umbcs680.hw08.fs.File(main,"A.java",35,LocalDateTime.of(2022,04, 24, 22, 10));
        umbcs680.hw08.fs.File Bjava = new umbcs680.hw08.fs.File(main,"B.java",50,LocalDateTime.of(2022,04, 24, 22, 15));
        umbcs680.hw08.fs.File ATestjava = new umbcs680.hw08.fs.File(test,"ATest.java",20,LocalDateTime.of(2022,04, 24, 23, 00));
        umbcs680.hw08.fs.File BTestjava = new umbcs680.hw08.fs.File(test,"BTest.java",25,LocalDateTime.of(2022,04, 24, 23, 10));
        umbcs680.hw08.fs.Link rmmd = new umbcs680.hw08.fs.Link(test,"rm.md",0,LocalDateTime.of(2022,04, 24, 23, 10),readmemd);
        main.appendChild(Ajava);
        main.appendChild(Bjava);
        test.appendChild(ATestjava);
        test.appendChild(BTestjava);
        test.appendChild(rmmd);
        return fs;
    }


}