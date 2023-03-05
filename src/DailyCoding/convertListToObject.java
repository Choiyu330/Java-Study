//package DailyCoding;
//
//import java.util.*;
//
//public class convertListToObject {
//    public static void main(String[] args) {
//        String[][] arr = new String[][]{
//                {"make", "Ford"},
//                {"model", "Mustang"},
//                {"year", "1964"},
//                {"make", "Bill"},
//        };
//
//        HashMap<String, String> output = new convertListToObject(arr);
//
//        System.out.println(output);
//
//    }
//    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
//        HashMap<String, String> hashmap = new HashMap<>();
//
//        for(int i=0; i<arr.length; i++) {
//            // 빈 배열이 아니고 배열 안에 아무것도 들어있지 않을 때 hashmap에 key, value 값 넣기
//            if(arr[i].length != 0) {
//                if(!hashmap.containsKey(arr[i][0])) {
//                    hashmap.put(arr[i][0], arr[i][1]);
//                }
//            }
//        }
//        return hashmap;
//    }
//}
//
