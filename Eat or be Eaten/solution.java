import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0;
        for(i=0; i<n; i++){
            if(x>=arr[i]){
                x+=arr[i];
            } else {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}