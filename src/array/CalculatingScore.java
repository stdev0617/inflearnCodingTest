public class CalculatingScore {
    public int solution(int[] arr) {
        int score = 0;
        int total = 0;
        for(int i : arr) {
            if(arr[i] == 1) score++;
            else {
                total+=score;
                score=0;
            }
        }
        return total;
    }
}
