import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int ti=0; ti<t; ti++){
            String str = sc.nextLine();
            int n = str.length();

            int i = 0;
            int j = n-1;
            int count = 0;
            while(i<j){
                int diff = Math.abs(str.charAt(i) - str.charAt(j));
                count += diff;
                i++;
                j--;
            }

            System.out.println(count);
        }
    }
}