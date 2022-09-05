import java.util.*;

public class fibonacci {
    public int[] fibonacci(int num) {
        int[] arr = new int[100];

        arr[1] = 1;
        arr[2] = 1;

        for(int i=3; i<100; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        // 특정위치까지 잘라서 반환하는 함수
        return Arrays.copyOf(arr, num+1);
    }
}
