
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CodeforcesTask397B {

    private static class CodeforcesTask397BSolution {
        private int t;
        private List<int[]> queries;
        private String result;

        public CodeforcesTask397BSolution() {
            this.t = 0;
            this.queries = new ArrayList<>();
            this.result = "";
        }

        public void readInput() {
            FastInputReader in = new FastInputReader();
            this.t = in.readInt();
            for (int i = 0; i < this.t; i++) {
                int[] query = new int[3];
                query[0] = in.readInt();
                query[1] = in.readInt();
                query[2] = in.readInt();
                this.queries.add(query);
            }
        }

        public void processTask() {
            StringBuilder res = new StringBuilder();
            for (int[] query : this.queries) {
                int dividend = query[0];
                int divisor = query[1];
                int k = dividend / divisor;
                res.append(k * query[2] >= query[0] ? "Yes" : "No").append("\n");
            }
            this.result = res.toString();
        }

        public String getResult() {
            return this.result.trim();
        }
    }

    private static class FastInputReader {
        BufferedReader br;
        StringTokenizer st;

        public FastInputReader() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
            this.st = new StringTokenizer("");
        }

        public String read() {
            while (!this.st.hasMoreTokens()) {
                try {
                    this.st = new StringTokenizer(this.br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(this.read());
        }
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```

## Codeforces Task 397C - On Corruption and Numbers
### 题目大意
给出一个数列，求出一个子序列，使得这个子序列的和最大，且这个子序列的和不能被3整除。

### 解题思路
首先，如果这个数列的和不能被3整除，那么这个数列的子序列的和也不能被3整除。

其次，如果这个数列的和能被3整除，那么这个数列的子序列的和也能被3整除。

因此，我们可以先求出这个数列的和，然后根据这个数列的和是否能被3整除，分别求出这个数列的最大子序列和。

### 代码
Python code:
```python
class CodeforcesTask397CSolution:
    def __init__(self):
        self.result = ''
        self.n = 0
        self.a = []

    def read_input(self):
        self.n = int(input())
        self.a = [int(x) for x in input().split(' ')]

    def process_task(self):
        a_sum = sum(self.a)
        if a_sum % 3 == 0:
            self.result = str(a_sum)
        else:
            a_sum_mod_3 = a_sum % 3
            if a_sum_mod_3 == 1:
                a_sum_mod_3 = 2
            else:
                a_sum_mod_3 = 1
            max_sum = 0
            for i in range(self.n):
                if self.a[i] % 3 == a_sum_mod_3:
                    max_sum += self.a[i]
            self.result = str(max_sum)

    def get_result(self):
        return self.result

if __name__ == '__main__':
    Solution = CodeforcesTask397CSolution()
    Solution.read_input()
    Solution.process_task()
    print(Solution.get_result())
```

Java code:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeforcesTask397C {

    private static class CodeforcesTask397CSolution {
        private int n;
        private int[] a;
        private String result;

        public CodeforcesTask397CSolution() {
            this.n = 0;
            this.a = new int[0];
            this.result = "";
        }

        public void readInput() {
            FastInputReader in = new FastInputReader();
            this.n = in.readInt();
            this.a = new int[this.n];
            for (int i = 0; i < this.n; i++) {
                this.a[i] = in.readInt();
            }
        }

        public void processTask() {
            int aSum = 0;
            for (int i = 0; i < this.n; i++) {
                aSum += this.a[i];
            }
            if (aSum % 3 == 0) {
                this.result = String.valueOf(aSum);
            } else {
                int aSumMod3 = aSum % 3;
                if (aSumMod3 == 1) {
                    aSumMod3 = 2;
                } else {
                    aSumMod3 = 1;
                }
                int maxSum = 0;
                for (int i = 0; i < this.n; i++) {
                    if (this.a[i] % 3 == aSumMod3) {
                        maxSum += this.a[i];
                    }
                }
                this.result = String.valueOf(maxSum);
            }
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader br;
        StringTokenizer st;

        public FastInputReader() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
            this.st = new StringTokenizer("");
        }

        public String read() {
            while (!this.st.hasMoreTokens()) {
                try {
                    this.st = new StringTokenizer(this.br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(this.read());
        }
    }

    public static void main(String[] args) {
        CodeforcesTask397CSolution solution = new CodeforcesTask397CSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```

## Codeforces Task 397D - On Corruption and Number of Pairs
### 题目大意
给出一个数列，求出这个数列中有多少对数，使得这两个数的和能被3整除。

### 解题思路
首先，如果这个数列的和能被3整除，那么这个数列的子序列的和也能被3整除。

其次，如果这个数列的和不能被3整除，那么这个数列的子序列的和也不能被3整除。

因此，我们可以先求出这个数列的和，然后根据这个数列的和是否能被3整除，分别求出这个数列的有多少对数的和能被3整除。

### 代码
Python code:
```python
class CodeforcesTask397DSolution:
    def __init__(self):
        self.result = ''
        self.n = 0
        self.a = []

    def read_input(self):
        self.n = int(input())
        self.a = [int(x) for x in input().split(' ')]

    def process_task(self):
        a_sum = sum(self.a)
        if a_sum % 3 == 0:
            self.result = str(self.n * (self.n - 1) // 2)
        else:
            a_sum_mod_3 = a_sum % 3
            if a_sum_mod_3 == 1:
                a_sum_mod_3 = 2
            else:
                a_sum_mod_3 = 1
            count = 0
            for i in range(self.n):
                if self.a[i] % 3 == a_sum_mod_3:
                    count += 1
            self.result = str(count * (count - 1) // 2)

    def get_result(self):
        return self.result

if __name__ == '__main__':
    Solution = CodeforcesTask397DSolution()
    Solution.read_input()
    Solution.process_task()
    print(Solution.get_result())
```

Java code:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeforcesTask397D {

    private static class CodeforcesTask397DSolution {
        private int n;
        private int[] a;
        private String result;

        public CodeforcesTask397DSolution() {
            this.n = 0;
            this.a = new int[0];
            this.result = "";
        }

        public void readInput() {
            FastInputReader in = new FastInputReader();
            this.n = in.readInt();
            this.a = new int[this.n];
            for (int i = 0; i < this.n; i++) {
                this.a[i] = in.readInt();
            }
        }

        public void processTask() {
            int aSum = 0;
            for (int i = 0; i < this.n; i++) {
                aSum += this.a[i];
            }
            if (aSum % 3 == 0) {
                this.result = String.valueOf(this.n * (this.n - 1) / 2);
            } else {
                int aSumMod3 = aSum % 3;
                if (aSumMod3 == 1) {
                    aSumMod3 = 2;
                } else {
                    aSumMod3 = 1;
                }
                int count = 0;
                for (int i = 0; i < this.n; i++) {
                    if (this.a[i] % 3 == aSumMod3) {
                        count++;
                    }
                }
                this.result = String.valueOf(count * (count - 1) / 2);
            }
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader br;
        StringTokenizer st;

        public FastInputReader() {
            this.br = new BufferedReader(new InputStreamReader(System.in));
            this.st = new StringTokenizer("");
        }

        public String read() {
            while (!this.st.hasMoreTokens()) {
                try {
                    this.st = new StringTokenizer(this.br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.st.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(this.read());
        }
    }

    public static void main(String[] args) {
        CodeforcesTask397DSolution solution = new CodeforcesTask397DSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```

## Codeforces Task 397E - On Corruption and Paths in the Country
### 题目大意
给出一个有向图，求出从1到n的路径的数量。

### 解题思路
使用动态规划，从n到1进行计算。

### 代码
Python code:
```python
class CodeforcesTask397ESolution:
    def __init__(self):
        self.result = ''
        self.n = 0
        self.m = 0
        self.graph = []

    def read_input(self):
        self.n, self.m = [int(x) for x in input().split(' ')]
        self.graph = [[] for _ in range(self.n + 1)]
        for _ in range(self.m):
            u, v = [int(x) for x in input().split(' ')]
            self.graph[u].append(v)

    def process_task(self):
        dp = [0] * (self.n + 1)
        dp[self.n] = 1
        for i in range(self.n - 1, 0, -1):
            for j in self.graph[i]:
                dp[i] += dp[j]
        self.result = str(dp[1])

    def get_result(self):
        return self.result

if __name__ == '__main__':
    Solution = CodeforcesTask397ESolution()
    Solution.read_input()
    Solution.process_task()
    print(Solution.get_result())
```

Java
