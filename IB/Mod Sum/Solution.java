public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int [] ar  = new int[1001];
        Arrays.fill(ar,0);
        int mod = 1000000007;
        long sum = 0;
        
        for(Integer i:A){
            ar[i]++;
        }
        
        for(int i=1;i<=1000;i++)
        {
            int a=ar[i];
            if(ar[i]==0)continue;
            for(int j=1;j<=1000;j++)
            {
                if(ar[j]==0)continue;
                int b=ar[j];
                int modval=j%i;
                
                int temp=ar[i]*ar[j]*modval;
                sum=((sum%mod)+(temp%mod))%mod;
            }
        }
        
        return (int)sum;
        
    }
}
