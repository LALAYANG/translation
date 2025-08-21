```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        List<Integer> indicesN = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indicesN.add(i);
        }
        List<Integer> indicesM = new ArrayList<>();
        for (int j = 0; j < M; j++) {
            indicesM.add(j);
        }
        indicesN.retainAll(indicesM);
        List<Integer> kaburi = new ArrayList<>();
        for (int index : indicesN) {
            kaburi.add((index * M) / N);
        }
        AtomicInteger counter = new AtomicInteger(0);
        boolean flag = false;
        for (int i = 0; i < kaburi.size(); i++) {
            if (S.charAt(kaburi.get(i)) != T.charAt(kaburi.get(i))) {
                flag = true;
                break;
            }
            counter.incrementAndGet();
        }
        if (flag) {
            System.out.println(-1);
        } else {
            System.out.println((N * M) / gcd(N, M));
        }
    }

    private static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M, and two strings S and T from the input. It then checks if the strings S and T have the same characters at the same indices. If they do, it increments a counter. Finally, it prints the counter divided by the greatest common divisor of N and M, or -1 if the strings don't have the same characters at the same indices.

