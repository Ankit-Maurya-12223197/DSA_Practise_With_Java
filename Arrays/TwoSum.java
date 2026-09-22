package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {12,34,5,12,4,9};
        twoSum(arr, 24);

    }

    static void twoSum(int[] arr, int t){
        HashMap<Integer,Integer> freq = new HashMap<>();
        int n = arr.length;

        for(int i=0;i<n;i++){
            
            int rem = t-arr[i];
            if(freq.containsKey(rem)){
                System.out.println("The indices are: "+i+" and "+freq.get(rem));
            }
            freq.put(arr[i],i);
        }
    }
}
