public class Solution {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        if(G<A || E>C){
            return 0;
        }
        if(H<B || F>D){
            return 0;
        }
        
        return 1;
        
        
    }
}
