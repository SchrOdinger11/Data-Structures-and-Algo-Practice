// https://leetcode.com/problems/next-permutation/
class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int st=n-2;
        while(st>=0 && arr[st]>=arr[st+1]){st--;
        }
        if(st>=0){
            int e=arr.length-1;
            while(arr[st]>=arr[e]){
                e--;
            }
            swap(st,e,arr);
        }
        reverse(arr,st+1);
        
        
    }
    public void swap(int a,int b,int arr[]){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
    public void reverse(int arr[],int i){
        int s=i;
        int e=arr.length-1;
        while(s<e){
            swap(s,e,arr);
            s++;
            e--;
        }
    }
}
