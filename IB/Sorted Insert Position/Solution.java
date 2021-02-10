public class Solution {
    public int searchInsert(ArrayList<Integer> A, int B) {
        
        int len = A.size(), res=0;
        int start = 0, end = len-1, mid=0;

        if(start==end){
            if(A.get(start)==B){
                return start;
            }else{
                return start+1;
            }
        }
        
        while(start<end){
            mid = start + ((end-start)/2);
            
            //System.out.println(start+" "+mid+" "+end+" "+A.get(mid));
            if(A.get(mid)==B){
                return mid;
            } else if(A.get(mid)<B){
                start = mid+1;
            } else if(A.get(mid)>B){
                end = mid-1;
            }
        }
        mid = start + ((end-start)/2);
        if(A.get(mid)==B){
            res= mid;
        } else if(A.get(mid)<B){
            res = mid+1;
        } else if(A.get(mid)>B){
            res = mid;
        }
        //System.out.println(start+" "+mid+" "+end+" "+A.get(mid));
        return res;
        
    }
}
