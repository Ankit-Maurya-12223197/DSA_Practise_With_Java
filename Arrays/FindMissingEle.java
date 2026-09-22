package Arrays;

public class FindMissingEle {
    public static void main(String[] args) {
        int[] arr = {0,1,2,5,4};
        find(arr);
    }

    static void find(int[] arr){
        int n=arr.length;

        int res = 0;

        for(int i: arr){
            res = res^i;
        }

        for(int i=0;i<=n;i++){
            res = res^i;
        }
        System.out.println("Missing ele is: "+res);
    }
}
