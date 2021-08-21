package string;

import java.util.stream.Stream;

public class RemoveDuplicatedCharacter {
    public String solution(String input) {
        int idx = 0;
        StringBuilder answer = new StringBuilder();
        while(idx < input.length()) {
            if(idx == input.indexOf(input.charAt(idx))) {
                answer.append(input.charAt(idx));
            }
            idx++;
        }
        return answer.toString();
    }
}
