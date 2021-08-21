package string;

public class CompressingString {
    public String solution(String input) {
        String answer = "";
        for(int i = 0; i < input.length(); i++){
            if(i != input.length()-1 && input.charAt(i) == input.charAt(i+1)) {
                int k = 0;
                while(i+k+1 < input.length() && input.charAt(i+k) == input.charAt(i+k+1)) {
                    k++;
                }
                answer+=(input.charAt(i) + String.valueOf(k+1));
                i = i+k;
            } else {
                answer+=input.charAt(i);
            }
        }
        return answer;
    }
}
