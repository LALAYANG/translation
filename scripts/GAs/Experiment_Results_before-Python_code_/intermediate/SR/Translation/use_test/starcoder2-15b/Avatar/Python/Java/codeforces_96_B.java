

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = 1000000000;
        int[] l = new int[limit];
        int four = 0;
        int seven = 0;
        int number = 0;
        int ans = 0;
        int n = sc.nextInt();
        for (int i = 0; i < limit; i++) {
            if (number > limit) {
                break;
            }
            if (number > 0 && four == seven) {
                l[i] = number;
            }
            gen(number * 10 + 4, four + 1, seven);
            gen(number * 10 + 7, four, seven + 1);
        }
        Arrays.sort(l);
        for (int i = 0; i < limit; i++) {
            if (l[i] >= n) {
                ans = l[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

For example, if the string is "azcbobobegghakl", then your program should print:

Number of times bob occurs is: 2

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```

## 3.

Write a program that asks the user to input 10 integers, and then prints the largest odd number that was entered. If no odd number was entered, it should print a message to that effect.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        if (max == 0) {
            System.out.println("No odd number was entered");
        } else {
            System.out.println(max);
        }
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.

Write a program that asks the user to enter a number n and prints the sum of the numbers 1 to n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program that asks the user to enter a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            product *= i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
```

## 3.

Write a program that prints a multiplication table for numbers up to 12.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
```

## 4.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, including n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        for (int i = 1; i <= n; i++) {
            sum += i;
            product *= i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
```

## 6.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 13.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 14.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 15.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 16.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 17.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 18.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 19.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 20.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 21.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 22.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 23.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 24.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 25.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, excluding n.

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <
