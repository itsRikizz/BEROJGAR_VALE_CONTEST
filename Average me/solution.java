import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        // long[] trees = new long[N];
        long sum =0;
        for(int i=0;i<N;i++){
           Long height=sc.nextLong();
            sum+= height;

        }
        
        int avg = (int) Math.floor((double)sum/N);

        System.out.println(avg);
    }
}