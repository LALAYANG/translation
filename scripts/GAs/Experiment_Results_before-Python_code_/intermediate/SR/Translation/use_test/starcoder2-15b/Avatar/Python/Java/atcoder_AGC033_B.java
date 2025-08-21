

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int s_r = sc.nextInt();
        int s_c = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        boolean Judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, T_R = 0, T_U = 0, T_D = 0;
        for (int x = 0; x < N; x++) {
            if (S.charAt(x) == 'L') {
                S_L++;
                if (S_L - T_R - s_c == 0) {
                    Judge = true;
                }
            } else if (S.charAt(x) == 'R') {
                S_R++;
                if (s_c + (S_R - T_L) == W + 1) {
                    Judge = true;
                }
            } else if (S.charAt(x) == 'U') {
                S_U++;
                if (S_U - T_D - s_r == 0) {
                    Judge = true;
                }
            } else if (S.charAt(x) == 'D') {
                S_D++;
                if (s_r + (S_D - T_U) == H + 1) {
                    Judge = true;
                }
            }
            if (T.charAt(x) == 'L') {
                if (S_R - T_L + s_c != 1) {
                    T_L++;
                }
            }
            if (T.charAt(x) == 'R') {
                if (s_c + (T_R - S_L) != W) {
                    T_R++;
                }
            }
            if (T.charAt(x) == 'U') {
                if (S_D - T_U + s_r != 1) {
                    T_U++;
                }
            }
            if (T.charAt(x) == 'D') {
                if (s_r + (T_D - S_U) != H) {
                    T_D++;
                }
            }
        }
        if (Judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}

```

## 2. 1000000007

### 2.1. Description

Given a positive integer N, calculate the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 2.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 2.3. Output

For each test case, print a single line containing one integer ― the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 2.4. Constraints

1≤T≤100
1≤N≤1018

### 2.5. Subtasks

Subtask #1 (100 points): original constraints

### 2.6. Example

Input:

```
2
3
10

```

Output:

```
3
18

```

### 2.7. Explanation

Test case 1: The only positive integer less than or equal to 3 and divisible by 3 is 3.
Test case 2: The positive integers less than or equal to 10 and divisible by 3 are 3, 6 and 9. Their sum is 18.

### 2.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long sum = 0;
            long n = N / 3;
            sum = n * (n + 1) * 3 / 2;
            System.out.println(sum);
        }
    }
}

```

## 3. 1000000007

### 3.1. Description

Given a positive integer N, calculate the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 3.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 3.3. Output

For each test case, print a single line containing one integer ― the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 3.4. Constraints

1≤T≤100
1≤N≤1018

### 3.5. Subtasks

Subtask #1 (100 points): original constraints

### 3.6. Example

Input:

```
2
3
10

```

Output:

```
3
18

```

### 3.7. Explanation

Test case 1: The only positive integer less than or equal to 3 and divisible by 3 is 3.
Test case 2: The positive integers less than or equal to 10 and divisible by 3 are 3, 6 and 9. Their sum is 18.

### 3.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long sum = 0;
            long n = N / 3;
            sum = n * (n + 1) * 3 / 2;
            System.out.println(sum);
        }
    }
}

```

## 4. 1000000007

### 4.1. Description

Given a positive integer N, calculate the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 4.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 4.3. Output

For each test case, print a single line containing one integer ― the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 4.4. Constraints

1≤T≤100
1≤N≤1018

### 4.5. Subtasks

Subtask #1 (100 points): original constraints

### 4.6. Example

Input:

```
2
3
10

```

Output:

```
3
18

```

### 4.7. Explanation

Test case 1: The only positive integer less than or equal to 3 and divisible by 3 is 3.
Test case 2: The positive integers less than or equal to 10 and divisible by 3 are 3, 6 and 9. Their sum is 18.

### 4.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long sum = 0;
            long n = N / 3;
            sum = n * (n + 1) * 3 / 2;
            System.out.println(sum);
        }
    }
}

```

## 5. 1000000007

### 5.1. Description

Given a positive integer N, calculate the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 5.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 5.3. Output

For each test case, print a single line containing one integer ― the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 5.4. Constraints

1≤T≤100
1≤N≤1018

### 5.5. Subtasks

Subtask #1 (100 points): original constraints

### 5.6. Example

Input:

```
2
3
10

```

Output:

```
3
18

```

### 5.7. Explanation

Test case 1: The only positive integer less than or equal to 3 and divisible by 3 is 3.
Test case 2: The positive integers less than or equal to 10 and divisible by 3 are 3, 6 and 9. Their sum is 18.

### 5.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long sum = 0;
            long n = N / 3;
            sum = n * (n + 1) * 3 / 2;
            System.out.println(sum);
        }
    }
}

```

## 6. 1000000007

### 6.1. Description

Given a positive integer N, calculate the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 6.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 6.3. Output

For each test case, print a single line containing one integer ― the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 6.4. Constraints

1≤T≤100
1≤N≤1018

### 6.5. Subtasks

Subtask #1 (100 points): original constraints

### 6.6. Example

Input:

```
2
3
10

```

Output:

```
3
18

```

### 6.7. Explanation

Test case 1: The only positive integer less than or equal to 3 and divisible by 3 is 3.
Test case 2: The positive integers less than or equal to 10 and divisible by 3 are 3, 6 and 9. Their sum is 18.

### 6.8. Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long sum = 0;
            long n = N / 3;
            sum = n * (n + 1) * 3 / 2;
            System.out.println(sum);
        }
    }
}

```

## 7. 1000000007

### 7.1. Description

Given a positive integer N, calculate the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 7.2. Input

The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains a single integer N.

### 7.3. Output

For each test case, print a single line containing one integer ― the sum of all the positive integers that are less than or equal to N and are divisible by 3.

### 7.4. Constraints

1≤T≤100
1≤N≤1018

### 7.5. Subtasks

Subtask #1 (100 points): original constraints

### 7.6. Example

Input:

```
2
3
10

```

Output:

```
3
18

```

### 7.7. Explanation

Test case 1: The only positive integer less than or equal to 3 and divisible by 3 is 3.
Test case 2: The positive integers less than or equal to 10 and divisible by 3 are 3, 6 and 9. Their sum is 18.

### 7.8. Solution

```
import java.util.Scanner;

public class Main {
    public
