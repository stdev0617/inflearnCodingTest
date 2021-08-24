package two_pointers_and_sliding_windows;

public class MaximumLengthOfCoutinuousSubsequence {
    public int solution(int N, int target, int[] arr) {
        int answer = 0;
        for(int i = 0; i < N; i++) {
            int tmp = 0;
            int k = target;
            for(int j = i; j < N; j++) {
                if(k < 0) {
                    answer = Math.max(answer, tmp);
                    break;
                } else {
                    if(arr[j] == 0) {
                       k--;
                       tmp+=arr[j];
                    } else {
                        tmp+=arr[j];
                    }
                }
            }
        }
        return answer;
    }
}
