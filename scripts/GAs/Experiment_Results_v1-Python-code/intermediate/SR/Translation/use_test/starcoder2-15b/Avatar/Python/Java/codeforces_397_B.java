

```
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
            FastInputReader reader = new FastInputReader();
            this.t = reader.readInt();
            for (int i = 0; i < this.t; i++) {
                int[] query = new int[3];
                query[0] = reader.readInt();
                query[1] = reader.readInt();
                query[2] = reader.readInt();
                this.queries.add(query);
            }
        }

        public void processTask() {
            StringBuilder builder = new StringBuilder();
            for (int[] query : this.queries) {
                int dividend = query[0];
                int divisor = query[1];
                int quotient = dividend / divisor;
                builder.append(quotient * query[2] >= query[0] ? "Yes" : "No").append("\n");
            }
            this.result = builder.toString();
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastInputReader() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
            this.tokenizer = null;
        }

        public String read() {
            while (this.tokenizer == null || !this.tokenizer.hasMoreTokens()) {
                try {
                    this.tokenizer = new StringTokenizer(this.reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.tokenizer.nextToken();
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
```---
layout: post
title: Codeforces 1005A. Tanya and Stairways solution
date: 2020-05-04
categories: [Codeforces]
tags: [Codeforces, code, solution, 1005A, implementation]
---
### Problem

