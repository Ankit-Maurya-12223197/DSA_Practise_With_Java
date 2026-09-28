package BinarySearch;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        solve(arr, 0);
    }

    static void solve(int[][] arr,int target){
        int row = arr.length;
        int col = arr[0].length;

        int ansRow = -1;

        if(target>arr[row-1][col-1]){
            System.out.println("Not present");
            return;
        }

        if(target<arr[0][col-1]){
            ansRow = 0;
        }
        else{
            ansRow = binarySearchOnCol(arr,row,col, target);
        }

        binarySearchOnRow(arr, ansRow, col, target);
        


    }

    static int binarySearchOnCol(int[][] arr1, int r, int c, int target){
        int s = 0;
        int e = r-1;
        int ansRow = -1;

        while(s<=e){
            int mid = (s+e)/2;

            if(arr1[mid][c-1]==target){
                ansRow = mid;
            }
            else if(arr1[mid][c-1]<target){
                ansRow = mid+1;
                s = mid+1;
            }
            else{
                e = mid-1;
            }

            
        }
        return ansRow;
    }

    static void binarySearchOnRow(int[][] arr2, int ansR, int col, int target){
        int s = 0;
        int e = col-1;

        while(s<=e){
            int mid = (s+e)/2;

            if(arr2[ansR][mid]==target){
                System.out.println("Item found: "+ansR+" "+mid);
                return ;
            }
            else if(arr2[ansR][mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        System.out.println("Not found");

    }
}
