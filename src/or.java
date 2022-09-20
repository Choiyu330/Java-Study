import java.util.*;

public class or {
    public static void main(String[] args) {
        boolean output = or(new boolean[]{false, true, false});
        System.out.println(output);
    }
    // TODO:
    public static boolean or(boolean[] arr){
        if(arr.length == 0)
            return false;

        boolean head = arr[0];
        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head || or(tail);
    }
}