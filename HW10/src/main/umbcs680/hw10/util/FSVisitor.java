package umbcs680.hw10.util;
import  umbcs680.hw10.fs.*;
public interface FSVisitor {

    public void visit(umbcs680.hw10.fs.Link link);

    public void visit(umbcs680.hw10.fs.File file);

    public void visit(Directory dir);
}