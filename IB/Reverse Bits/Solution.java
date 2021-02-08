public class Solution {
	public long reverse(long A) {
	    long B = 0;
        int mask = 1;
        B=B^(A&mask);
        for(int i=0;i<31;i++){
            B=B<<1;
            A = A>>1;
            B = B ^ (A&mask);
            
        }
    
        return B;
	}
}