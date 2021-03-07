//Trick - comparing two strings will happen automatically in MSD radix sort. No need to implement the sort yourself.

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        String[] a = new String[A.size()];
        int i=0;
        for(Integer x:A){
            a[i]=x.toString();
            i++;
        }
        
        Arrays.sort(a, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
        
        StringBuilder s = new StringBuilder();
        
        for(i=0;i<a.length;i++){
            s.append(a[i]);
        }
        
        if(s.charAt(0)=='0'){
            return "0";
        }
        
        return s.toString();
        
        
    }
    
}
