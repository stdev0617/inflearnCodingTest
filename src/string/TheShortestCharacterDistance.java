package string;

public class TheShortestCharacterDistance {
    public int solution(String input) {
        int[] board = new int[input.length()-2];
        String[] arr = input.split("\\s");
        int idx = 1;
        for(int i = 0; i < arr[0].length(); i++) {
            if(arr[0].charAt(i) == arr[1].charAt(0)){
                idx = 1;
            } else {
                board[i] = idx;
            }
        }
        idx = 1;
        for(int i = arr[0].length()-1; i >= 0; i++) {
            if(arr[0].charAt(i) == arr[1].charAt(0)){

            }
        }
        return 0;
    }
}
