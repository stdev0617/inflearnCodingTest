package map;

import java.util.*;

public class KthLargestNumber {
    public int solution(int[] arr, int K) {
        Set<Integer> totals = new TreeSet<>(Collections.reverseOrder());
        int answer = -1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                for(int k = j+1; k < arr.length; k++) {
                    totals.add(arr[i]+arr[j]+arr[k]);
                }
            }
        }

        int cnt = 0;
        for(int t: totals) {
            cnt++;
            if(cnt == K) return t;
        }
        return answer;
    }
}
