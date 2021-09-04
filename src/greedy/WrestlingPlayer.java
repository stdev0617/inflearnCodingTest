package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class WrestlingPlayer {
    public int solution(int[][] arr) {
        int answer = 0;
        int[][] newArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newArr, (a1,a2) -> {
            if(a1[0] == a2[0]) return Integer.compare(a2[0], a1[0]);
            else return Integer.compare(a2[1],a1[1]);
        });

        for(int i = 0; i < newArr.length; i++) {
            for(int j = i+1; j < newArr.length; j++) {
                if(newArr[i][0] > newArr[j][0] && newArr[i][1] > newArr[j][1]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
