import java.util.*;

public class and {
    public static void main(String[] args) {
        boolean output = and(new boolean[]{true, true, false});
        System.out.println(output);
    }
    // TODO:
    public static boolean and(boolean[] arr){
        if(arr.length == 0)
            return true;

        boolean head = arr[0];
        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head && and(tail);
    }
}