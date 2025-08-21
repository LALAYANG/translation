```java
public class Task4 {
    public static void main(String[] args) {
        String[] input = "1 -1 5".split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        int result = task4(A, B, n);
        System.out.println(result);
    }

    public static int task4(int A, int B, int n) {
        for (int X = -1000; X <= 1000; X++) {
            if (A * Math.pow(X, n) == B) {
                return X;
            }
        }
        return -1;
    }
}
```
