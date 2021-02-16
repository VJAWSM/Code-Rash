public class Solution {
    
    private long lcmval = 0;
    
    public int solve(int A, int B, int C) {
        long min = B<C?B:C;
        long start = min, end=min*A, mid=0;
        long result=B;
        long mod = 1000000007;
        long cnt = 0;
        
        this.lcmval = lcm(B,C);
        
        while(start<=end){
            mid=start+((end-start)/2);
            cnt = count(mid, B, C);
            if(cnt>=A){
                result = mid;
                end = mid-1;
            }else if(cnt<A){
                start=mid+1;
            }
        }
        
        return (int)(result%mod);
        
    }
    
    public long count(long x, long b, long c){
        long result = (x/b)+(x/c)-(x/lcmval);
        return result;
    }
    
    public long lcm(long a, long b){
        long gcd=0, temp=0;
        long max = a>b?a:b;
        long min = a>b?b:a;
        while(true){
            temp=min;
            min=max%min;
            max=temp;
            if(min==0){
                gcd=max;
                break;
            }
        }
        return (a*b)/gcd;
        
    }
}
