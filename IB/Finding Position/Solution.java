public class Solution {
    public int solve(int A) {
        
        int result = 0;
        
        while(A>1){
            A/=2;
            result++;
        }
        
        return (int)Math.pow(2, result);
    }
}
