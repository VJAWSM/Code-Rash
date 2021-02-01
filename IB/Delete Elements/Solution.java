public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int gcd = 0;
        int len = A.size();
        int a=0, b=0, num=1;
        int t1, t2;
        
        for(Integer i:A){
            if(i>0){
                a=i;
                break;
            }
        }
        
        for(int i=A.indexOf(a)+1; i<len && gcd!=1; i++){
            num=1;
            b=A.get(i);
            if(b==0)continue;
            t1 = a;
            t2 = b;
            while(num!=0){
                num=t1%t2;
                if(num==0){
                    gcd = t2;
                }else{
                    t1=t2;
                    t2=num;
                }
            }
        }
        
        if(gcd==1){
            return 0;
        }
        return -1;
        
    }
}
//O(n) time, O(1) space
