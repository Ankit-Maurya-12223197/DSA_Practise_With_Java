package BinarySearch;

public class RowWithMaximum1 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,1},{0,0,1,1},{0,1,1,1},{1,1,1,1}};
        solve(arr);
    }

    static void solve(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int fans = -1;
        int freq = 0;
        for(int i = 0;i<row;i++){
            int lB = lowerBound(arr[i], col);
            if(lB == -1){
                continue;
            }
            int freOf1 = col-lB;

            if(freOf1>freq){
                fans = i;
                freq = freOf1;
            }
        }

        System.out.println("Answer indes: "+fans);

    }

    static int lowerBound(int[] eachRow, int c){
        int s = 0;
        int e = c-1;
        int ans = -1;

        while(s<=e){
            int mid = (s+e)/2;

            if(eachRow[mid]==1){
                ans = mid;
                e = mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return ans;
    }
}
