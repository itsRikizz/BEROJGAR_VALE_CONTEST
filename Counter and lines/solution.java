import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner  sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long s =1;
        long e =10000000000l;
        while(s+1<e) {
            long mid= (s+e)/2;
            if( get(mid,k) + get(mid,n-k+1) -mid > m){
                e=mid;
            }
            else{
                 s = mid;
            }
        }
        System.out.print((long)s);
    }
    public static long get(Long ed, Long cnt) {
        Long d = cnt;
        if(d>ed) {
            d = ed;
        }
        cnt -=d;
        return cnt + d* (2*ed-d+1)/2;
    }
}