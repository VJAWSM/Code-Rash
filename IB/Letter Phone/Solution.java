public class Solution {
    
    HashMap<Integer, String> map = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();
    
    public Solution(){
        map.put(0,"0");
        map.put(1,"1");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
    }
    
    public ArrayList<String> letterCombinations(String A) {
        cal(A, "", 0);
        return this.list;
    }
    
    private void cal(String A, String temp, int index){
        
            //System.out.println(temp);
        if(temp.length()==A.length()){
            list.add(temp);
            return;
        }
        //System.out.println(String.valueOf(A.charAt(index)));
        String val = map.get(Integer.parseInt(String.valueOf(A.charAt(index))));
        //if(val==null)System.out.println("gotcha");
        for(int i=0; i<val.length();i++){
            temp+=val.charAt(i);
            cal(A, temp, index+1);
            temp=temp.substring(0,temp.length()-1);
        }
    }
}
