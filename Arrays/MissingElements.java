package Arrays;

// Missing elements from an array with duplicates
public class MissingElements {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,5};
        solve(arr);
    }

    static void solve(int[] arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            int v= Math.abs(arr[i]);
            if(arr[v-1]>0){
                arr[v-1]= -arr[v-1];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.println(i+1);
            }
        }
    }
}
