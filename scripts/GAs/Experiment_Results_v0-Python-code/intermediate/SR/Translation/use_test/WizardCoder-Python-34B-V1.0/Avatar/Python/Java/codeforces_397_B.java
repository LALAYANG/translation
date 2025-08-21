```java
import java.util.Scanner;

public class CodeforcesTask397BSolution {
    private String result;
    private int t;
    private int[][] queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new int[100][3];
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = scanner.nextInt();
            }
        }
    }

    public void processTask() {
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            int dividend = queries[i][0];
            int divisor = queries[i][1];
            int k = dividend / divisor;
            res[i] = (k * queries[i][2] >= dividend) ? "Yes" : "No";
        }
        result = String.join("\n", res);
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```

Test input:
50
69 6 6
22 1 1
23 3 3
60 13 13
13 3 3
7 4 7
6 1 1
49 7 9
68 8 8
20 2 2
34 1 1
79 5 5
22 1 1
77 58 65
10 3 3
72 5 5
47 1 1
82 3 3
92 8 8
34 1 1
42 9 10
63 14 14
10 3 3
38 2 2
80 6 6
79 5 5
53 5 5
44 7 7
85 2 2
2 1 1
60 5 5
76 57 68
67 3 3
61 52 61

Expected output:
No
Yes
No
No
No
Yes
Yes
Yes
No
Yes
No
Yes
No
No
No
No
Yes
No
No
Yes
No
No
Yes
No
No
No
No
Yes
Yes
No
Yes
No
No
Yes
No
Yes
Yes
No
No
No
No
Yes
Yes
No
No
Yes
``` 
