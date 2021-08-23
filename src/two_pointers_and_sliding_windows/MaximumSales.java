package two_pointers_and_sliding_windows;

public class MaximumSales {
    /**
     * 아래는 시간초과 됨.
     * @param arr
     * @param K
     * @return
     */
//    public int solution(int[] arr, int K) {
//        int answer = Integer.MIN_VALUE;
//        for(int i = 0; i < arr.length-K; i++) {
//            int tmp=0;
//            for(int j = 0; j < K; j++) {
//                tmp+=arr[i+j];
//            }
//            answer = Math.max(answer, tmp);
//        }
//        return answer;
//    }

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
}
