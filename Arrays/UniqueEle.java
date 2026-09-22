package Arrays;

public class UniqueEle {
    public static void main(String[] args) {
        int[] arr = {1,1,3,2,2,3,5,4,6,4,5};
        unique(arr);
    }

    static void unique(int[] arr){
        int res = 0;

        for(int k:arr){
            res = res^k;
        }

        System.out.println("Unique element is: "+res);
    }
}
