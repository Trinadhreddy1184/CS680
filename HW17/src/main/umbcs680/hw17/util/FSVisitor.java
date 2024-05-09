package umbcs680.hw17.util;
import  umbcs680.hw17.filesystemcomparator.*;
public interface FSVisitor {

    public void visit(umbcs680.hw17.filesystemcomparator.Link link);

    public void visit(umbcs680.hw17.filesystemcomparator.File file);

    public void visit(Directory dir);
}