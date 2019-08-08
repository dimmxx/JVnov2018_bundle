package conspect.lamba.German;

import java.util.Comparator;

public class BetComparator implements Comparator<Bet> {

    @Override
    public int compare(Bet o1, Bet o2) {
        return o1.getValue() - o2.getValue();
    }
}
