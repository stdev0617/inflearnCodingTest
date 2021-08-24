package two_pointers_and_sliding_windows;

public class SumOfSequenceNaturalNumber {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            int tmp = 0;
            for(int j = 1; j <= i; j++) {
                tmp+=j;
            }
            if(tmp == n) {
                answer++;
                break;
            }
            for(int j = 1+i; j <= n; j++){
                if(tmp > n) break;
                else if(tmp == n) {
                    answer++;
                    break;
                }
                tmp += i;
            }
        }
        return answer;
    }
}
