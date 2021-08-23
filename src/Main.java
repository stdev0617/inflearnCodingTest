import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {

    public int solution(int[] arr, int K) {
        int tmp = 0, answer=0;
        for(int i = 0; i < K; i++) {
            tmp+=arr[i];
        }
        answer = tmp; // 이걸 안해주고, answer = Integer.MIN_VALUE하면 에러가남
        for(int i = K; i<arr.length; i++) {
            tmp = tmp - arr[i-K] + arr[i];
            answer = Math.max(answer, tmp);
        }
        return answer;
    }
    public static void main(String[] args){
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int K = in.nextInt();
        int[] arr1 = new int[T];
        for(int i = 0; i < T; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.print(main.solution(arr1, K));
        return ;
    }
}
