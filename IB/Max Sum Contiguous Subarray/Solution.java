public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        
        int result=Integer.MIN_VALUE;
        int maxUnion = 0;
        
        for(int i=0;i<A.size();i++){
            maxUnion +=A.get(i);
            if(result<maxUnion){
                result = maxUnion;
            }
            if(maxUnion<0){
                maxUnion = 0;
            }
        }
        
        return result;
    }
}
//O(n) time O(1) space