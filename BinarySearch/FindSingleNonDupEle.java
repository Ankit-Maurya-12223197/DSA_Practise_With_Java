package BinarySearch;

public class FindSingleNonDupEle {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,30,40,40,60,60,90,90};
        solve(arr);
    }

    static void solve(int[] arr) {
        int n = arr.length;

        int s = 0;
        int e = n - 1;
        int ans = -1; 

        if (arr[0] != arr[1]) {
            ans = arr[0];
            System.out.println("Output:"+ans);
            return ;
        }
        if (arr[n - 1] != arr[n - 2]) {
            ans = arr[n - 1];
            System.out.println("Output:"+ans);
            return ;

        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid >= 1 && arr[mid] != arr[mid - 1] && mid < n - 1 && arr[mid] != arr[mid + 1]) {
                ans = arr[mid];
                break;
            } else {
                if (arr[mid] == arr[mid + 1]) {
                    if (mid % 2 == 0) {
                        s = mid + 2;
                    } else {
                        e = mid - 1;
                    }
                } else if (arr[mid] == arr[mid - 1]) {
                    if (mid % 2 == 1) {
                        s = mid + 1;
                    } else {
                        e = mid - 2;
                    }
                }
            }

        }

        System.out.println("Output:"+ans);
    }
}
