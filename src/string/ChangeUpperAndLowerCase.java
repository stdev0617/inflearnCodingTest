package string;

public class ChangeUpperAndLowerCase {
    public String solution(String input) {
        StringBuilder sb = new StringBuilder();
        for(char c : input.toCharArray()) {
            // 아래의 c-'a' < 0 이라는 조건문을 Character.isLowerCase()를 통해 체크할 수도 있음
            if(c-'a' < 0) sb.append(Character.toLowerCase(c));
            else sb.append(Character.toUpperCase(c));
        }
        return sb.toString();
    }
}
