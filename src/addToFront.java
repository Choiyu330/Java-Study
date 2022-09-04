public class addToFront {
    public int[] addToFront(int[] arr, int el) {
        // arr[] 배열길이 +1 만큼 새로운 배열 생성
        // System.arraycopy() 함수 이용하기
        // 배열 첫 번째에 추가
        int[] new_arr = new int[arr.length+1];

        System.arraycopy(arr, 0, new_arr, 1, arr.length);
        new_arr[0] = el;

        return new_arr;
    }
}
