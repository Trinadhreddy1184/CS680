package umbcs680.filesystemcomparator;

import java.util.Comparator;

public class ReverseSizeComparator implements Comparator<FSElement> {

    @Override
    public int compare(FSElement f1,FSElement f2){
        return f2.getTotalSize() - f1.getTotalSize();
    }
}

