package map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class ClassPresident {
    public char solution(String input) {
        Map<Character, Integer> votes = new HashMap<>();
        int maxVal = Integer.MIN_VALUE;
        char answer = input.charAt(0);
        for(char c: input.toCharArray()) {
            if(votes.get(c) == null) {
                votes.put(c, 1);
            } else {
                votes.put(c, votes.get(c)+1);
            }
        }
        for(Map.Entry<Character, Integer> m : votes.entrySet()){
            if(m.getValue() > maxVal) {
                maxVal = m.getValue();
                answer = m.getKey();
            }
        }
        return answer;
    }
}
