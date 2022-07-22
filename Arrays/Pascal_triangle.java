// https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> a=new ArrayList<>();
     for(int i=0;i<n;i++){
         List<Integer> l=new ArrayList<Integer>(i+1);
         for(int j=0;j<=i;j++){
             if(j==0||j==i){
                 l.add(1);
                }
             else{
                 List<Integer> temp=a.get(i-1);
                 l.add(temp.get(j-1)+temp.get(j));
            }
            }
            a.add(l);
        }
        
     return a;
        
    }
}