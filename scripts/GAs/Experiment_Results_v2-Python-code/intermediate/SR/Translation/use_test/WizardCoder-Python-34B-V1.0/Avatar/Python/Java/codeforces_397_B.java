```java
import java.util.Scanner;

public class CodeforcesTask397BSolution {
    private String result;
    private int t;
    private int[][] queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new int[38][3];
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        int outerLoopCounter = 38;
        int innerLoopStep = 37;

        for (int i = 0; i < outerLoopCounter; i++) {
            for (int j = 0; j < t; j++) {
                String[] input = scanner.nextLine().split(" ");
                queries[i][j] = Integer.parseInt(input[0]);
                queries[i][j + 1] = Integer.parseInt(input[1]);
                queries[i][j + 2] = Integer.parseInt(input[2]);
            }
        }
    }

    public void processTask() {
        String[] results = new String[t];
        for (int i = 0; i < t; i++) {
            int k = queries[i][0] / queries[i][1];
            results[i] = (k * queries[i][2] >= queries[i][0]) ? "Yes" : "No";
        }
        result = String.join("\n", results);
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
24 2 2
57 3 3
95 29 81
77 6 6
24 1 1
33 4 4
93 6 6
55 22 28
91 14 14
7 1 1
16 1 1
20 3 3
43 3 3
53 3 3
49 3 3
52 5 5
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
