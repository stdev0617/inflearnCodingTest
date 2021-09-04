package array;

public class Fibonacci {
    public int[] solution(int T) {
        int[] arr = new int[T];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < T; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr;
    }
}
