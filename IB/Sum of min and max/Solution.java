public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        
        Deque<Integer> maxq = new LinkedList<>();
        Deque<Integer> minq = new LinkedList<>();
        int n=A.size(), temp=0, mod=1000000007;
        long ans=0;
        
        for(int i=0;i<n;i++){
            temp = A.get(i);
            if(i<B){
                if(maxq.isEmpty()){
                    maxq.add(temp);
                }else{
                    while(maxq.peekLast()!=null&&maxq.peekLast()<temp){
                        maxq.removeLast();
                    }
                    maxq.add(temp);
                }
                
                if(minq.isEmpty()){
                    minq.add(temp);
                }else{
                    while(minq.peekLast()!=null&&minq.peekLast()>temp){
                        minq.removeLast();
                    }
                    minq.add(temp);
                }
                
            }else{
                ans =((ans%mod)+((long)maxq.peekFirst()%mod)+((long)minq.peekFirst()%mod))%mod;
                int out=A.get(i-B);
                if(maxq.peekFirst()!=null&&out==maxq.peekFirst()){
                    maxq.removeFirst();
                }
                if(minq.peekFirst()!=null&&out==minq.peekFirst()){
                    minq.removeFirst();
                }
                
                if(maxq.isEmpty()){
                    maxq.add(temp);
                }else{
                    while(maxq.peekLast()!=null&&maxq.peekLast()<temp){
                        maxq.removeLast();
                    }
                    maxq.add(temp);
                }
                
                if(minq.isEmpty()){
                    minq.add(temp);
                }else{
                    while(minq.peekLast()!=null&&minq.peekLast()>temp){
                        minq.removeLast();
                    }
                    minq.add(temp);
                }
            }
        }
        ans =(((ans%mod)+((long)maxq.peekFirst()%mod)+((long)minq.peekFirst()%mod))+mod)%mod;
        return (int)ans;
        
    }
}
