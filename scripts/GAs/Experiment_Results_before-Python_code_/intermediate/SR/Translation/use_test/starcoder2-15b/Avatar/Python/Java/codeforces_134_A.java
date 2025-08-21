

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            x += w[i];
        }
        int[] d = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                d[j] = i + 1;
                j++;
            }
        }
        System.out.println(j);
        for (int i = 0; i < j; i++) {
            System.out.print(d[i] + " ");
        }
    }
}

```
 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintEvenNumbers.md
# Print Even Numbers

## Description

Write a program to print all even numbers from 1 to n.

## Example

Input:

```
5
```

Output:

```
2 4
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =  }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintOddNumbers.md
# Print Odd Numbers

## Description

Write a program to print all odd numbers from 1 to n.

## Example

Input:

```
5
```

Output:

```
1 3 5
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintNumbersInReverseOrder.md
# Print Numbers In Reverse Order

## Description

Write a program to print all numbers from n to 1.

## Example

Input:

```
5
```

Output:

```
5 4 3 2 1
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
  /src/main/java/com/leetcode/algorithm/easy/PrintNumbersInOrder.md
# Print Numbers In Order

## Description

Write a program to print all numbers from 1 to n.

## Example

Input:

```
5
```

Output:

```
1 2 3 4 5
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintPrimeNumbers.md
# Print Prime Numbers

## Description

Write a program to print all prime numbers from 1 to n.

## Example

Input:

```
10
```

Output:

```
2 3 5 7
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintMultiplicationTable.md
# Print Multiplication Table

## Description

Write a program to print the multiplication table of n.

## Example

Input:

```
5
```

Output:

```
1 2 3 4 5
2 4 6 8 10
3 6 9 12 15
4 8 12 16 20
5 10 15 20 25
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintFibonacciSequence.md
# Print Fibonacci Sequence

## Description

Write a program to print the Fibonacc  int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

```
i sequence of n.

## Example

Input:

```
10
```

Output:

```
0 1 1 2 3 5 8 13 21 34
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintSquareNumbers.md
# Print Square Numbers

## Description

Write a program to print all square numbers from 1 to n.

## Example

Input:

```
5
```

Output:

```
1 4 9 16 25
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.print(i * i + " ");
            i++;
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1, square = 1; i <= n; i++, square += 2) {
            System.out.print(square + " ");
        }
  /src/main/java/com/leetcode/algorithm/easy/PrintTriangle.md
# Print Triangle

## Description

Write a program to print a triangle of n lines.

## Example

Input:

```
5
```

Output:

```
*
**
***
****
*****
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintReverseTriangle.md
# Print Reverse Triangle

## Description

Write a program to print a reverse triangle of n lines.

## Example

Input:

```
5
```

Output:

```
*****
****
***
**
*
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
         }
            System.out.println();
        }
    }
}

```
   /src/main/java/com/leetcode/algorithm/easy/PrintReverseNumbersInOrder.md
# Print Reverse Numbers In Order

## Description

Write a program to print all numbers from n to 1 in reverse order.

## Example

Input:

```
5
```

Output:

```
1 2 3 4 5
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintReverseNumbersInReverseOrder.md
# Print Reverse Numbers In Reverse Order

## Description

Write a program to print all numbers from 1 to n in reverse order.

## Example

Input:

```
5
```

Output:

```
5 4 3 2 1
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(n - i + 1 + " ");
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintReverseOddNumbers.md
# Print Reverse Odd Numbers

## Description

Write a program to print all odd numbers from n to 1 in reverse order.

## Example

Input:

```
5
```

Output:

```
5 3 1
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
    }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintReverseEvenNumbers.md
# Print Reverse Even Numbers

## Description

Write a program to print all even numbers from n to 1 in reverse order.

## Example

Input:

```
5
```

Output:

```
4 2
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
    }
}

```
  }
}

```
/src/main/java/com/leetcode/algorithm/easy/PrintReverseSquareNumbers.md
# Print Reverse Square Numbers

## Description

Write a program to print all square numbers from n to 1 in reverse order.

## Example

Input:

```
5
```

Output:

```
25 16 9 4 1
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            int square = i * i;
            System.out.print(square + " ");
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i * i + " ");
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n, square = n * n; i >= 1; i--, square -= 2 * i - 1) {
            System.out.print(square + " ");
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n, square = n * n; i >= 1; i--, square -= 2 * i - 1) {
            System.out.print(square + " ");
        }
    }
}

```

```
import java.util.Scanner;

public class Main {
