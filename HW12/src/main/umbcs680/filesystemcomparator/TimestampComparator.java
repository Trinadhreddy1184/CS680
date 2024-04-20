package umbcs680.filesystemcomparator;

import java.util.Comparator;

public class TimestampComparator implements Comparator<FSElement> {

    @Override
    public int compare(FSElement f1,FSElement f2){
        return f1.getCreationTime().compareTo(f2.getCreationTime());
    }
}

