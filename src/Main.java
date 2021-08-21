import java.util.Scanner;

public class Main {
    public String solution(String input, int T) {
        String answer = "";
        for(int i = 0; i < T; i++) {
            String passcode = input.substring(i*7,i*7+7);
            String tmp = "";
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
    public static void main(String[] args){
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        System.out.println(main.solution(in.nextLine(),T));
        return ;
    }
}
