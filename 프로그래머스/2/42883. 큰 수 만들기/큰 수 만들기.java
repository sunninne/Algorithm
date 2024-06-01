import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int numLen = number.length();
        int ansLen = numLen - k;
        int scope = numLen - (ansLen - 1);
        int first = 0;
        
        int[] digits = new int[numLen];
        for(int i=0; i<numLen; i++) 
                digits[i] = number.charAt(i) - '0';
        
        int index = 0;
        while(answer.length() != ansLen){
            int max = 0;
            for(int i = first; i<scope; i++){
                if (digits[i] > max) {
                    max = digits[i];
                    index = i;
                }
            }
            answer.append(Integer.toString(max));
            first = index + 1;
            if(index == scope){
                answer.append(answer.toString().substring(first, numLen));
            }
            scope++;
        }
        return answer.toString();
    }
    
     
}