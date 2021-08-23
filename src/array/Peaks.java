public class Peaks {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board.length - 1; j++) {
                if(board[i][j] < board[i-1][j]) continue;
                else if(board[i][j] < board[i][j-1]) continue;
                else if(board[i][j] < board[i+1][j]) continue;
                else if(board[i][j] < board[i][j+1]) continue;
                else {
                    System.out.println("i: " + i + ", j: " + j +"board[i][j]: " + board[i][j] );
                    answer++;
                }
            }
        }
        return answer;
    }
}
