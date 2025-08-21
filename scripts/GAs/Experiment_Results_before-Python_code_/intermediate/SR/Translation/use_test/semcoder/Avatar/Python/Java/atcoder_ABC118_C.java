```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int gcd = calculateGCD(A);
        System.out.println(gcd);
    }
    
    public static int calculateGCD(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

This solution reads the input values for `N` and `A`, calculates the greatest common divisor (GCD) of the array elements using the `calculateGCD` method, and then prints the GCD. The `gcd` method calculates the GCD of two numbers using the Euclidean algorithm.
