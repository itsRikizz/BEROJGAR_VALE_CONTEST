import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        int jump = 0;
        int maxJumps = 0;
        for(int i=1; i<n; i++){
            if(a[i-1] >= a[i]){
                jump++;
            }
            else{
                jump = 0;
            }

            if(jump > maxJumps)
                maxJumps = jump;
        }

        System.out.println(maxJumps);
    }
}