package Recursion;

public class PrintDigitsOfANumber {
    public static void main(String[] args) {
        solve(137454);
    }

    static void solve(int n){
        //Base case
        if(n==0){
            return;
        }

        solve(n/10);

        System.out.print(n%10+" ");

    }
}
