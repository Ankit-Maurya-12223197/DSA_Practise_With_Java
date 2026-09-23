package Arrays;

public class RemoveDupFSortedA {
    public static void main(String[] args) {
        int[] arr={-10,-10,-7,-5,-5,0,0,0,1,1,1,2,2,3,4,4,5,6};
        remove(arr);
    }

    static void remove(int[] arr){
        int n = arr.length;

        int i=0;
        int x=0;
        int y=1;

        while (y<n) {
            if(arr[x]==arr[y]){
                x++;
                y++;
            }
            else{
                arr[i++]=arr[x];
                x++;
                y++;
            }

        }
        arr[i++]=arr[x];

        System.out.println("Length of new array: "+i);
        for(int p:arr){
            System.out.print(p+" ");
        }
    }
}
