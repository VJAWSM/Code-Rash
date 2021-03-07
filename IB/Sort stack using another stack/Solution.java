public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Stack<Integer> s = new Stack<>();
        for(Integer i:A){
            s.push(i);
        }
        s = sort(s);
        A = new ArrayList<>();
        while(!s.isEmpty()){
            A.add(s.pop());
        }
        
        return A;
    }
    
    private Stack<Integer> sort(Stack<Integer> s){
        int n = s.size();
        
        if(n==1){
            return s;
        }
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int i=0;
        for(;i<n/2;i++){
            s1.push(s.pop());
        }
        for(;i<n;i++){
            s2.push(s.pop());
        }
        //System.out.println(s1);
        //System.out.println(s2);
        s1 = sort(s1);
        s2 = sort(s2);
        //System.out.println(s1);
        //System.out.println(s2);
        s = merge(s1,s2);
        return s;
    }
    
    private Stack<Integer> merge(Stack<Integer> s1, Stack<Integer> s2){
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> rev = new Stack<>();
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.peek()<s2.peek()){
                stk.push(s1.pop());
            }else{
                stk.push(s2.pop());
            }
        }
        
        while(!s1.isEmpty()){
            stk.push(s1.pop());
        }
        
        while(!s2.isEmpty()){
            stk.push(s2.pop());
        }
        
        while(!stk.isEmpty()){
            rev.push(stk.pop());
        }
        
        return rev;
    }
    
}
