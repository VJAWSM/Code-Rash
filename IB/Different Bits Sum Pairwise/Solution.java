public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        
        int len = A.size();
        long count = 0;
        long temp = 0;
        int mask = 1;
        int mod = 1000000007;
        
        for(int i=0;i<32;i++){
            for(int j=0;j<len;j++){
                if(((A.get(j)&mask)==mask)){
                    temp++;
                }
            }
            count = count + (((temp*(len-temp))%mod)+mod)%mod;
            mask = mask<<1;
            temp=0;
        }
        count = (((count*2)%mod)+mod)%mod;
        return (int)count;
        
    }
}
