package SortingAlgo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,-5,-10,1,4};
        sort(arr);
    }

    static void sort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){ // for rounds
            for(int j=0;j<n-i-1;j++){ // shifting one element at right position in one round
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }

        for(int x: arr){
            System.out.print(x+" ");
        }
    }
}
