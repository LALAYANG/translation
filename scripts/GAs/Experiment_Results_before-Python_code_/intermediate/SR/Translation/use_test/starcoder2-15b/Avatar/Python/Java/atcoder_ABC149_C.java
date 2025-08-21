

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] prime = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            if (prime[i]) {
                for (int j = i + i; j < 100008; j += i) {
                    prime[j] = false;
                }
            }
            i += 2;
        }
        for (i = X; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 8.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 10.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

A sample test case is provided below:

Test input:

```
Hello, World!
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```


```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 10.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-arrays/01-arrays.md
# Arrays

## 1.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 3.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 4.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 5.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 6.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```

## 7.

Write a program that reads an integer n and an array of n integers. The program should print the maximum value in the array.

A sample test case is provided below:

Test input:

```
5
1 2 3 4 5
```

Expected output:

```
5

```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(
