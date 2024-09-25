class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 0 || arr[0] == 10) {
            return new int[] {-1};
        }
        
        //최솟값 찾기
        int min = arr[0];
        for(int a : arr){
            if (min > a) {
                min = a;
            }
        }
        
        int[] answer = new int[arr.length -1];
        int inx = 0;
        for (int r : arr) {
            if (min != r) {
               answer[inx] = r;
                inx++;
            }
        }
        
        return answer;
    }
}