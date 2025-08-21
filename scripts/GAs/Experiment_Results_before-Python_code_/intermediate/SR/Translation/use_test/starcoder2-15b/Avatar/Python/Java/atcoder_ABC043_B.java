

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String my_str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                my_str += c;
            } else if (c == 'B' && my_str.length() != 0) {
                my_str = my_str.substring(0, my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}

```


```

Java code:

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
/01-max-of-array.md
# Max of array

Write a program to find the maximum element in an array.

Input:
The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

Output:
Print the maximum element in the array.

Constraints:
1 <= N <= 1000
-1000 <= A[i] <= 1000

Sample Input:
5
1 2 3 4 5

Sample Output:
5

Explanation:
The maximum element in the array is 5.

```
n = int ( input ( ) )
a = [ int ( x ) for x in input ( ).split ( ) ]
max = a [ 0 ]
for i in range ( 1 , n ) :
    if a [ i ] > max :
        max = a [ i ]
print ( max )

```

Java code:

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

# Max of array

Write a program to find the maximum element in an array.

Input:
The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

Output:
Print the maximum element in the array.

Constraints:
1 <= N <= 1000
-1000 <= A[i] <= 1000

Sample Input:
5
1 2 3 4 5

Sample Output:
5

Explanation:
The maximum element in the array is 5.

```
n = int ( input ( ) )
a = [ int ( x ) for x in input ( ).split ( ) ]
max = a [ 0 ]
for i in range ( 1 , n ) :
    if a [ i ] > max :
        max = a [ i ]
print ( max )/01-sum-of-array.md
# Sum of array

Write a program to find the sum of the elements in an array.

Input:
The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

Output:
Print the sum of the elements in the array.

Constraints:
1 <= N <= 1000
-1000 <= A[i] <= 1000

Sample Input:
5
1 2 3 4 5

Sample Output:
15

Explanation:
The sum of the elements in the array is 15.

```
n = int ( input ( ) )
a = [ int ( x ) for x in input ( ).split ( ) ]
sum = 0
for i in range ( 0 , n ) :
    sum += a [ i ]
print ( sum )

```

Java code:

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

```

# Sum of array

Write a program to find the sum of the elements in an array.

Input:
The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

Output:
Print the sum of the elements in the array.

Constraints:
1 <= N <= 1000
-1000 <= A[i] <= 1000

Sample Input:
5
1 2 3 4 5

Sample Output:
15

Explanation:
The sum of the elements in the array is 15.

```
n = int ( input ( ) )
a = [ int ( x ) for x in input ( ).split ( ) ]
sum = 0
for i in range ( 0 , n ) :
    sum += a [ i ]
print ( sum )

```

Java code:

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

```
/01-sum-of-n-numbers.md
# Sum of N numbers

Write a program to find the sum of the first N natural numbers.

Input:
The first line contains an integer N, the number of natural numbers.

Output:
Print the sum of the first N natural numbers.

Constraints:
1 <= N <= 1000

Sample Input:
5

Sample Output:
15

Explanation:
The sum of the first 5 natural numbers is 15.

```
n = int ( input ( ) )
sum = 0
for i in range ( 1 , n + 1 ) :
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

# Sum of N numbers

Write a program to find the sum of the first N natural numbers.

Input:
The first line contains an integer N, the number of natural numbers.

Output:
Print the sum of the first N natural numbers.

Constraints:
1 <= N <= 1000

Sample Input:
5

Sample Output:
15

Explanation:
The sum of the first 5 natural numbers is 15.

```
n = int ( input ( ) )
sum = 0
for i in range ( 1 , n + 1 ) :
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
/01-sum-of-even-numbers.md
# Sum of even numbers

Write a program to find the sum of all even numbers between 1 and N.

Input:
The first line contains an integer N, the number of natural numbers.

Output:
Print the sum of all even numbers between 1 and N.

Constraints:
1 <= N <= 1000

Sample Input:
10

Sample Output:
30

Explanation:
The sum of all even numbers between 1 and 10 is 30.

```
n = int ( input ( ) )
sum = 0
for i in range ( 1 , n + 1 ) :
    if i % 2 == 0 :
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
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of even numbers

Write a program to find the sum of all even numbers between 1 and N.

Input:
The first line contains an integer N, the number of natural numbers.

Output:
Print the sum of all even numbers between 1 and N.

Constraints:
1 <= N <= 1000

Sample Input:
10

Sample Output:
30

Explanation:
The sum of all even numbers between 1 and 10 is 30.

```
n = int ( input ( ) )
sum = 0
for i in range ( 1 , n + 1 ) :
    if i % 2 == 0 :
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
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```
/01-sum-of-odd-numbers.md
# Sum of odd numbers

Write a program to find the sum of all odd numbers between 1 and N.

Input:
The first line contains an integer N, the number of natural numbers.

Output:
Print the sum of all odd numbers between 1 and N.

Constraints:
1 <= N <= 1000

Sample Input:
10

Sample Output:
25

Explanation:
The sum of all odd numbers between 1 and 10 is 25.

```
n = int ( input ( ) )
sum = 0
for i in range ( 1 , n + 1 ) :
    if i % 2 != 0 :
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
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```

# Sum of odd numbers

Write a program to find the sum of all odd numbers between 1 and N.

Input:
The first line contains an integer N, the number of natural numbers.

Output:
Print the sum of all odd numbers between 1 and N.

Constraints:
1 <= N <= 1000

Sample Input:
10

Sample Output:
25

Explanation:
The sum of all odd numbers between 1 and 10 is 25.

```
n = int ( input ( ) )
sum = 0
for i in range ( 1 , n + 1 ) :
    if i % 2 != 0 :
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
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

```
/01-sum-of-array-elements-at-even-indices.md
# Sum of array elements at even indices

Write a program to find the sum of the elements at even indices in an array.

Input:
The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

Output:
Print the sum of the elements at even indices in the array.

Constraints:
1 <= N <= 1000
-1000 <= A[i] <= 1000

Sample Input:
5
1 2 3 4 5

Sample Output:
6

Explanation:
The sum of the elements at even indices in the array is 6.

```
n = int ( input ( ) )
a = [ int ( x ) for x in input ( ).split ( ) ]
sum = 0
for i in range ( 0 , n , 2 ) :
    sum += a [ i ]
print ( sum )

```

Java code:

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
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}

```

# Sum of array elements at even indices

Write a program to find the sum of the elements at even indices in an array.

Input:
The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

Output:
Print the sum of the elements at even indices in the array.

Constraints:
1 <= N <= 1000
-1000 <= A[i] <= 1000

Sample Input:
5
1 2 3 4 5

Sample Output:
6

Explanation:
The sum of the elements at even indices in the array is 6.

```
n = int ( input ( ) )
a = [ int ( x ) for x in input ( ).split ( ) ]
sum = 0
for i in range ( 0 , n , 2 ) :
    sum += a [ i ]
print ( sum )

```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =
