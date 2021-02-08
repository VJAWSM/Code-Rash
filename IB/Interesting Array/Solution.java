public class Solution {
    public String solve(ArrayList<Integer> A) {
        
        int xor = 0;
        
        for(Integer i:A){
            xor^=i;
        }
        
        if((xor&1)==1){
            return "No";
        }
        return "Yes";
        
    }
}
