

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println((arr[i + 1] - arr[i]) + " " + (arr[n - 1] - arr[i]));
                continue;
            }
            if (i == n - 1) {
                System.out.println((arr[n - 1] - arr[n - 2]) + " " + (arr[n - 1] - arr[0]));
                continue;
            }
            if (arr[i] - arr[i - 1] > arr[i + 1] - arr[i]) {
                System.out.print(arr[i + 1] - arr[i] + " ");
            } else {
                System.out.print(arr[i] - arr[i - 1] + " ");
            }
            if (arr[n - 1] - arr[i] > arr[i] - arr[0]) {
                System.out.println(arr[n - 1] - arr[i]);
            } else {
                System.out.println(arr[i] - arr[0]);
            }
        }
    }
}

```

## 3.

Write a program that reads a string and prints the number of times that the letters a, e, i, o, and u appear in the string.

```
inp = input ( )
a = 0
e = 0
i = 0
o = 0
u = 0
for i in inp :
    if i == "a" :
        a += 1
    elif i == "e" :
        e += 1
    elif i == "i" :
        i += 1
    elif i == "o" :
        o += 1
    elif i == "u" :
        u += 1
print ( f"a: {a}" )
print ( f"e: {e}" )
print ( f"i: {i}" )
print ( f"o: {o}" )
print ( f"u: {u}" )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'a') {
                a++;
            } else if (s.charAt(j) == 'e') {
                e++;
            } else if (s.charAt(j) == 'i') {
                i++;
            } else if (s.charAt(j) == 'o') {
                o++;
            } else if (s.charAt(j) == 'u') {
                u++;
            }
        }
        System.out.println("a: " + a);
        System.out.println("e: " + e);
        System.out.println("i: " + i);
        System.out.println("o: " + o);
        System.out.println("u: " + u);
    }
}

```

## 4.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive:

```
inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )

```

Java code:

```java
import java.util.Scanner;

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

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should print "Please enter a positive number".

```
inp = int ( input ( ) )
if inp < 0 :
    print ( "Please enter a positive number" )
else :
    sum = 0
    for i in range ( 1 , inp + 1 ) :
        sum += i
    print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Please enter a positive number");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}

```

## 6.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should keep asking them to enter a new number until they enter a positive one.

```
inp = int ( input ( ) )
while inp < 0 :
    inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

```

## 7.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should keep asking them to enter a new number until they enter a positive one. After that, the program should print "Thank you".

```
inp = int ( input ( ) )
while inp < 0 :
    inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )
print ( "Thank you" )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Thank you");
    }
}

```

## 8.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should keep asking them to enter a new number until they enter a positive one. After that, the program should print "Thank you" and the sum of the numbers.

```
inp = int ( input ( ) )
while inp < 0 :
    inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )
print ( "Thank you" )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Thank you");
    }
}

```

## 9.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should keep asking them to enter a new number until they enter a positive one. After that, the program should print "Thank you" and the sum of the numbers. If the sum is over 100, the program should print "That's a big number!".

```
inp = int ( input ( ) )
while inp < 0 :
    inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )
print ( "Thank you" )
if sum > 100 :
    print ( "That's a big number!" )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Thank you");
        if (sum > 100) {
            System.out.println("That's a big number!");
        }
    }
}

```

## 10.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should keep asking them to enter a new number until they enter a positive one. After that, the program should print "Thank you" and the sum of the numbers. If the sum is over 100, the program should print "That's a big number!". If the sum is under 10, the program should print "That's a small number!".

```
inp = int ( input ( ) )
while inp < 0 :
    inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )
print ( "Thank you" )
if sum > 100 :
    print ( "That's a big number!" )
elif sum < 10 :
    print ( "That's a small number!" )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Thank you");
        if (sum > 100) {
            System.out.println("That's a big number!");
        } else if (sum < 10) {
            System.out.println("That's a small number!");
        }
    }
}

```

## 11.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should keep asking them to enter a new number until they enter a positive one. After that, the program should print "Thank you" and the sum of the numbers. If the sum is over 100, the program should print "That's a big number!". If the sum is under 10, the program should print "That's a small number!". If the number is a multiple of 3, the program should print "That's a multiple of 3!".

```
inp = int ( input ( ) )
while inp < 0 :
    inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )
print ( "Thank you" )
if sum > 100 :
    print ( "That's a big number!" )
elif sum < 10 :
    print ( "That's a small number!" )
if sum % 3 == 0 :
    print ( "That's a multiple of 3!" )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Thank you");
        if (sum > 100) {
            System.out.println("That's a big number!");
        } else if (sum < 10) {
            System.out.println("That's a small number!");
        }
        if (sum % 3 == 0) {
            System.out.println("That's a multiple of 3!");
        }
    }
}

```

## 12.

Write a program that asks the user for a number n and prints the sum of the numbers 1 to n, inclusive. If the user enters a negative number, the program should keep asking them to enter a new number until they enter a positive one. After that, the program should print "Thank you" and the sum of the numbers. If the sum is over 100, the program should print "That's a big number!". If the sum is under 10, the program should print "That's a small number!". If the number is a multiple of 3, the program should print "That's a multiple of 3!". If the number is a multiple of 5, the program should print "That's a multiple of 5!".

```
inp = int ( input ( ) )
while inp < 0 :
    inp = int ( input ( ) )
sum = 0
for i in range ( 1 , inp + 1 ) :
    sum += i
print ( sum )
print ( "Thank you" )
if sum > 100 :
    print ( "That's a big number!" )
elif sum < 10 :
    print ( "That's a small number!" )
if sum % 3 == 0 :
    print ( "That's a multiple of 3!" )
if sum % 5 == 0 :
    print ( "That's a multiple of 5!" )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n < 0) {
            n = sc.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Thank you");
        if (sum > 100) {
            System.out.println("That
