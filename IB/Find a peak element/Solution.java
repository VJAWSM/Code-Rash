public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int len = A.size();
        int start=0, end=len-1, mid=start + ((end-start)/2), temp=0;
        
            //System.out.println(start+" "+mid+" "+end);
        if(start==end){
            return A.get(start);
        }else if(A.get(start)>A.get(start+1)){
            return A.get(start);
        }else if(A.get(end)>A.get(end-1)){
            return A.get(end);
        }
        
        while(start<end && mid>0 && mid<len-1){
            //System.out.println(start+" "+mid+" "+end);
            temp = A.get(mid);
            if(temp>A.get(mid-1)&&temp>A.get(mid+1)){
                return temp;
            }else if(temp<=A.get(mid-1)){
                end = mid-1;
            }else if(temp<=A.get(mid+1)){
                start = mid+1;
            }
            mid = start + ((end-start)/2);
        }
        return A.get(mid);
    }
}
