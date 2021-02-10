public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int search(final List<Integer> A, int B) {
        
        int len = A.size();
        int start=0, end=len-1,mid=start+((end-start)/2), max=A.get(0), maxIndex = len-1;
        
        if(start==end){
            return start;
        }
        
        while(start<=end ){
            if(A.get(mid)>max)
            {
                max=A.get(mid);
                maxIndex = mid;
                start=mid+1;
            }
            if(A.get(mid)<max){
                end=mid-1;
            }
            mid=start+((end-start)/2);
        }
        if(maxIndex!=len-1){
            if(B>A.get(0)){
                start=0; end=maxIndex;
            }else{
                start=maxIndex+1; end = len-1;
            }
        }else{
            start=0;
            end=len-1;
        }
        while(start<=end){
            
            mid = start +((end-start)/2);
            if(A.get(mid)==B){
                return mid;
            }else if(A.get(mid)>B){
                end = mid-1;
            }else if(A.get(mid)<B){
                start = mid+1;
            }
        }
        if(A.get(mid)==B){
            return mid;
        }
        return -1;
    }
}
