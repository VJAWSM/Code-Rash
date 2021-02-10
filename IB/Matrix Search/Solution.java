public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
        
        int r = A.size();
        int c = A.get(0).size();
        
        int start = 0, end = r*c-1, mid=0;
        while(start<=end){
            
            mid = start+((end-start)/2);
            //System.out.println(start+" "+mid+" "+end);
            if(A.get(mid/c).get(mid%c)==B){
                return 1;
            }else if(A.get(mid/c).get(mid%c)>B){
                end = mid-1;
            }else if(A.get(mid/c).get(mid%c)<B){
                start = mid+1;
            }
        }
        return 0;
        
    }
}
