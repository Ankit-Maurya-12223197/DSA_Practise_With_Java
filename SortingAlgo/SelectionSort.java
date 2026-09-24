package SortingAlgo;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,1,3,-5,-10,1,4};
        sort(arr);
    }

    static void sort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minInd = i;
            
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minInd]){
                    minInd=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minInd];
            arr[minInd]=temp;
        }

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
