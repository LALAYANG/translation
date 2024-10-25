<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

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
Yes
No
Yes
No
No
No
Yes
No
No
Yes
No
No
No
Yes
No
No
No
No
No
Yes
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
No
Yes
Yes
No
No
Yes


```
class CodeforcesTask397BSolution :
    def __init__ ( self ) :
        self.result = ''
        self.t = 0
        self.queries = [ ]
    def read_input ( self ) :
        self.t = int ( input ( ) )
        for _ in range ( self.t ) :
            self.queries.append ( [ int ( x ) for x in input ( ).split ( " " ) ] )
    def process_task ( self ) :
        res = [ ]
        for query in self.queries :
            k = query [ 0 ] // query [ 1 ]
            res.append ( "Yes" if k * query [ 2 ] >= query [ 0 ] else "No" )
        self.result = "\n".join ( res )
    def get_result ( self ) :
        return self.result
if __name__ == "__main__" :
    Solution = CodeforcesTask397BSolution ( )
    Solution.read_input ( )
    Solution.process_task ( )
    print ( Solution.get_result ( ) )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeforcesTask397BSolution {
    private String result;
    private int t;
    private List<int[]> queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new ArrayList<>();
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        this.t = scanner.nextInt();
        for (int i = 0; i < this.t; i++) {
            int[] query = new int[3];
            for (int j = 0; j < 3; j++) {
                query[j] = scanner.nextInt();
            }
            this.queries.add(query);
        }
    }

    public void processTask() {
        List<String> res = new ArrayList<>();
        for (int[] query : this.queries) {
            int k = query[0] / query[1];
            res.add(k * query[2] >= query[0] ? "Yes" : "No");
        }
        this.result = String.join("\n", res);
    }

    public String getResult() {
        return this.result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```

This Java code does the same thing as your Python code. It reads the input, processes the queries, and prints the result. The main difference is that Java uses `System.out.println` to print the result, instead of `print`. <｜end▁of▁sentence｜>
