package umbcs680.hw12.util;
import  umbcs680.hw12.filesystemcomparator.*;
public interface FSVisitor {

    public void visit(umbcs680.hw12.filesystemcomparator.Link link);

    public void visit(umbcs680.hw12.filesystemcomparator.File file);

    public void visit(Directory dir);
}