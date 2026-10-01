package Recursion;

public class MaxElementInArr {
    public static void main(String[] args) {
        int[] arr  = {80,40,50,30,100};
        solve(arr, 5, 0, 0);
    }

    static void solve(int[] arr,int n, int idx,int max){
        // Base case
        if(idx==n){
            System.out.println("Max ele: "+max);
            return ;
        }

        if(arr[idx]>max){
            max = arr[idx];
        }

        solve(arr,n,idx+1,max);
    }
}
