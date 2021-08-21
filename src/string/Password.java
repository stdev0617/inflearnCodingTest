package string;

public class Password {
    public String solution(String input, int T) {
        String answer = "";
        for(int i = 0; i < T; i++) {
            String passcode = input.substring(i*7,i*7+7);
            String tmp = "";
            // replace를 활용하자!
            for(char c : passcode.toCharArray()) {
                if(c == '#') {
                    tmp+=1;
                } else {
                    tmp+=0;
                }
            }
            int result = Integer.parseInt(tmp,2);
            answer += (char) result;
        }
        return answer;
    }
}