[Tanya and Stairways](https://codeforces.com/problemset/problem/1005/A)

### Solution

The solution is pretty straightforward. We just need to iterate over the array and check if the current element is greater than the next one. If it is, we add the current element to the result array.

### Code

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CodeforcesTask1005A {

    private static class CodeforcesTask1005ASolution {
        private int n;
        private int[] a;
        private String result;

        public CodeforcesTask1005ASolution() {
            this.n = 0;
            this.a = new int[0];
            this.result = "";
        }

        public void readInput() {
            FastInputReader reader = new FastInputReader();
            this.n = reader.readInt();
            this.a = new int[this.n];
            for (int i = 0; i < this.n; i++) {
                this.a[i] = reader.readInt();
            }
        }

        public void processTask() {
            List<Integer> resultList = new ArrayList<>();
            for (int i = 0; i < this.n; i++) {
                if (i == this.n - 1 || this.a[i] > this.a[i + 1]) {
                    resultList.add(this.a[i]);
                }
            }
            StringBuilder builder = new StringBuilder();
            builder.append(resultList.size()).append("\n");
            for (int i = 0; i < resultList.size(); i++) {
                builder.append(resultList.get(i)).append(" ");
            }
            this.result = builder.toString();
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastInputReader() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
            this.tokenizer = null;
        }

        public String read() {
            while (this.tokenizer == null || !this.tokenizer.hasMoreTokens()) {
                try {
                    this.tokenizer = new StringTokenizer(this.reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.tokenizer.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(this.read());
        }
    }

    public static void main(String[] args) {
        CodeforcesTask1005ASolution solution = new CodeforcesTask1005ASolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```t.println(solution.getResult());
    }
}
```---
layout: post
title: Codeforces 1006A. Adjacent Replacements solution
date: 2020-05-04
categories: [Codeforces]
tags: [Codeforces, code, solution, 1006A, implementation]
---
### Problem

[Adjacent Replacements](https://codeforces.com/problemset/problem/1006/A)

### Solution

The solution is pretty straightforward. We just need to iterate over the array and check if the current element is odd. If it is, we replace it with the next even number.

### Code

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeforcesTask1006A {

    private static class CodeforcesTask1006ASolution {
        private int n;
        private int[] a;
        private String result;

        public CodeforcesTask1006ASolution() {
            this.n = 0;
            this.a = new int[0];
            this.result = "";
        }

        public void readInput() {
            FastInputReader reader = new FastInputReader();
            this.n = reader.readInt();
            this.a = new int[this.n];
            for (int i = 0; i < this.n; i++) {
                this.a[i] = reader.readInt();
            }
        }

        public void processTask() {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < this.n; i++) {
                if (this.a[i] % 2 == 1) {
                    builder.append(this.a[i] + 1).append(" ");
                } else {
                    builder.append(this.a[i]).append(" ");
                }
            }
            this.result = builder.toString();
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastInputReader() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
            this.tokenizer = null;
        }

        public String read() {
            while (this.tokenizer == null || !this.tokenizer.hasMoreTokens()) {
                try {
                    this.tokenizer = new StringTokenizer(this.reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.tokenizer.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(this.read());
        }
    }

    public static void main(String[] args) {
        CodeforcesTask1006ASolution solution = new CodeforcesTask1006ASolution();
        solution.readInput();
        solution.processTask();
        System.ou---
layout: post
title: Codeforces 1006B. Polycarp's Practice solution
date: 2020-05-04
categories: [Codeforces]
tags: [Codeforces, code, solution, 1006B, greedy, sorting]
---
### Problem

[Polycarp's Practice](https://codeforces.com/problemset/problem/1006/B)

### Solution

The solution is pretty straightforward. We just need to sort the array in descending order and then iterate over it and add the current element to the result array if the current element is greater than the current index.

### Code

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CodeforcesTask1006B {

    private static class CodeforcesTask1006BSolution {
        private int n;
        private int k;
        private int[] a;
        private String result;

        public CodeforcesTask1006BSolution() {
            this.n = 0;
            this.k = 0;
            this.a = new int[0];
            this.result = "";
        }

        public void readInput() {
            FastInputReader reader = new FastInputReader();
            this.n = reader.readInt();
            this.k = reader.readInt();
            this.a = new int[this.n];
            for (int i = 0; i < this.n; i++) {
                this.a[i] = reader.readInt();
            }
        }

        public void processTask() {
            List<Integer> resultList = new ArrayList<>();
            List<Integer> aList = new ArrayList<>();
            for (int i = 0; i < this.n; i++) {
                aList.add(this.a[i]);
            }
            Collections.sort(aList, Collections.reverseOrder());
            for (int i = 0; i < this.n; i++) {
                if (i < this.k && aList.get(i) > i) {
                    resultList.add(aList.get(i));
                }
            }
            StringBuilder builder = new StringBuilder();
            builder.append(resultList.size()).append("\n");
            for (int i = 0; i < resultList.size(); i++) {
                builder.append(resultList.get(i)).append(" ");
            }
            this.result = builder.toString();
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public FastInputReader() {
            this.reader = new BufferedReader(new InputStreamReader(System.in));
            this.tokenizer = null;
        }

        public String read() {
            while (this.tokenizer == null || !this.tokenizer.hasMoreTokens()) {
                try {
                    this.tokenizer = new StringTokenizer(this.reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this.tokenizer.nextToken();
        }

        public int readInt() {
            return Integer.parseInt(this.read());
        }
    }

    public static void main(String[] args) {
        CodeforcesTask1006BSolution solution = new CodeforcesTask1006BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```---
layout: post
title: Codeforces 1005B. Delete from the Left solution
date: 2020-05-04
categories: [Codeforces]
tags: [Codeforces, code, solution, 1005B, implementation, strings]
---
### Problem

[Delete from the Left](https://codeforces.com/problemset/problem/1005/B)

### Solution

The solution is pretty straightforward. We just need to iterate over the strings and check if the current characters are equal. If they are not, we need to delete the current characters from both strings.

### Code

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeforcesTask1005B {

    private static class CodeforcesTask1005BSolution {
        private String s;
        private String t;
        private String result;

        public CodeforcesTask1005BSolution() {
            this.s = "";
            this.t = "";
            this.result = "";
        }

        public void readInput() {
            FastInputReader reader = new FastInputReader();
            this.s = reader.read();
            this.t = reader.read();
        }

        public void processTask() {
            int i = 0;
            while (i < this.s.length() && i < this.t.length() && this.s.charAt(i) == this.t.charAt(i)) {
                i++;
            }
            this.result = String.valueOf(this.s.length() - i + this.t.length() - i);
        }

        public String getResult() {
            return this.result;
        }
    }

    private static class FastInputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;
