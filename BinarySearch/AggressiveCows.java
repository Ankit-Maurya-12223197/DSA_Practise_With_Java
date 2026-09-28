package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        solve(arr, 3);
    }

    static void solve(int[] arr, int k){
        Arrays.sort(arr);
        int n = arr.length;

        int s = 0;
        int e = arr[n-1]-arr[0];
        int ans = -1;

        while (s<=e) {
            int mid = s+(e-s)/2;

            if(isValidAnswer(arr, k, mid)){
                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }

        System.out.println("Max of min is: "+ans);

    }

    static boolean isValidAnswer(int[] arr, int k, int minDis){

        int cowsCount=1;
        int lastPosition = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[lastPosition]>=minDis){
                cowsCount++;
                lastPosition = i;
                if(cowsCount==k){
                    return true;
                }
            }
        }

        return false;

    }

}
