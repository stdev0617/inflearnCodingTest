package string;

public class PalindromString {
    public String solution(String input) {
        char[] arr = input.toLowerCase().toCharArray();
        int lt = 0, rt = arr.length-1;
        while(lt < rt) {
            if(arr[lt] != arr[rt]) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }

    public String solution2(String input) {
        String answer = "NO";
        String tmp = new StringBuilder(input).reverse().toString();
        if(input.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;
    }
}
