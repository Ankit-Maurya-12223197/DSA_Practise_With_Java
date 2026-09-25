package SortingAlgo;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,-5,-10,1,4};
        sort(arr);
    }

    static void sort(int[] arr){
        int n=arr.length;

        for(int i=1;i<n;i++){
            int curV = arr[i];

            int currI= i;
            int prevI = i-1;

            while(currI!=0 && curV<arr[prevI]){
                arr[currI] = arr[prevI];
                currI--;
                prevI--;
            }
            arr[currI]=curV;
        }

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
