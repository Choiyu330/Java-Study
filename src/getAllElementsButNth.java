import java.util.*;

public class getAllElementsButNth {
    public int[] getAllElementsButNth(int [] arr, int n) {
        int[] empty = {};
        int n2 = 0;
        if (arr.length <= n) {
            return arr;
        }
        int [] arr2 = new int[arr.length-1];
        for(int i=0; i<arr.length; i++) {
            if(i == n) {
                continue;
            }
            arr[n2] =  arr[i];
            n2++;
        }
        return arr2;
    }
}
