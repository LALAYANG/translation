```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_one = 7;
        int condition_two = 669;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        if ((condition_one & condition_two) != 0) {
            if (X == 1 || X == N * 2 - 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
                if (X == N * 2 - 2) {
                    int[] xs = new int[N];
                    for (int i = 0; i < N - 1; i++) {
                        xs[i] = i + N - 1;
                    }
                    xs[N - 1] = X + 2;
                    for (int i = 0; i < xs.length; i++) {
                        System.out.print(xs[i] + " ");
                    }
                } else {
                    int[] ys = new int[N];
                    for (int i = 0; i < N - 1; i++) {
                        ys[i] = i + 1;
                    }
                    ys[N - 1] = N * 2 - 1;
                    for (int i = 0; i < N - 3; i++) {
                        System.out.print(ys[i] + " ");
                    }
                    System.out.print(X + 2 + " ");
                    System.out.print(X - 1 + " ");
                    System.out.print(X + " ");
                    System.out.print(X + 1 + " ");
                    for (int i = N - 3; i < N; i++) {
                        System.out.print(ys[i] + " ");
                    }
                }
            }
        }
    }
}
``` 
