import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int k = sc.nextInt();
        while(k-->0){
            int I = sc.nextInt();
            int r = sc.nextInt();
            int left=0;
            int right=n-1;
            int leftindex=-1;
            int rightindex=-1;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(a[mid]>=I){
                    leftindex = mid;
                    right = mid-1;
                }else{
                    left=mid+1;
                }
            }
            left=0;
            right = n-1;
            while(left <= right){
                int mid = (left+right)/2;
                if(a[mid]<=r){
                    rightindex=mid;
                    left = mid+1;
                }else{
                    right=mid-1;
                }
            }
            int count =0;
            if(leftindex != -1 && rightindex != -1){
                count = rightindex - leftindex+1;
            }
            System.out.print(count+" ");
        }
    }
}