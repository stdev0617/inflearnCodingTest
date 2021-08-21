package string;

public class WordWithinSentence {
    public String solution(String input) {
        String[] tmp = input.split("\\s");
        int maxVal = -1;
        //int max = Integer.MIN_VALUE; 이거 쩌는듯
        String answer = "";
        for(String s : tmp) {
            if(maxVal < s.length()) {
                answer = s;
                maxVal = s.length();
            }
        }
        return answer;
    }
}
