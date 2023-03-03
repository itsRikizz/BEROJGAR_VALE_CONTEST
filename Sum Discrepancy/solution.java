import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
long totalSum = 0; // to avoid overflow, use long instead of int
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
totalSum += arr[i];
}
sc.close();

    long prefixSum = 0;
    for (int i = 0; i < n; i++) {
        prefixSum += arr[i];
        if (prefixSum >= totalSum - prefixSum) {
            System.out.println(i + 1);
            break;
        }
    }
}
}