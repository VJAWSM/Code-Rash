public class Solution {
    public int solve(int A) {
        long l=1, r=A, mid;
        int result = 0;
        
        while(l<=r){
            mid = l+((r-l)/2);
            long temp = mid%2==0?((mid/2)*(mid+1)):mid*((mid+1)/2);
            System.out.println(l+" "+mid+" "+r);
            if(temp<=A){
                result = (int)mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return result;
    }
}
