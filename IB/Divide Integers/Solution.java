public class Solution {
    public int divide(int A, int B) {
        long temp = (long)A/(long)B;
        if(temp>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        int result = (int) temp;
        return result;
    }
}