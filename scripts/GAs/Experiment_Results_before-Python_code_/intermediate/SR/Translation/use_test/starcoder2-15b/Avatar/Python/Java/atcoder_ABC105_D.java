

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int[] cum_remainders = new int[N + 1];
        for (int i = 0; i < N; i++) {
            cum_remainders[i + 1] = (cum_remainders[i] + A[i]) % M;
        }
        Map<Integer, Integer> remainder_counts = new HashMap<>();
        for (int i = 0; i < N + 1; i++) {
            int remainder = cum_remainders[i];
            if (remainder_counts.containsKey(remainder)) {
                remainder_counts.put(remainder, remainder_counts.get(remainder) + 1);
            } else {
                remainder_counts.put(remainder, 1);
            }
        }
        int combinations = 0;
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a positive integer N, find the number of ways to write it as a sum of consecutive positive integers.

### 2.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 2.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 2.4. Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109

### 2.5. Subtasks

Subtask #1 (100 points): original constraints

### 2.6. Example Input

```
3
4
5
6

```

### 2.7. Example Output

```
1
2
3

```

### 2.8. Explanation

Test case 1: 4 can only be written as 1 + 2 + 1.

Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.

Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 2.9. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int ways = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ways++;
                }
            }
            System.out.println(ways);
        }
    }
}

```

## 3. 1000000008

### 3.1. Description

Given a positive integer N, find the number of ways to write it as a sum of consecutive positive integers.

### 3.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 3.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 3.4. Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109

### 3.5. Subtasks

Subtask #1 (100 points): original constraints

### 3.6. Example Input

```
3
4
5
6

```

### 3.7. Example Output

```
1
2
3

```

### 3.8. Explanation

Test case 1: 4 can only be written as 1 + 2 + 1.

Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.

Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 3.9. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int ways = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ways++;
                }
            }
            System.out.println(ways);
        }
    }
}

```

## 4. 1000000009

### 4.1. Description

Given a positive integer N, find the number of ways to write it as a sum of consecutive positive integers.

### 4.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 4.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 4.4. Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109

### 4.5. Subtasks

Subtask #1 (100 points): original constraints

### 4.6. Example Input

```
3
4
5
6

```

### 4.7. Example Output

```
1
2
3

```

### 4.8. Explanation

Test case 1: 4 can only be written as 1 + 2 + 1.

Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.

Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 4.9. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int ways = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ways++;
                }
            }
            System.out.println(ways);
        }
    }
}

```

## 5. 1000000010

### 5.1. Description

Given a positive integer N, find the number of ways to write it as a sum of consecutive positive integers.

### 5.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 5.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 5.4. Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109

### 5.5. Subtasks

Subtask #1 (100 points): original constraints

### 5.6. Example Input

```
3
4
5
6

```

### 5.7. Example Output

```
1
2
3

```

### 5.8. Explanation

Test case 1: 4 can only be written as 1 + 2 + 1.

Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.

Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 5.9. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int ways = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ways++;
                }
            }
            System.out.println(ways);
        }
    }
}

```

## 6. 1000000011

### 6.1. Description

Given a positive integer N, find the number of ways to write it as a sum of consecutive positive integers.

### 6.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 6.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 6.4. Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109

### 6.5. Subtasks

Subtask #1 (100 points): original constraints

### 6.6. Example Input

```
3
4
5
6

```

### 6.7. Example Output

```
1
2
3

```

### 6.8. Explanation

Test case 1: 4 can only be written as 1 + 2 + 1.

Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.

Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 6.9. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int ways = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ways++;
                }
            }
            System.out.println(ways);
        }
    }
}

```

## 7. 1000000012

### 7.1. Description

Given a positive integer N, find the number of ways to write it as a sum of consecutive positive integers.

### 7.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 7.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 7.4. Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109

### 7.5. Subtasks

Subtask #1 (100 points): original constraints

### 7.6. Example Input

```
3
4
5
6

```

### 7.7. Example Output

```
1
2
3

```

### 7.8. Explanation

Test case 1: 4 can only be written as 1 + 2 + 1.

Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.

Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 7.9. Solution

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            int ways = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ways++;
                }
            }
            System.out.println(ways);
        }
    }
}

```

## 8. 1000000013

### 8.1. Description

Given a positive integer N, find the number of ways to write it as a sum of consecutive positive integers.

### 8.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 8.3. Output

For each test case, print a single line containing one integer — the number of ways to write N as a sum of consecutive positive integers.

### 8.4. Constraints

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109

### 8.5. Subtasks

Subtask #1 (100 points): original constraints

### 8.6. Example Input

```
3
4
5
6

```

### 8.7. Example Output

```
1
2
3

```

### 8.8. Explanation

Test case 1: 4 can only be written as 1 + 2 + 1.

Test case 2: 5 can be written as 1 + 2 + 2 or 2 + 3.

Test case 3: 6 can be written as 1 + 2 + 3, 2 + 3 + 1 or 3 + 3.

### 8.9. Solution

```java
import java.util.*;
import java.io.*;

public class Main
