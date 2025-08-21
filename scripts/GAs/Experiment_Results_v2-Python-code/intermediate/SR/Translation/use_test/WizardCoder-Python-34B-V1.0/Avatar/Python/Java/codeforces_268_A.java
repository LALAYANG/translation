```java
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<String[]> q = new LinkedList<>();
        int count = 0;
        int conditionOne = 375;
        int conditionTwo = 89;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            q.add(input);
        }

        for (String[] j : q) {
            for (String[] elementTwo : q) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (j[0].equals(elementTwo[elementTwo.length - 1])) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
```

Test input:
23
43 78
31 28
58 80
66 63
20 4
51 95
40 20
50 14
5 34
36 39
77 42
64 97
62 89
16 56
8 34
58 16
37 35
37 66
8 54
50 36
24 8
68 48
85 33

Expected output:
6 
