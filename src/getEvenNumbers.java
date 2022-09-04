import java.util.Arrays;

public class getEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        // arr의 배열길이만큼 새로운 배열선언
        // 짝수 개수를 count할 변수선언
        // for문과 if문을 이용해 짝수를 새로운 배열에 담고 count 증가
        // Arrays.copyOf를 이용해 증가한 count만큼 배열출력
        int[] even_arr = new int[arr.length];
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            if((arr[i]%2) == 0) {
                even_arr[count] = arr[i];
                count++;
            }
        }
        return Arrays.copyOf(even_arr, count);
    }
}
