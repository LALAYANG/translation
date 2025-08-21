

```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>();
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = x.poll();
            int s = x.poll();
            int r = m - y.size();
            if (r >= -d) {
                y.add(-s);
            } else {
                y.add(-s);
                y.poll();
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}

```

## 2. 2019-09-10

### 2.1. 1000. A+B

#### 2.1.1. Description

Calculate a + b.

#### 2.1.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.1.3. Output

For each test case, print the sum of a and b in one line.

#### 2.1.4. Sample Input

```
2
1 2
3 4

```

#### 2.1.5. Sample Output

```
3
7

```

#### 2.1.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}

```

### 2.2. 1001. A-B

#### 2.2.1. Description

Calculate a - b.

#### 2.2.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.2.3. Output

For each test case, print the difference of a and b in one line.

#### 2.2.4. Sample Input

```
2
1 2
3 4

```

#### 2.2.5. Sample Output

```
-1
-1

```

#### 2.2.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a - b);
        }
    }
}

```

### 2.3. 1002. A*B

#### 2.3.1. Description

Calculate a * b.

#### 2.3.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.3.3. Output

For each test case, print the product of a and b in one line.

#### 2.3.4. Sample Input

```
2
1 2
3 4

```

#### 2.3.5. Sample Output

```
2
12

```

#### 2.3.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a * b);
        }
    }
}

```

### 2.4. 1003. A/B

#### 2.4.1. Description

Calculate a / b.

#### 2.4.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.4.3. Output

For each test case, print the quotient of a and b in one line.

#### 2.4.4. Sample Input

```
2
1 2
3 4

```

#### 2.4.5. Sample Output

```
0
0

```

#### 2.4.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        }
    }
}

```

### 2.5. 1004. A%B

#### 2.5.1. Description

Calculate a % b.

#### 2.5.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.5.3. Output

For each test case, print the remainder of a and b in one line.

#### 2.5.4. Sample Input

```
2
1 2
3 4

```

#### 2.5.5. Sample Output

```
1
3

```

#### 2.5.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a % b);
        }
    }
}

```

### 2.6. 1005. A^B

#### 2.6.1. Description

Calculate a ^ b.

#### 2.6.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.6.3. Output

For each test case, print the power of a and b in one line.

#### 2.6.4. Sample Input

```
2
1 2
3 4

```

#### 2.6.5. Sample Output

```
1
81

```

#### 2.6.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Math.pow(a, b));
        }
    }
}

```

### 2.7. 1006. A and B

#### 2.7.1. Description

Calculate the sum of all even numbers between a and b (including a and b).

#### 2.7.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.7.3. Output

For each test case, print the sum of all even numbers between a and b (including a and b) in one line.

#### 2.7.4. Sample Input

```
2
1 2
3 4

```

#### 2.7.5. Sample Output

```
2
8

```

#### 2.7.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for (int j = a; j <= b; j++) {
                if (j % 2 == 0) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}

```

### 2.8. 1007. A or B

#### 2.8.1. Description

Calculate the sum of all odd numbers between a and b (including a and b).

#### 2.8.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.8.3. Output

For each test case, print the sum of all odd numbers between a and b (including a and b) in one line.

#### 2.8.4. Sample Input

```
2
1 2
3 4

```

#### 2.8.5. Sample Output

```
1
9

```

#### 2.8.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = 0;
            for (int j = a; j <= b; j++) {
                if (j % 2 == 1) {
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}

```

### 2.9. 1008. A xor B

#### 2.9.1. Description

Calculate a xor b.

#### 2.9.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.9.3. Output

For each test case, print the xor of a and b in one line.

#### 2.9.4. Sample Input

```
2
1 2
3 4

```

#### 2.9.5. Sample Output

```
3
7

```

#### 2.9.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a ^ b);
        }
    }
}

```

### 2.10. 1009. A & B

#### 2.10.1. Description

Calculate a & b.

#### 2.10.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.10.3. Output

For each test case, print the and of a and b in one line.

#### 2.10.4. Sample Input

```
2
1 2
3 4

```

#### 2.10.5. Sample Output

```
0
0

```

#### 2.10.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a & b);
        }
    }
}

```

### 2.11. 1010. A | B

#### 2.11.1. Description

Calculate a | b.

#### 2.11.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.11.3. Output

For each test case, print the or of a and b in one line.

#### 2.11.4. Sample Input

```
2
1 2
3 4

```

#### 2.11.5. Sample Output

```
3
7

```

#### 2.11.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a | b);
        }
    }
}

```

### 2.12. 1011. A << B

#### 2.12.1. Description

Calculate a << b.

#### 2.12.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.12.3. Output

For each test case, print the left shift of a and b in one line.

#### 2.12.4. Sample Input

```
2
1 2
3 4

```

#### 2.12.5. Sample Output

```
4
48

```

#### 2.12.6. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a << b);
        }
    }
}

```

### 2.13. 1012. A >> B

#### 2.13.1. Description

Calculate a >> b.

#### 2.13.2. Input

The first line contains an integer T, denoting the number of test cases.

Each test case contains a single line with two integers a and b, separated by a single space.

#### 2.13.3. Output

For each test case, print the right shift of a and b in one line.

#### 2.13.4. Sample Input

```
2
1 2

