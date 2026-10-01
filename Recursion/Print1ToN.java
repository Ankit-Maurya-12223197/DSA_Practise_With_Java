package Recursion;

public class Print1ToN {
    public static void main(String[] args) {
        print(10);
    }

    static void print(int n){
        // Base case
        if(n==0){
            return;
        }

        print(n-1);
        System.out.print(n+" ");
    }
}
