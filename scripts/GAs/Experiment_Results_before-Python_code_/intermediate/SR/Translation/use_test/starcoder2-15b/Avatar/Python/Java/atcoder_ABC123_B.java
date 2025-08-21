

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = sc.nextLine();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(Integer.parseInt(m) * e);
        }
        Collections.sort(menu);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil(menu.get(i) / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0));
    }
}
```

## 2. 1000000007

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
```

## 3. 1000000009

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 1000000009.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 1000000009);
        }
    }
}
```

## 4. 10000000019

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000019.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 10000000019);
        }
    }
}
```

## 5. 10000000033

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000033.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 10000000033);
        }
    }
}
```

## 6. 10000000061

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000061.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 10000000061);
        }
    }
}
```

## 7. 10000000079

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000079.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 10000000079);
        }
    }
}
```

## 8. 10000000097

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000097.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 10000000097);
        }
    }
}
```

## 9. 10000000103

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 10000000103.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 10000000103);
        }
    }
}
```

## 10. 100000000003

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 100000000003.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 100000000003);
        }
    }
}
```

## 11. 100000000033

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 100000000033.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3
4

Output:
6
10

### Explanation

Test case 1: Sum of numbers from 1 to 3 is 6.
Test case 2: Sum of numbers from 1 to 4 is 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println((n * (n + 1) / 2) % 100000000033);
        }
    }
}
```

## 12. 100000000061

Given a number N, find the sum of all the numbers from 1 to N.

### Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### Output

For each test case, print a single line containing one integer - the sum of all the numbers from 1 to N modulo 100000000061.

### Constraints

1 ≤ T ≤ 100000
1 ≤ N ≤ 1000000000

### Example

Input:
2
3

