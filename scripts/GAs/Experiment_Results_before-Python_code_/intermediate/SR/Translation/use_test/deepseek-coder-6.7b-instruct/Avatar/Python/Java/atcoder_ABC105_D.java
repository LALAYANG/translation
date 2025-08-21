Here is the Java version of the Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        String[] line2 = br.readLine().split(" ");
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(line2[i]);
        }
        long[] cumRemainders = new long[N + 1];
        long[] remainderCounts = new long[M];
        for (int i = 1; i <= N; i++) {
            cumRemainders[i] = (cumRemainders[i - 1] + A[i - 1]) % M;
            remainderCounts[(int) cumRemainders[i]]++;
        }
        long combinations = 0;
        for (long count : remainderCounts) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the input, then reads N long integers from the input. It calculates the cumulative remainders of the array A when divided by M, and counts the occurrences of each remainder. It then calculates the number of combinations of two numbers that have the same remainder when divided by M, and prints this number.

