

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

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

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

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
/README.md
# Java-Python-Code-Translation

## 1.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
111 47
368 875 345 941 48 682 390 60 997 668 310 312 782 604 792 834 730 372 539 214 68 816 446 208 729 144 427 542 707 604 939 134 49 841 427 82 687 836 358 29 315 134 915 892 187 912 249 58 830 154 577 901 990 260 939 991 207 693 594 300 569 348 997 703 669 123 438 402 388 926 312 271 988 943 238 928 922 578 860 23 644 552 218 469 339 23 327 798 327 400 6 904 999 596 619 742 781 462 552 720 154 189 491 176 259 419 965 670 644 225 827

Expected output:
10522


```
n , k = map ( int , input ( ).split ( ) )
print ( sum ( sorted ( list ( map ( int , input ( ).split ( ) ) ) ) [ : k ] ) )


```

Java code:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
