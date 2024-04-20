package umbcs680.filesystemcomparator;

import java.util.Comparator;

public class ReverseAlphabeticalComparator implements Comparator<FSElement> {

    @Override
    public int compare(FSElement f1,FSElement f2){
        return f2.getName().compareTo(f1.getName());
    }
}
