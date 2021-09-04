package array;

import java.util.Arrays;

public class GettingRank {
    public int[] solution(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for(int j = 0; j < arr.length; j++) {
                if(i == j) continue;
                if(arr[i] < arr[j]) cnt++;
            }
            result[i] = cnt;
        }
        return result;
    }
}
