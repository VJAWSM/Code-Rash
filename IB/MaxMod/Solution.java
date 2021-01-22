public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE, max1 = Integer.MIN_VALUE;
        
        for(Integer i:A){
            if(i>max)max=i;
        }
        
        for(Integer i:A){
            if(i>max1&&i<max)max1=i;
        }
        
        return max1;
    }
}
