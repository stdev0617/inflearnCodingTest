import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board.length - 1; j++) {
                if(board[i][j] < board[i-1][j]) continue;
                else if(board[i][j] < board[i][j-1]) continue;
                else if(board[i][j] < board[i+1][j]) continue;
                else if(board[i][j] < board[i][j+1]) continue;
                else {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main m = new Main();
        Scanner in=new Scanner(System.in);
        int T = in.nextInt();
        int[][] arr = new int[T+2][T+2];
        for(int i = 1; i < T+1; i++) {
            for(int j = 1; j < T+1; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < T+2; i++) {
            arr[0][i] = 0;
            arr[i][0] = 0;
            arr[T+1][i] = 0;
            arr[i][T+1] = 0;
        }

        System.out.println(m.solution(arr));
        return ;
    }
}
