import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Main {
    public int solution(int N, int target, int[] arr) {
        int answer = 0;
        int lt = 0, rt = 0;

        int tmp = 0;
        while(lt < N && rt < N) {
            if(tmp < target) {
                tmp += arr[rt++];
            } else if (tmp == target) {
                answer++;
                tmp -= arr[lt++];
            } else {
                tmp -= arr[lt++];
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int target = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(main.solution(N, target, arr));
        return ;
    }
}
