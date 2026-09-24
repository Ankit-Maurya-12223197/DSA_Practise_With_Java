package Arrays.TwoDArrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        solve(arr);
    }

    static void solve(int[][] arr){
        int row = arr.length;
        int col= arr.length;

        int[][] ans = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=arr[j][i];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int a = ans[i][j];
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
