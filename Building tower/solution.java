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

        int max = n;
        boolean found[] = new boolean[n+1];
        for(int i=0; i<n; i++){
            int x = a[i];
            found[x] = true;

            if(x == max) {
                while(found[max]){
                    System.out.print(max + " ");
                    max--;
                }
                System.out.println();
            }
            else{
                System.out.println();
            }
        }

    }
}