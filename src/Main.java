import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0; i < board.length; i++) {
            System.out.println("");
            for(int j = 0; j < board.length;j++) {
                System.out.print(board[i][j] + " ");
            }
        }
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
        Main main = new Main();
        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int target = in.nextInt();
//        int[] arr = new int[N];
//        for(int i = 0; i < N; i++) {
//            arr[i] = in.nextInt();
//        }
        int N = in.nextInt();
        int[][] arr = new int[N+2][N+2];
        for(int i = 0; i < N+2; i++) {
            for (int j = 0; j < N+2; j++) {
                if(i == 0 || j == 0) arr[i][j] = 0;
                else if(i == N+1 || j == N+1) arr[i][j] = 0;
                else arr[i][j] = in.nextInt();
            }
        }
        int result = main.solution(arr);
        System.out.println(result);
        return ;
    }
}
