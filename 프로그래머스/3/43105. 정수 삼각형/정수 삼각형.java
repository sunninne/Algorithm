import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] B = new int[triangle.length][];
        for (int i = 0; i < triangle.length; i++) {
            B[i] = triangle[i].clone();
        }
        
        for (int i = 1; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                if (j == 0) {
                    B[i][j] += B[i - 1][j]; 
                } else if (j == B[i].length - 1) {
                    B[i][j] += B[i - 1][j - 1]; 
                } else {
                    B[i][j] += Math.max(B[i - 1][j - 1], B[i - 1][j]); 
                }
            }
        }
        
        int answer = Arrays.stream(B[B.length - 1]).max().getAsInt();
        return answer;
    }
}