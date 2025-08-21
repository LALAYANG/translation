

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        System.out.println(m);
    }
}

```

## 2.

Write a program that reads a number n and prints the sum of the first n even numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}

```

## 3.

Write a program that reads a number n and prints the sum of the first n odd numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i + 1;
        }
        System.out.println(sum);
    }
}

```

## 4.

Write a program that reads a number n and prints the sum of the first n numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

```

## 5.

Write a program that reads a number n and prints the sum of the first n squares.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}

```

## 6.

Write a program that reads a number n and prints the sum of the first n cubes.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i * i * i;
        }
        System.out.println(sum);
    }
}

```

## 7.

Write a program that reads a number n and prints the sum of the first n powers of 2.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(2, i);
        }
        System.out.println(sum);
    }
}

```

## 8.

Write a program that reads a number n and prints the sum of the first n powers of 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(3, i);
        }
        System.out.println(sum);
    }
}

```

## 9.

Write a program that reads a number n and prints the sum of the first n powers of 4.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(4, i);
        }
        System.out.println(sum);
    }
}

```

## 10.

Write a program that reads a number n and prints the sum of the first n powers of 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(5, i);
        }
        System.out.println(sum);
    }
}

```

## 11.

Write a program that reads a number n and prints the sum of the first n powers of 6.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(6, i);
        }
        System.out.println(sum);
    }
}

```

## 12.

Write a program that reads a number n and prints the sum of the first n powers of 7.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(7, i);
        }
        System.out.println(sum);
    }
}

```

## 13.

Write a program that reads a number n and prints the sum of the first n powers of 8.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(8, i);
        }
        System.out.println(sum);
    }
}

```

## 14.

Write a program that reads a number n and prints the sum of the first n powers of 9.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(9, i);
        }
        System.out.println(sum);
    }
}

```

## 15.

Write a program that reads a number n and prints the sum of the first n powers of 10.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(10, i);
        }
        System.out.println(sum);
    }
}

```

## 16.

Write a program that reads a number n and prints the sum of the first n powers of 11.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(11, i);
        }
        System.out.println(sum);
    }
}

```

## 17.

Write a program that reads a number n and prints the sum of the first n powers of 12.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(12, i);
        }
        System.out.println(sum);
    }
}

```

## 18.

Write a program that reads a number n and prints the sum of the first n powers of 13.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(13, i);
        }
        System.out.println(sum);
    }
}

```

## 19.

Write a program that reads a number n and prints the sum of the first n powers of 14.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(14, i);
        }
        System.out.println(sum);
    }
}

```

## 20.

Write a program that reads a number n and prints the sum of the first n powers of 15.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(15, i);
        }
        System.out.println(sum);
    }
}

```

## 21.

Write a program that reads a number n and prints the sum of the first n powers of 16.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(16, i);
        }
        System.out.println(sum);
    }
}

```

## 22.

Write a program that reads a number n and prints the sum of the first n powers of 17.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(17, i);
        }
        System.out.println(sum);
    }
}

```

## 23.

Write a program that reads a number n and prints the sum of the first n powers of 18.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(18, i);
        }
        System.out.println(sum);
    }
}

```

## 24.

Write a program that reads a number n and prints the sum of the first n powers of 19.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(19, i);
        }
        System.out.println(sum);
    }
}

```

## 25.

Write a program that reads a number n and prints the sum of the first n powers of 20.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(20, i);
        }
        System.out.println(sum);
    }
}

```

## 26.

Write a program that reads a number n and prints the sum of the first n powers of 21.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(21, i);
        }
        System.out.println(sum);
    }
}

```

## 27.

Write a program that reads a number n and prints the sum of the first n powers of 22.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(22, i);
        }
        System.out.println(sum);
    }
}

```

## 28.

Write a program that reads a number n and prints the sum of the first n powers of 23.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(23, i);
        }
        System.out.println(sum);
    }
}

```

## 29.

Write a program that reads a number n and prints the sum of the first n powers of 24.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(24, i);
        }
        System.out.println(sum);
    }
}

```

## 30.

Write a program that reads a number n and prints the sum of the first n powers of 25.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.pow(25, i);
        }
        System.out.println(sum);
    }
}

```

## 31.

Write a program that reads a number n and
