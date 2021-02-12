public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        
        int len = A.size();
        if(len<B){
            return -1;
        }
        
        int noofpages = 0;
        for(Integer i:A){
            noofpages+=i;
        }
        
        int start =0, end = noofpages, mid=0;
        int max = Integer.MAX_VALUE;
        while(start<=end){
            mid = start+((end-start)/2);
            System.out.println(start+" "+mid+" "+end);
            if(possible(A, mid, B)){
                max = mid>max?max:mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return max;
    }
    
    private boolean possible(ArrayList<Integer>A, int nop, int B){
        
        int len = A.size();
        int sum=0, nos=1;
        
        for(Integer i:A){
            
            if(i>nop)return false;
            
            if(sum+i>nop){
                sum=i;
                nos++;
                if(nos>B){
                    return false;
                }
            }else {
                sum+=i;
            }
        }
        
        return true;
    }
}
