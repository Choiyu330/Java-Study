package DailyCoding;

import java.util.*;

public class convertListToObject {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = new convertListToObject(arr);

        System.out.println(output);

    }
    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        HashMap<String, String> result = new HashMap<>();
        if(arr.length == 0) return result;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length != 0) {
                if(!result.containsKey(arr[i][0])) {
                    result.put(arr[i][0], arr[i][1]);
                }
            }
        }
        return result;
    }
}

