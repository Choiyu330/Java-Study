import java.util.ArrayList;
import java.util.Iterator;

public class sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        int sum = 0;
        if (arrayList.size() == 0) return 0;

        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}
