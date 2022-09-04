public class addToBack {
    public int[] addToBack(int[] arr, int el) {
        // arr[] 배열길이 +1 만큼 새로운 배열생성
        // System.arraycopy() 함수 이용하기
        // 배열 마지막에 추가
        int[] new_arr = new int[arr.length+1];

        System.arraycopy(arr, 0, new_arr, 0, arr.length);
        new_arr[arr.length] = el;

        return new_arr;
    }
}
