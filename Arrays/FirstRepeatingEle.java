package Arrays;

import java.util.HashMap;

public class FirstRepeatingEle {
    public static void main(String[] args) {
        int[] arr={10,5,3,4,3,5,6};
        find(arr);
    }

    static void find(int[] arr){
        HashMap<Integer,Integer> ind = new HashMap<>();

        int n=arr.length;
        int res = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(ind.containsKey(arr[i])){
                if(ind.get(arr[i])<res){
                    res = ind.get(arr[i]);
                    System.out.println(res);
                }
            }
            ind.put(arr[i],i);
        }
        
        System.out.println(arr[res]);
    }
}
