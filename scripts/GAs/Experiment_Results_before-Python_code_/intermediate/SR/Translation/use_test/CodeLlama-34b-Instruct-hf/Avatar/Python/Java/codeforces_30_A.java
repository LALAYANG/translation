```java
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();

        for (int X = -1000; X <= 1000; X++) {
            if (A * (X ^ n) == B) {
                System.out.println(X);
                return;
            }
        }
        System.out.println("No solution");
    }
}
```
Note: In Java, the caret operator (`^`) is used for bitwise XOR, not exponentiation. To perform exponentiation, you can use the `Math.pow()` method from the `java.lang.Math` class.
