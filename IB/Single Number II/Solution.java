public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        
        int ones=0, twos=0;
        
        for(Integer i : A){
            ones = ((i^ones)&~twos);
            twos = ((i^twos)&~ones);
        }
        
        return ones;
        
        
    }
}
