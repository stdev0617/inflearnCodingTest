package greedy;

import java.util.Arrays;

public class MeetingRoomAssignment {
    /** 풀이
     * 끝나는 시간 위주로 정렬을 하되, 같은 값은 시작시간을 기준으로 정렬한다.
     *
    **/
    public int solution(int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int N = arr.length;
        int[][] newArr = new int[N][2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        int endTime = 0;

        for(int[] ob : newArr) {
            if(ob[0] >= endTime) {
                answer++;
                endTime = ob[1];
            }
        }

        return answer;
    }
}
