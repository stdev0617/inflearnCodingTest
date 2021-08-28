package map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Anagram {
    public String solution(String input1, String input2) {
        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();
        for(char c: input1.toCharArray()) {
            if(first.get(c) == null) {
                first.put(c, 1);
            } else {
                first.put(c, first.get(c)+1);
            }
        }
        for(char c: input2.toCharArray()) {
            if(second.get(c) == null) {
                second.put(c, 1);
            } else {
                second.put(c, second.get(c)+1);
            }
        }

        AtomicReference<String> answer = new AtomicReference<>("YES");
        first.entrySet().forEach(fst -> {
            if(second.get(fst.getKey()) == null) {
                answer.set("NO");
            } else if(fst.getValue() != second.get(fst.getKey())) {
                answer.set("NO");
            }
        });
        return answer.toString();
    }
}
