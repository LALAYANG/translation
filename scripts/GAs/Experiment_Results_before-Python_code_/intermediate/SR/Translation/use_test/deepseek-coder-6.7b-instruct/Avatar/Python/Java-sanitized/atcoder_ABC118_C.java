import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int gcd = findGCD(A, N);
        System.out.println(gcd);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int findGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++) {
            result = gcd(arr[i], result);

            if(result == 1) {
               return 1;
            }
        }
        return result;
    }
}