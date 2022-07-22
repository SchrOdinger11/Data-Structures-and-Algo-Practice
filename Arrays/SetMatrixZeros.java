import java.util.*;
class Solution {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        HashSet<Integer> h=new HashSet<Integer>();
        HashSet<Integer> h1=new HashSet<Integer>();
   
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                h.add(i);
                h1.add(j);
            }
        }}
        for(int i: h){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }
         for(int i: h1){
            for(int j=0;j<m;j++){
                matrix[j][i]=0;
            }
        }
    }
}