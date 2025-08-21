

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        String[][] answer = new String[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i < B) {
                    if (j < A) {
                        answer[i][j] = "0";
                    } else {
                        answer[i][j] = "1";
                    }
                } else {
                    if (j < A) {
                        answer[i][j] = "1";
                    } else {
                        answer[i][j] = "0";
                    }
                }
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}

```

## 2. 1000

### 2.1. Problem

Write a program that reads an integer $x$ and prints $x+1$.

### 2.2. Constraints

- $-1000 \leq x \leq 1000$

### 2.3. Input

Input is given from Standard Input in the following format:

```
x
```

### 2.4. Output

Print $x+1$.

### 2.5. Sample Input 1

```
1
```

### 2.6. Sample Output 1

```
2
```

### 2.7. Sample Input 2

```
-1000
```

### 2.8. Sample Output 2

```
-999
```

### 2.9. Sample Input 3

```
1000
```

### 2.10. Sample Output 3

```
1001
```

### 2.11. Note

This problem is an example of a problem that can be solved with a single line of code.

### 2.12. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        System.out.println(x + 1);
    }
}

```

## 3. 1001

### 3.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a+b$.

### 3.2. Constraints

- $-1000 \leq a, b \leq 1000$

### 3.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 3.4. Output

Print $a+b$.

### 3.5. Sample Input 1

```
1 2
```

### 3.6. Sample Output 1

```
3
```

### 3.7. Sample Input 2

```
-1000 1000
```

### 3.8. Sample Output 2

```
0
```

### 3.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 3.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a + b);
    }
}

```

## 4. 1002

### 4.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a-b$.

### 4.2. Constraints

- $-1000 \leq a, b \leq 1000$

### 4.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 4.4. Output

Print $a-b$.

### 4.5. Sample Input 1

```
1 2
```

### 4.6. Sample Output 1

```
-1
```

### 4.7. Sample Input 2

```
-1000 1000
```

### 4.8. Sample Output 2

```
-2000
```

### 4.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 4.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a - b);
    }
}

```

## 5. 1003

### 5.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a \times b$.

### 5.2. Constraints

- $-1000 \leq a, b \leq 1000$

### 5.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 5.4. Output

Print $a \times b$.

### 5.5. Sample Input 1

```
1 2
```

### 5.6. Sample Output 1

```
2
```

### 5.7. Sample Input 2

```
-1000 1000
```

### 5.8. Sample Output 2

```
-1000000
```

### 5.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 5.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a * b);
    }
}

```

## 6. 1004

### 6.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a/b$.

### 6.2. Constraints

- $-1000 \leq a, b \leq 1000$
- $b \neq 0$

### 6.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 6.4. Output

Print $a/b$.

### 6.5. Sample Input 1

```
1 2
```

### 6.6. Sample Output 1

```
0
```

### 6.7. Sample Input 2

```
-1000 1000
```

### 6.8. Sample Output 2

```
-1
```

### 6.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 6.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a / b);
    }
}

```

## 7. 1005

### 7.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a \mod b$.

### 7.2. Constraints

- $-1000 \leq a, b \leq 1000$
- $b \neq 0$

### 7.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 7.4. Output

Print $a \mod b$.

### 7.5. Sample Input 1

```
1 2
```

### 7.6. Sample Output 1

```
1
```

### 7.7. Sample Input 2

```
-1000 1000
```

### 7.8. Sample Output 2

```
-1000
```

### 7.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 7.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a % b);
    }
}

```

## 8. 1006

### 8.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a^b$.

### 8.2. Constraints

- $-1000 \leq a, b \leq 1000$

### 8.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 8.4. Output

Print $a^b$.

### 8.5. Sample Input 1

```
1 2
```

### 8.6. Sample Output 1

```
1
```

### 8.7. Sample Input 2

```
-1000 1000
```

### 8.8. Sample Output 2

```
1
```

### 8.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 8.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(Math.pow(a, b));
    }
}

```

## 9. 1007

### 9.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a \div b$.

### 9.2. Constraints

- $-1000 \leq a, b \leq 1000$
- $b \neq 0$

### 9.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 9.4. Output

Print $a \div b$.

### 9.5. Sample Input 1

```
1 2
```

### 9.6. Sample Output 1

```
0
```

### 9.7. Sample Input 2

```
-1000 1000
```

### 9.8. Sample Output 2

```
-1
```

### 9.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 9.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(a / b);
    }
}

```

## 10. 1008

### 10.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a \div b$ as a real number.

### 10.2. Constraints

- $-1000 \leq a, b \leq 1000$
- $b \neq 0$

### 10.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 10.4. Output

Print $a \div b$ as a real number.

### 10.5. Sample Input 1

```
1 2
```

### 10.6. Sample Output 1

```
0.5
```

### 10.7. Sample Input 2

```
-1000 1000
```

### 10.8. Sample Output 2

```
-1.0
```

### 10.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 10.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println((double) a / b);
    }
}

```

## 11. 1009

### 11.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a \div b$ as a real number with an accuracy of 10 decimal places.

### 11.2. Constraints

- $-1000 \leq a, b \leq 1000$
- $b \neq 0$

### 11.3. Input

Input is given from Standard Input in the following format:

```
a b
```

### 11.4. Output

Print $a \div b$ as a real number with an accuracy of 10 decimal places.

### 11.5. Sample Input 1

```
1 2
```

### 11.6. Sample Output 1

```
0.5000000000
```

### 11.7. Sample Input 2

```
-1000 1000
```

### 11.8. Sample Output 2

```
-1.0000000000
```

### 11.9. Note

This problem is an example of a problem that can be solved with a single line of code.

### 11.10. Solution

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.printf("%.10f\n", (double) a / b);
    }
}

```

## 12. 1010

### 12.1. Problem

Write a program that reads two integers $a$ and $b$ and prints $a \div b$ as a real number with
