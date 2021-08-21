package string;

public class FindingCharacter {
    public int findingCharacter(String input, char target){
        int answer = 0;
        for(char c : input.toLowerCase().toCharArray()) {
            if(c == target) answer++;
        }
        return answer;
    }
}
