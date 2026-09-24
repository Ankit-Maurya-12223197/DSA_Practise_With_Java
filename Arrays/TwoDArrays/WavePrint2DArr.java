package Arrays.TwoDArrays;

public class WavePrint2DArr {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        solve(arr);
    }

    static void solve(int[][] arr){
        int row=arr.length;
        int col = arr[0].length;

        for(int c=0;c<col;c++){
            if(c%2==0){
                for(int r =0;r<row;r++){
                    System.out.print(arr[r][c]+" ");
                }
            }
            else{
                for(int r=row-1;r>=0;r--){
                    System.out.print(arr[r][c]+" ");
                }
            }
        }
    }
}
