package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3};
        solve(arr,2);
    }

    static void solve(int[] arr, int target){
        int n=arr.length;

        int s = 0;
        int e = n-1;

        int mid = (s+e)/2;
        int ans = -1;

        while(s<=e){
            if(arr[mid]>= target){
                ans = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = (s+e)/2;
        }

        System.out.println("Lower bound: "+ans);
         
    }
}
