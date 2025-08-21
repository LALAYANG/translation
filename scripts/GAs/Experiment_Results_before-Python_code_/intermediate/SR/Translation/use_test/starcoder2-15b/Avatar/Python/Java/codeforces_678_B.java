

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String d = "f";
        String ans = "f";
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        } else {
            ans = "nly";
        }
        while (true) {
            if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                if (d.equals("m")) {
                    d = "w";
                    n += 1;
                } else if (d.equals("t")) {
                    d = "th";
                    n += 1;
                } else if (d.equals("w")) {
                    d = "f";
                    n += 1;
                } else if (d.equals("th")) {
                    d = "sa";
                    n += 1;
                } else if (d.equals("f")) {
                    d = "s";
                    n += 1;
                } else if (d.equals("sa")) {
                    d = "m";
                    n += 1;
                } else if (d.equals("s")) {
                    d = "t";
                    n += 1;
                }
            } else {
                if (d.equals("m")) {
                    d = "t";
                    n += 1;
                } else if (d.equals("t")) {
                    d = "w";
                    n += 1;
                } else if (d.equals("w")) {
                    d = "th";
                    n += 1;
                } else if (d.equals("th")) {
                    d = "f";
                    n += 1;
                } else if (d.equals("f")) {
                    d = "sa";
                    n += 1;
                } else if (d.equals("sa")) {
                    d = "s";
                    n += 1;
                } else if (d.equals("s")) {
                    d = "m";
                    n += 1;
                }
            }
            if (d.equals("f") && ans.equals("ly") && leapyear(n) == "y") {
                break;
            } else if (d.equals("f") && ans.equals("nly") && leapyear(n) == "n") {
                break;
            }
        }
        System.out.println(n);
    }

    public static String leapyear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            return "y";
        } else {
            return "n";
        }
    }
}

```

## 3.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 4.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 5.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 6.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 7.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 8.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 9.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 10.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 10.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```
/README.md
# Java-Programming-Assignment

## 1.

Write a program to find the sum of the first 1000 prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
12345

Expected output:
12351


```
def leapyear ( n ) :
    if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
        return "y"
    else :
        return "n"
n = int ( input ( ) )
d = "f"
if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
    ans = "ly"
else :
    ans = "nly"
while ( True ) :
    if ( n % 400 == 0 or ( n % 4 == 0 and n % 100 != 0 ) ) :
        if ( d == "m" ) :
            d = "w"
            n += 1
        elif ( d == "t" ) :
            d = "th"
            n += 1
        elif ( d == "w" ) :
            d = "f"
            n += 1
        elif ( d == "th" ) :
            d = "sa"
            n += 1
        elif ( d == "f" ) :
            d = "s"
            n += 1
        elif ( d == "sa" ) :
            d = "m"
            n += 1
        elif ( d == "s" ) :
            d = "t"
            n += 1
    else :
        if ( d == "m" ) :
            d = "t"
            n += 1
        elif ( d == "t" ) :
            d = "w"
            n += 1
        elif ( d == "w" ) :
            d = "th"
            n += 1
        elif ( d == "th" ) :
            d = "f"
            n += 1
        elif ( d == "f" ) :
            d = "sa"
            n += 1
        elif ( d == "sa" ) :
            d = "s"
            n += 1
        elif ( d == "s" ) :
            d = "m"
            n += 1
    if ( d == "f" and ans == "ly" and leapyear ( n ) == "y" ) :
        break
    elif ( d == "f" and ans == "nly" and leapyear ( n ) == "n" ) :
        break
print ( n )


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String d = "f";
        String ans = "f";
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            ans = "ly";
        } else {
            ans = "nly";
        }
        while (true) {
            if (n % 400 == 0 || (n % 4 == 
