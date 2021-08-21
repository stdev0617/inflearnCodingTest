package string;

public class SubtractingNumber {
    public int solution(String input) {
        char[] arr = input.toCharArray();
        String answer = "";
        for(char c : arr) {
            if(Character.isDigit(c)){
                answer+=c;
            }
        }
        return Integer.parseInt(answer);
    }
}
