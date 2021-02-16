public class Solution {
    public int sqrt(int A) {
        
        int start=1, end=A, mid=0;
        long res = 0L;
        int result =0;
        if(A==0){
            return 0;
        }
        
        while(start<=end){
            mid = start + ((end-start)/2);
            res = A/mid;
            if(res<mid){
                end = mid-1;
            }else{
                if(result<mid)result=mid;
                start=mid+1;
            }
            
        }
        return result;
        
    }
}
