public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        int len = A.size();
        Collections.sort(A);
        int maxdist = (A.get(len-1)-A.get(0))/(B-1);
        int start = 0, end = maxdist, mid = 0;
        
        while(start<=end){
            mid = start + ((end-start)/2);
            if(possible(A,mid,B)){
                start = mid+1;
                maxdist = mid;
            }else{
                end=mid-1;
            }
        }
        return maxdist;
        
    }
    
    private boolean possible(ArrayList<Integer> A, int dist, int noofcows){
        int current=A.get(0);
        noofcows--;
        int len = A.size();
        for(int i=1;i<len&& noofcows>0;i++){
            if(A.get(i)>=current+dist){
                current = A.get(i);
                noofcows--;
            }
        }
        if(noofcows==0){
            return true;
        }
        return false;
    }
}
