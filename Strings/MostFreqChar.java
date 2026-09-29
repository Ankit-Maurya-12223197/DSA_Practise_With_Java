package Strings;

import java.util.Map;
import java.util.TreeMap;

public class MostFreqChar {
    public static void main(String[] args) {
        String str = "output";
        solve(str);
    }

    static void solve(String str){
        Map<Character,Integer> freq = new TreeMap<>();

        int len = str.length();

        
        for(int i=0;i<len;i++){
            char curr = str.charAt(i);
            freq.put(curr, freq.getOrDefault(curr, 0)+1);
            // if(freq.get(mostFreqChar)<freq.get(curr)){
            //     mostFreqChar = curr;
            // }
        }

        char mostFreqChar  = 's';
        int mostFreqCharInt = 0;
        for(char key: freq.keySet()){
            if(freq.get(key)>mostFreqCharInt){
                mostFreqChar = key;
                mostFreqCharInt = freq.get(key);
            }
        }

        System.out.println(mostFreqChar);
    }
}
