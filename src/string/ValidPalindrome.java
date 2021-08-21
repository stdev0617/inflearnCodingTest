package string;

public class ValidPalindrome {
    public String solution(String input) {
        char[] arr = input.toLowerCase().toCharArray();
        int lt = 0, rt = arr.length-1;
        while(lt < rt) {
            if(!Character.isAlphabetic(arr[lt])){
                lt++;
            } else if(!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                if(arr[lt] != arr[rt]) {
                    return "NO";
                }
                lt++;
                rt--;
            }
        }
        return "YES";
    }

    public String solution2(String s) {
        String answer = "NO";
        // [^A-Z]의 뜻은 대문자 A~Z가 아니면 이라는 뜻. ^이 NOT임.
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";
        return answer;
    }
}
