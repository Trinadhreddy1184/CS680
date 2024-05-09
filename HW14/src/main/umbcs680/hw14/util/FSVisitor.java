package umbcs680.hw14.util;
import  umbcs680.hw14.filesystemcomparator.*;
public interface FSVisitor {

    public void visit(umbcs680.hw14.filesystemcomparator.Link link);

    public void visit(umbcs680.hw14.filesystemcomparator.File file);

    public void visit(Directory dir);
}