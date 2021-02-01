public class Solution {
    public int solve(int A, int B, int C) {
        
        int gcd=B;
        int b=B, c=C;
        int lcm=1;
        int num=1;
        int result = 0;
        
        while(num!=0){
            num=B%C;
            if(num==0){
                gcd = C;
                break;
            }else{
                B=C;
                C=num;
            }
        }
        lcm = (b*c)/gcd;
        if(lcm<A){
            result = A/lcm;
        }
        
        return result;
        
        
    }
}
//At least O(log n), actually O(log log n) time, O(1) space