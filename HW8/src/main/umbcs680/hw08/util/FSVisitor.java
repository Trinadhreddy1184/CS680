package umbcs680.hw08.util;
import  umbcs680.hw08.fs.*;
public interface FSVisitor {

    public void visit(umbcs680.hw08.fs.Link link);

    public void visit(umbcs680.hw08.fs.File file);

    public void visit(Directory dir);
}