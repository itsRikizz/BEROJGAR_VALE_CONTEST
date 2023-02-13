import java.io._; // for handling input/output
import java.util._; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
public static void main (String[] args) {
// Your code here
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr= new int[n];
for (int i=0; i<n; i++){
arr[i] = sc.nextInt();
}
int minIndex=0;
for (int i=1; i<n; i++){
if (arr[i]<arr[minIndex]){
minIndex=i;
}
}
for (int i=0; i<n; i++){
System.out.print(arr[(i+minIndex)%n] + " ");
}
}
}
