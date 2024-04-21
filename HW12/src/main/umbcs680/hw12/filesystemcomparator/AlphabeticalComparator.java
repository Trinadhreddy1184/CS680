package umbcs680.hw12.filesystemcomparator;

import java.util.Comparator;

public class AlphabeticalComparator implements Comparator<FSElement> {

    @Override
    public int compare(FSElement f1,FSElement f2){
        return f1.getName().compareTo(f2.getName());
    }
}

