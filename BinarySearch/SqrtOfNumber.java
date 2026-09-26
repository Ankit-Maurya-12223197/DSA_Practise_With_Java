package BinarySearch;

public class SqrtOfNumber {
    public static void main(String[] args) {
        solve(82);
    }

    static void solve(int num){
        int s = 0;
        int e = num;

        int ans = -1;

        while(s<=e){
            int mid = (s+e)/2;
            int sqr = mid*mid;

            if(sqr==num){
                ans = mid;
                break;
            }
            else if(sqr>num){
                e = mid-1;
            }
            else{
                ans = mid;
                s=mid+1;
            }
        }

        System.out.println("Square root of "+num+" is: "+ans);
    }
}
