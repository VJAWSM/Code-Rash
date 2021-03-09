public class Solution {
    public String solve(String A) {
        Stack<Character> s = new Stack<>();
        
        for(Character c:A.toCharArray()){
            if(!s.isEmpty()&& s.peek()==c){
                s.pop();
            }else{
                s.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        
        while(!s.isEmpty()){
            sb.append(s.pop());
            
        }
        sb.reverse();
        return sb.toString();
    }
}
