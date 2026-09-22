package Arrays;
import java.util.HashMap;

public class ModeOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,6,4,4,4,5,5,6,7,5,5,2,5,7,4,4,4};
        mode(arr);
     }

    static void mode(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i:arr){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }
        
        int mres=-1;
        int mf = -1;

        int lres = -1;
        int lf = Integer.MAX_VALUE;


        for(int k:freq.keySet()){
            int cf = freq.get(k);
            if(cf>mf ){
                mres = k;
                mf=cf;
            }
            if(cf<lf){
                lres = k;
                lf = cf;
            }
        }
        System.out.println(mres+ " have max freq with "+ mf);
        System.out.println(lres+ " have max freq with "+ lf);
    }
}
