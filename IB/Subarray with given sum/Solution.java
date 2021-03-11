public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        
        int curr_sum = A.get(0); 
        int n=A.size();
        int p1=0, p2=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(p2<n&&p1<=p2){
            
            //System.out.println(p1+" "+p2+" "+curr_sum);
            if(curr_sum <B){
                p2++;
                if(p2==n)break;
                curr_sum+=A.get(p2);
            }else if(curr_sum>B){
                curr_sum-=A.get(p1);
                p1++;
                if(p1==p2){
                    p2++;
                    if(p2==n)break;
                    curr_sum+=A.get(p2);
                }
            }else{
                for(int i=p1;i<=p2;i++){
                    ans.add(A.get(i));
                }
                return ans;
            }
        }
        if(curr_sum==B){
            for(int i=p1;i<p2;i++){
                    ans.add(A.get(i));
                }
            return ans;
        }
        ans.add(-1);
        return ans; 
        
    }
}
