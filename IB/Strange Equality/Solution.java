public class Solution {
    public int solve(int A) {
        int x = 0, y=0;
        
        int temp=A, count =0;
        
        while(temp>0){
            temp = temp>>1;
            count++;
        }
        y = 1<<count;
        x = (y-1)^A;
        return x^y;
        
    }
}
