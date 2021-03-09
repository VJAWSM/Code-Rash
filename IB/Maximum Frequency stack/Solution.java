public class Solution {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Stack<Integer>> fmap = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int maxf=0, temp=0, op=0, curr=0, count=0, i=0;
        
        for(ArrayList<Integer> list:A){
            op=list.get(0);
            curr = list.get(1);
            if(op==1){
                if(map.containsKey(curr)){
                    push(fmap, map.get(curr)+1, curr);
                    map.put(curr, map.get(curr)+1);
                    maxf= maxf<map.get(curr)?map.get(curr):maxf;
                }else{
                    map.put(curr, 1);
                    push(fmap, 1, curr);
                    maxf = maxf<1?1:maxf;
                }
                ans.add(-1);
            }else{
                //System.out.println(maxf);
                int elem = fmap.get(maxf).pop();
                ans.add(elem);
                if(map.get(elem)-1==0){
                    map.remove(elem);
                }else{
                    map.put(elem, map.get(elem)-1);
                }
                
                if(fmap.get(maxf).isEmpty()){
                    maxf--;
                }
            }
            //System.out.println(map.toString());
            
        }
        
        return ans;
    }
    
    private void push(HashMap<Integer, Stack<Integer>> fmap, int freq, int elem){
        if(fmap.containsKey(freq)){
            fmap.get(freq).push(elem);
        }else{
            fmap.put(freq, new Stack<>());
            fmap.get(freq).push(elem);
        }
    }
}
