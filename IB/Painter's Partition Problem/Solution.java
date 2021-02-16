public class Solution {
    public int paint(int A, int B, ArrayList<Integer> C) {
        
        int n = C.size();
        long sum = 0;
        int mod = 10000003;
        
        for(Integer i:C){
            sum = ((((sum+i)%mod)+mod)%mod);
        }
        long start=0, end=sum, mid=0, res=0;
        //System.out.println(start+" "+mid+" "+end);
        while(start<=end){
            mid = start+((end-start)/2);
            //System.out.println(start+" "+mid+" "+end);
            if(possible(C, mid, A)){
                res=(mid*B)%mod;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
        return (int)(res%mod);
        
    }
    
    private boolean possible(ArrayList<Integer> c, long x, int a){
        int n = c.size();
        long sum=x, count=1;
        
        for(int i=0;i<n;){
            if(count>a){
                return false;
            }
            
            if(c.get(i)>sum){
                sum=x;
                count++;
            }else{
                sum-=c.get(i);
                i++;
            }
            
        }
        return true;
    }
}
