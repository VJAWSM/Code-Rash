public class Solution {

    public int solve(ArrayList<Integer> A, int B) {
        
        return solving(A, B, 0, 0);
    }
    
    public int solving(ArrayList<Integer> A, int B, int sum, int index){
        if(sum<=1000 && B==0){
            return 1;
        }
        if(sum>1000){
            return 0;
        }
        if (B<1){
            return 0;
        }
        
        
        int count = 0;
        for(int i=index;i<A.size();i++){
            sum+=A.get(i);
            //System.out.println(B+" "+sum);
            count += solving(A,B-1,sum,i+1 );
            sum-=A.get(i);
        }
        //System.out.println(count);
        return count;
    }
}
