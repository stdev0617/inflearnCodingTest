package array;

public class MaximumSum {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0; i < board.length; i++) {
            int tmp1 = 0;
            int tmp2 = 0;
            for(int j = 0; j < board[0].length; j++) {
                tmp1 += board[i][j];
                tmp2 += board[j][i];
            }
            answer = Math.max(answer, Math.max(tmp1, tmp2));
        }
        int tmp1 = 0;
        int tmp2 = 0;
        for(int i = 0; i < board.length; i++) {
            tmp1+=board[i][i];
            tmp2+=board[board.length-i][board.length-1];
        }
        answer = Math.max(answer, Math.max(tmp1, tmp2));
        return answer;
    }
}
