package array;

public class ViewedStudent {
    public int solution(int[] arr) {
        int cnt = 0;
        int tall = 0;
        for(int i : arr) {
            if(i > tall) {
                cnt++;
                tall = i;
            }
        }
        return cnt;
    }
}
