import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        int numLen = number.length();
        int scope = k + 1;
        int first = 0;
        int index = 0;
        
        while(answer.length() != numLen - k){
            char max = 0;
            for(int i = first; i < scope; i++){
                if (number.charAt(i) > max) {
                    max = number.charAt(i);
                    index = i;
                }
            }
            answer.append(max);
            first = index + 1;
            if(index == scope){
                answer.append(answer.toString().substring(first, numLen));
            }
            scope++;
        }
        return answer.toString();
    }
}