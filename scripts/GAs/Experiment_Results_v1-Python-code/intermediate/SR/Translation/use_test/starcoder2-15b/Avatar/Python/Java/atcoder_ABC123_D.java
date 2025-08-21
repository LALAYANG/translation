

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int group_size = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int top_count = sc.nextInt();
        int[] a = new int[group_size];
        int[] b = new int[y];
        int[] third_group = new int[z];
        for (int i = 0; i < group_size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < z; i++) {
            third_group[i] = sc.nextInt();
        }
        int[] ab = new int[group_size * y];
        for (int i = 0; i < group_size; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        int[] abc = new int[top_count * z];
        for (int i = 0; i < Math.min(top_count, group_size * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[i * z + j] = ab[i] + third_group[j];
            }
        }
        Arrays.sort(abc);
        for (int i = 0; i < top_count; i++) {
            System.out.println(abc[i]);
        }
    }
}
```

## 2.2.2.2. 2019-2020

### 2019-2020-1

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-2

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-3

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-4

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-5

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-6

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-7

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-8

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-9

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-10

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-11

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-12

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-13

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-14

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-15

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-16

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-17

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-18

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
```

### 2019-2020-19

Write a program that reads a list of integers and prints the sum of the even numbers in the list.

```
Sample input:
1 2 3 4 5 6 7 8 9 10

Expected output:
30
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNextInt
