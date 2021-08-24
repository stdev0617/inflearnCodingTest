package two_pointers_and_sliding_windows;

public class ContinuousSubsequence {
    // 테스트 입력값은 맞는데 뭐가 틀리는지 모르는 문제
    public int solution(int N, int target, int[] arr) {
        int answer = 0;
        int lt = 0, rt = 0;
        int tmp = 0;
        while(lt < N && rt < N) {
            if(tmp < target) {
                tmp += arr[rt++];
            } else if (tmp == target) {
                answer++;
                tmp -= arr[lt--];
            } else {
                tmp -= arr[lt--];
            }
        }
        return answer;
    }
}
