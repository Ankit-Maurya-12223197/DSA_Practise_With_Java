package Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        solve(arr);
    }

    static int[] prefix(int[] arr){
        int n=arr.length;
        int[] pref = new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            pref[i]=sum;

        }

        return pref;
    }

    static void solve(int[] arr){
        
        int[] pre = prefix(arr);

        int n=arr.length;
        int ans = -1;
        
        for(int i=1;i<n;i++){
            int ls = pre[i-1];
            int rs = pre[n-1]-pre[i];
            if(ls==rs){
                ans = i;
                break;
            } 
        }

        System.out.println("Pivot index: "+ans);
    }
}
