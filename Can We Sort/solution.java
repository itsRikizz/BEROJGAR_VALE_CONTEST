import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        boolean canSort = true;
        for (int i=0; i<n-1; i++){
            if (a[i]>a[i+1]){
                if((a[i]+ a[i+1])% 2 == 0){
                    a[i+1] = a[i];
                }else{
                    a[i] = a[i+1];
                }
            }
            if(a[i]>a[i+1]){
                canSort = false;
                break;
            }
        }
        if (canSort){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}