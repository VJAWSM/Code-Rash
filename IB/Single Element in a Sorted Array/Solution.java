public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int len = A.size();
        int start = 0, end=len-1, mid;
        int result = 0;
        
        while(start<=end&& start>=0&&end<len){
            mid = start + (end-start)/2;
            
            // System.out.println(start+" "+mid + " " +end);
            if(start==end){
                result = A.get(start);
                break;
            }else if(mid>0 && A.get(mid).equals(A.get(mid-1))){
                if(mid%2==0)
                    end=mid-1;
                else
                    start=mid+1;
            }else if(mid<len-1 && A.get(mid).equals(A.get(mid+1))){
                if(mid%2==0)
                    start=mid+1;
                else
                    end=mid-1;
            }else{
                result =  A.get(mid);
                break;
            }
        }
        return result;
        
        
    }
}
