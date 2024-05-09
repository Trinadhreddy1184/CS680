package umbcs680.hw12.util;
import  umbcs680.hw12.filesystemcomparator.*;

public class FSVisitorFixture {

    private static FileSearchVisitor fileSearchVisitor;
    private static CountingVisitor countingVisitor;
    private static FileCrawlingVisitor fileCrawlingVisitor;
    private static umbcs680.hw12.filesystemcomparator.FileSystem fs;
    
    public static FileSearchVisitor getFileSearchVisitorInstance(String fileName){
        fileSearchVisitor = new FileSearchVisitor(fileName);
        fs = TestFixtureInitializer.createFS();
        Directory repo = fs.getRootDirs().getFirst();;
        repo.accept(fileSearchVisitor);
        return fileSearchVisitor;
    }

    public static CountingVisitor getCountingVisitorInstance(){
        countingVisitor = new CountingVisitor();
        fs = TestFixtureInitializer.createFS();
        Directory repo = fs.getRootDirs().getFirst();;
        repo.accept(countingVisitor);
        return countingVisitor;
    }

    public static FileCrawlingVisitor getFileCrawlingVisitorInstance(){ 
        fileCrawlingVisitor =  new FileCrawlingVisitor();
        fs = TestFixtureInitializer.createFS();
        Directory repo = fs.getRootDirs().getFirst();;
        repo.accept(fileCrawlingVisitor);
        return fileCrawlingVisitor;
    }
    
}