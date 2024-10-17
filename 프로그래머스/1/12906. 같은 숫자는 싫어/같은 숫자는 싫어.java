import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        int save = -1; 

        for (int i : arr) {
            if (save != i) { 
                queue.offer(i);
                save = i;
            }
        }

        int[] result = new int[queue.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = queue.poll(); 
        }

        return result;
    }
}
