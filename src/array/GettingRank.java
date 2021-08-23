import java.util.Arrays;

public class GettingRank {
    public int[] solution(int[] arr) {
        int[] copiedArr = new int[arr.length];
        Arrays.sort(copiedArr);
        int[] resultSet = new int[arr.length];
        int rank = 1;
        for(int i : arr) {
            for(int j : copiedArr) {
                if(i == j) {
                    resultSet[i] = rank;
                }
            }
            rank++;
        }
        return resultSet;
    }
}
