package Arrays.TwoDArrays;

public class SpiralPrintOfMatrx {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}};
        spiralPrint(arr);
    }

    static void spiralPrint(int[][] arr){
        int sr = 0;
        int er = arr.length-1;

        int sc = 0;
        int ec = arr[0].length-1;

        while(sr<=er && sc<=ec){

        // Print row L to R
        for(int c = sc;c<=ec;c++){
            System.out.print(arr[sr][c]+" ");
        }
        sr++;

        // Print col T to B
        for(int r = sr;r<=er;r++){
            System.out.print(arr[r][ec]+" ");
        }
        ec--;

        // Print row R to L
        if(sr<=er){
            for(int c = ec;c>=sc;c--){
            System.out.print(arr[er][c]+" ");
        }
        er--;
        }

        // Print col B to T
        if(sc<=ec){
            for(int r = er;r>=sr;r--){
            System.out.print(arr[r][sc]+" ");
        }
        sc++;
        }
        }

    }
}
