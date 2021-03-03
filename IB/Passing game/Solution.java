public class Solution {
    public int solve(int A, int B, ArrayList<Integer> C) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(B);
        for(int i=0;i<A;i++){
            if(C.get(i)==0){
                stack.pop();
            }else{
                stack.push(C.get(i));
            }
        }
        
        return stack.pop();
    }
}
