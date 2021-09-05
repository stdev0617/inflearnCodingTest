import java.util.*;

public class Main {
    public int solution(int N, int[][] arr) {
        int[][] newArr = new int[N][2];
        int result = 1;
        int answer = Integer.MIN_VALUE;
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        Arrays.sort(newArr, (a1, a2) -> {
            if(a1[0] == a2[0]) return Integer.compare(a1[1], a2[1]);
            else return Integer.compare(a1[0],a2[0]);
        });

        for(int i = 0; i < N; i++) {
            result = 1;
            for(int j = i+1; j < N; j++) {
                if(newArr[i][0] <= newArr[j][0] && newArr[j][0] < newArr[i][1]) {
                    result++;
                } else if(newArr[i][1] > newArr[j][1] && newArr[i][0] < newArr[j][1]) {
                    result++;
                }
            }
            answer = Math.max(answer, result);
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
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        int result = main.solution(N, arr);
        System.out.println(result);
        return ;
    }
}
