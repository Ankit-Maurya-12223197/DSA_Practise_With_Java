package Arrays;

public class Sort0s1 {
    public static void main(String[] args) {
        // int[] arr = {1,1,0,1,0,0,1,0};
        int[] arr = {0,0,0,0,0};
        sort(arr);
    }

    static void sort(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(arr[i]==1 && arr[j]==0){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j]=t;
                i++;
                j--;
            }
        }

        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
