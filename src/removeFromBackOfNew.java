import java.util.ArrayList;

public class removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        if (arrayList.size() == 0) return null;

        for(int i=0; i<arrayList.size()-1; i++) {
            arrayList2.add(arrayList.get(i));
        }
        return arrayList2;
    }
}
