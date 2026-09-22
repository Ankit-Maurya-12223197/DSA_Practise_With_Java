package Arrays;

public class PrintExtremeEle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        extremeElement(arr);
    }

    static void extremeElement(int[] arr){
        int i=0;
        int j=arr.length - 1;

        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            System.out.print(arr[i++]+" ");
            System.out.print(arr[j--]+" ");
        }

        
    }
}
