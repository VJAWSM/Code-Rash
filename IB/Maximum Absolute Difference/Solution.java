public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int maxDif=Integer.MIN_VALUE;
        int minDif=Integer.MAX_VALUE;
        int result=Integer.MIN_VALUE;
        int num, sum, dif;
        for(int i=0;i<A.size();i++){
            num = A.get(i);
            sum = num+i;
            dif = num-i;
            if(maxSum<sum){
                maxSum=sum;
            }
            if(minSum>sum){
                minSum=sum;
            }
            if(maxDif<dif){
                maxDif=dif;
            }
            if(minDif>dif){
                minDif=dif;
            }
        }
        int res1 = maxSum-minSum;
        int res2 = maxDif-minDif;
        
        return res1>res2?res1:res2;
        
    }
}
//O(n) time O(1) space