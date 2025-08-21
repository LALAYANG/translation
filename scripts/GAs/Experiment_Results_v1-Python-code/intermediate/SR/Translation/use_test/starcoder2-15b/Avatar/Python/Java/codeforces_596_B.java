

```java
import java.util.Scanner;
import java.util.Arrays;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputNumbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        TTest tTest = new TTest();
        double absoluteDifferenceSum = Math.abs(inputNumbers[0]);
        int outerLoopLimit = 158;
        int maximumLoopCount = 157;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit; LoopIndexOut++) {
            for (int i = 1; i < n; i++) {
                absoluteDifferenceSum += Math.abs(inputNumbers[i] - inputNumbers[i - 1]);
            }
        }
        System.out.println(absoluteDifferenceSum);
    }
}
```

## 2.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 13.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 14.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 15.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 16.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 17.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 18.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 19.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 20.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 21.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 22.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 23.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        while (input != 0) {
            sum += input;
            input = sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 24.

Write a program that reads a list of numbers and prints the sum of the numbers. Your program should stop reading when the user enters 0.

```
Sample Input:
1
2
3
0

Sample Output:
6
```

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
       
