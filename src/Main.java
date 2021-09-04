import java.util.*;

public class Main {
    public int solution(int[][] arr) {
        int answer = 0;
        int N = arr.length;
        int[][] newArr = new int[N][2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        int endTime = 0;
        Arrays.sort(newArr, (a1, a2) -> {
            if(a1[1] == a2[1]) return Integer.compare(a1[0],a2[0]);
            else return Integer.compare(a1[1],a2[1]);
        });

        for(int[] ob : newArr) {
            if(ob[0] >= endTime) {
                answer++;
                endTime = ob[1];
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
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        int result = main.solution(arr);
        System.out.println(result);
        return ;
    }
}
