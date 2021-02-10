public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        int start=0, end=0, k=0, sum=0;
        int len = A.size();
        int i=0;
        while(sum<B && i<len){
            sum+=A.get(i);
            i++;
        }
        if(i==len && sum<B){
            return len;
        }
        end = i-2;
        sum -= A.get(i-1);
        k=end-start+1;
        for(i=end+1;i<len;i++){
            end++;
            sum += A.get(i);
            while(sum>B){
                sum-=A.get(start);
                start++;
            }
            if(end-start+1<k){
                
                k=end-start+1;
            }
        }
        
        return k;
        
    }
}
