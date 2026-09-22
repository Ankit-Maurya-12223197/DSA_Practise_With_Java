package Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {13,23,4,1,79};

        reverse(arr);

    }



    static void reverse(int[] arr){
        int n = arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int k:arr){
            System.out.print(k+ " ");
        }
    }
}
