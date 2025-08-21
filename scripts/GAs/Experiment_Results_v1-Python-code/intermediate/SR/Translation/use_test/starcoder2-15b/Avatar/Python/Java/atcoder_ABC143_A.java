

```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstChecker = 181;
        int twentyNinthChecker = 77;
        int seventeenthChecker = 855;
        int twentySeventhChecker = 93;
        int fifteenthChecker = 143;
        int twentyFifthChecker = 710;
        int A = sc.nextInt();
        int secondInput = sc.nextInt();
        int result = A - 2 * secondInput;
        TTest ttest = new TTest();
        if (firstChecker & twentyNinthChecker) {
            if (seventeenthChecker & twentySeventhChecker) {
                if (fifteenthChecker & twentyFifthChecker) {
                    if (result < 0) {
                        result = 0;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
```

## 2.2.2.2.2.2.3.

Write a program that takes a number as input and prints the square of that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number * number);
    }
}
```

## 2.2.2.2.2.2.4.

Write a program that takes a number as input and prints the square root of that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Math.sqrt(number));
    }
}
```

## 2.2.2.2.2.2.5.

Write a program that takes a number as input and prints the cube of that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number * number * number);
    }
}
```

## 2.2.2.2.2.2.6.

Write a program that takes a number as input and prints the cube root of that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(Math.cbrt(number));
    }
}
```

## 2.2.2.2.2.2.7.

Write a program that takes a number as input and prints the factorial of that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
```

## 2.2.2.2.2.2.8.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.9.

Write a program that takes a number as input and prints the sum of all the even numbers from 1 to that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.10.

Write a program that takes a number as input and prints the sum of all the odd numbers from 1 to that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.11.

Write a program that takes a number as input and prints the sum of all the prime numbers from 1 to that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 2.2.2.2.2.2.12.

Write a program that takes a number as input and prints the sum of all the perfect numbers from 1 to that number.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (isPerfect(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
```

## 2.2.2.2.2.2.13.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.14.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 5.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.15.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 7.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.16.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 11.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 11 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.17.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 13.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 13 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.18.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 17.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 17 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.19.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 19.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 19 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.20.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 23.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 23 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.21.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 29.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 29 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.22.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 31.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 31 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.23.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 37.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 37 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.24.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 41.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 41 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.25.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 43.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 43 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 2.2.2.2.2.2.26.

Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 47.

```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i =
