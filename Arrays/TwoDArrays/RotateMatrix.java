package Arrays.TwoDArrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotateby90(arr);
    }

    static void rotateby90(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;

        int[][] ans = new int[row][col];

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){

                ans[c][row-1-r]= arr[r][c];
            }
        }

        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){

                System.out.print(ans[r][c]+" ");
            }
            System.out.println();
        }
    }
}
