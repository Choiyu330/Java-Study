import java.util.*;

public class findBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        // 배열에서 가장 큰 수를 리턴하기
        // Integer 타입으로 리턴
        // 빈 배열을 입력받은 경우 null 리턴

        if(arr.length == 0) return null;

        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }
}
