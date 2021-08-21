package string;

public class ReversingSpecificCharacter {
    public String solution(String input) {
        char[] str =input.toLowerCase().toCharArray();
        int lt = 0, rt = input.length()-1;
        while(lt < rt) {
            if(Character.isAlphabetic(str[lt])) {
                char tmp = str[lt];
                str[lt] = str[rt];
                str[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return str.toString();
    }
}
