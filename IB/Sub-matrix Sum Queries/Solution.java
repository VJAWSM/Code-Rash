public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {
        
        int ra, rb, ca, cb, cur;
        int rlen = A.size(), clen = A.get(0).size(), qlen = B.size();
        int mod = 1000000007;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<rlen; i++){
            for(int j=0; j<clen; j++){
                cur = A.get(i).get(j);
                if(i-1>=0){
                    cur = (((cur + A.get(i-1).get(j))%mod)+mod)%mod;
                }
                if(j-1>=0){
                    cur = (((cur + A.get(i).get(j-1))%mod)+mod)%mod;
                }
                if(i-1>=0 && j-1>=0){
                    cur = (((cur - A.get(i-1).get(j-1))%mod)+mod)%mod;
                }
                A.get(i).set(j, cur);
            }
        }
        
        int cal;
        for(int i=0; i<qlen; i++){
            ra = B.get(i)-1;
            rb = D.get(i)-1;
            ca = C.get(i)-1;
            cb = E.get(i)-1;
            cal = A.get(rb).get(cb);
            if(ra-1>=0){
                cal= (((cal-A.get(ra-1).get(cb))%mod)+mod)%mod;
            }
            if(ca-1>=0){
                cal= (((cal-A.get(rb).get(ca-1))%mod)+mod)%mod;
            }
            if(ra-1>=0 && ca-1>=0){
                cal= (((cal+A.get(ra-1).get(ca-1))%mod)+mod)%mod;
            }
            result.add(cal);
        }
        
        return result;
    }
}

//O(1) time for every query after O(n) calculation time, O(1) space.