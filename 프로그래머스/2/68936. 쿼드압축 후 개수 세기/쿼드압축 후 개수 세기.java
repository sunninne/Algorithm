import java.util.*;

class Solution {
    public static int[] answer;
    public int[] solution(int[][] arr) {
        answer = new int[2];
        
        compression(arr, 0, 0, arr.length);
    
        return answer;
    }
    
    public static void compression(int[][] arr, int x, int y, int size){
        if(isSame(arr, x, y, size)){
            if(arr[x][y] == 0){
                answer[0]++;
            }
            else{
                answer[1]++;
            }
        }
        
        else {
            compression(arr, x, y, size/2);
            compression(arr, x + size/2, y, size/2);
            compression(arr, x, y + size/2, size/2);
            compression(arr, x + size/2, y + size/2 , size/2);
        }
    }
    
    private static boolean isSame(int[][] arr, int x, int y, int size) {
        int value = arr[x][y];
        for(int i = x; i < x + size; i++) {
            for(int j = y; j < y + size; j++) {
                if(arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}