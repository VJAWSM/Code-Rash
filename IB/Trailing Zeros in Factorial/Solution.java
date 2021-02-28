public class Solution {
    public int trailingZeroes(int A) {
        
        if(A==0||A==1){
            return 0;
        }
        int num = 5; int fact=5;
        int ans = 0, i=1;
        while(num<=A){
            //System.out.println((int)Math.pow(fact, i));
            num = (int)Math.pow(fact, i);
            ans+=A/num;
            i++;
        }
        
        
        return ans;
        
    }
}
