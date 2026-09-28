package BinarySearch;

import java.util.Arrays;

public class RotiAndParantha {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solve(10, arr, 4);
    }

    static void solve(int p, int[] arr, int n){
        Arrays.sort(arr);

        int s = 0;
        int e = arr[n-1]*(n*(n+1)/2);
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(isValidAnswer(p, arr, n, mid)){
                ans = mid;
                e = mid-1;

            }else{
                s = mid+1;
            }
        }

        System.out.println("Minimum time: "+ans);
    }

    static boolean isValidAnswer(int p, int[] arr, int n, int minTime){
        int paranthaCount=0;

        for(int i=0;i<n;i++){
            int cookRank = arr[i];
            // time taken to consecutively parantha--> 1*r, 2*r, 3*r -- --
            int j=1;
            int timeTaken = 0;

            while(timeTaken+j*cookRank<=minTime){
                
                timeTaken +=j*cookRank;
                paranthaCount++;
                j++;
                               
                if(paranthaCount>=p){
                    return true;
                }
            }
        }

        return false;
    }
}
