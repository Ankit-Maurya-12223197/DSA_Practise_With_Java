package Arrays;

public class RightShift {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        shift(arr);
    }

    static void shift(int[] arr){
        int n= arr.length;
        int le = arr[n-1];

        for(int i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=le;


        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
