package umbcs680.filesystemcomparator;

import java.util.Comparator;

public class SizeComparator implements Comparator<FSElement> {

    @Override
    public int compare(FSElement f1,FSElement f2){
        return f1.getTotalSize() - f2.getTotalSize();
    }
}

