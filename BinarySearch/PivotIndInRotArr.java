package BinarySearch;

public class PivotIndInRotArr {
    public static void main(String[] args) {
        int[] arr = {50,60,70,80,10,20,30};
        solve(arr);
    }

    static void solve(int[] arr){
        int n = arr.length;

        int s=0;
        int e = n-1;
        int ans = -1;

        int mid = (s+e)/2;

        while(s<=e){
            if(arr[mid]<=arr[n-1]){
                e = mid-1;
            }
            else{
                ans = mid;
                s = mid+1;
            }
            mid=(s+e)/2;
        }

        System.out.println("Pivot index: "+ans);
    }
}
