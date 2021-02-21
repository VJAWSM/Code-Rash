public class Solution {
    public String solve(ArrayList<Integer> A) {
        
        Long d = 0L;
        
        for(Integer i:A){
            d+=i;
        }
        
        return d.toString();
        
    }
}
