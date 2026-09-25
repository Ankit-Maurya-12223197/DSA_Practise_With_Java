package BinarySearch;

public class NoOfOccurence {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,3};
        find(arr,2);
    }

    static void find(int[] arr, int target){
        int n=arr.length;

        int st = 0;
        int end = n-1;

        int mid = (st+end)/2;
        int ansI = -1;
        int count = 0;

        while (st<=end) {
            if(arr[mid]==target){
                ansI = mid;
                count++;
                break ;
            }
            else if (arr[mid]>target) {
                end = mid-1;
            }
            else{
                st = mid+1;
            }

            mid=(st+end)/2;
        }

        int prevI=ansI-1;
        while(prevI>=0 && arr[ansI]==arr[prevI]){
            count++;
            prevI--;
        }
        int nextI=ansI+1;
        while(nextI<n && arr[ansI]==arr[nextI]){
            count++;
            nextI++;
        }

        System.out.println("Final output: "+count);

    }
}
