

```java

```
/README.md
# HackerRank-Solutions

This repository contains mye.
 solutions to the HackerRank problems.

I will be updating this repository as I solve more problems and keep improving my cod

```java

```
/Java/Java-If-Else.md
# Java If-Else

Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, n.

Constraints

1 <= n <= 100

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3

Sample Output 0

Weird

Sample Input 1

24

Sample Output 1

Not Weird

Explanation

Sample Case 0: n = 3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n = 24
n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
        {
            System.out.println("Weird");
        }
        else if(n%2==0 && n>=2 && n<=5)
        {
            System.out.println("Not Weird");
        }
        else if(n%2==0 && n>=6 && n<=20)
        {
            System.out.println("Weird");
        }
        else if(n%2==0 && n>20)
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println((max-min)*2);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```java

```
/Java/Java-End-of-file.md
# Java End-of-file

This challenge is a classic example of the Java while loop.

You can learn more about the while loop at the [Tutorial](https://www.hackerrank.com/challenges/java-loops/tutorial) tab.

Task

Read lines of input until you reach EOF, then number and print all of them.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown number of lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.

Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.

Explanation

The first line printed contains the integer 1 followed by a single space, then the contents of the line: Hello world.
The second line printed contains the integer 2 followed by a single space, then the contents of the line: I am a file.
The third line printed contains the integer 3 followed by a single space, then the contents of the line: Read me until end-of-file.

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNext())
        {
            System.out.println(i+" "+sc.nextLine());
            i++;
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```java

```

# Java Stdin and Stdout I

In this problem you will test your knowledge of Java's standard input and output.

Input Format

You will be given two integers, a and b on two separate lines.

Output Format

Output two lines. On the first line, output the sum of a and b (a+b). On the second line print the product of a and b (a*b).

Sample Input

1
2

Sample Output

3
2

Explanation

1 + 2 = 3
1 x 2 = 2

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a*b);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```java

```

# Java If-Else

Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, n.

Constraints

1 <= n <= 100

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3

Sample Output 0

Weird

Sample Input 1

24

Sample Output 1

Not Weird

Explanation

Sample Case 0: n = 3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n = 24
n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
        {
            System.out.println("Weird");
        }
        else if(n%2==0 && n>=2 && n<=5)
        {
            System.out.println("Not Weird");
        }
        else if(n%2==0 && n>=6 && n<=20)
        {
            System.out.println("Weird");
        }
        else if(n%2==0 && n>20)
        {
            System.out.println("Not Weird");
        }
        else
        {
            System.out.println("Not Weird");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```java

```

# Java Stdin and Stdout II

In this problem you will test your knowledge of Java's standard input and output.

Input Format

You will be given an integer, N, on the first line.
You will be given N lines of input, each containing a name and email ID.

Output Format

Print the 's and email IDs on separate lines.

Sample Input

3
riya 
julia 
julia 
Sample Output

riya 
julia 
julia 
Explanation

The first line contains N = 3, so there are three lines of input.
The first line contains the first name 'riya' and email ID ''.
The second line contains the first name 'julia' and email ID ''.
The third line contains the first name 'julia' and email ID ''.

Since there are two 'julia's, we print the first name and email ID on the first line, and the next email ID on the next line.

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        String b[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
            b[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" "+b[i]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```java

```

# Java Output Formatting

In this challenge, you must read a number from stdin and then print it to stdout in a right justified manner. The width of the field is equal to the number of digits of the number.

Input Format

A single integer denoting n.

Output Format

Print the input integer n in the right-justified format.

Sample Input

3

Sample Output

     3

Explanation

The width of the field is equal to the number of digits of the number.

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("%1$"+n+"s",n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```java

```

# Java Loops I

In this problem you will test your knowledge of Java loops.

Given three integers a, b, and n, output the following series:

a+20b, a+20b+21b, ...., a+20b+21b+...+2nb

Input Format

The first line will contain the number of testcases t.
Each of the next t lines will have three integers, a, b, and n.

Constraints:
0 <= t <= 500
0 <= a,b <= 50
1 <= n <= 15

Output Format

Print the answer to each test case in separate lines.

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation

There are two testcases.
In the first case: a = 0, b = 2, n = 10
0 + 20 + 21 = 2
0 + 20 + 21 + 22 = 6
0 + 20 + 21 + 22 + 23 = 14
0 + 20 + 21 + 22 + 23 + 24 = 30
0 + 20 + 21 + 22 + 23 + 24 + 25 = 62
0 + 20 + 21 + 22 + 23 + 24 + 25 + 26 = 126
0 + 20 + 21 + 22 + 23 + 24 + 25 + 26 + 27 = 254
0 + 20 + 21 + 22 + 23 + 24 + 25 + 26 + 27 + 28 = 510
0 + 20 + 21 + 22 + 23 + 24 + 25 + 26 + 27 + 28 + 29 = 1022
0 + 20 + 21 + 22 + 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 = 2046

In the second case: a = 5, b = 3, n = 5
5 + 15 + 24 = 8
5 + 15 + 24 + 33 = 14
5 + 15 + 24 + 33 + 42 = 26
5 + 15 + 24 + 33 + 42 + 51 = 50
5 + 15 + 24 + 33 + 42 + 51 + 60 = 98

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int sum=a;
            for(int j=0;j<n;j++)
            {
                sum=sum+(int)Math.pow(2,j)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```

```java

```

# Java Loops II

In this problem you will test your knowledge of Java loops.

Given three integers a, b, and n, output the following series:

a+20b, a+20b+21b, ...., a+20b+21b+...+2nb

Input Format

The first line will contain the number of testcases t.
Each of the next t lines will have three integers, a, b, and n.

Constraints:
0 <= t <= 500
0 <= a,b <= 50
1 <= n <= 15

Output Format

Print the answer to each test case in separate lines.

Sample Input

2
0 2 10
5 3 5

Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Explanation

There are two testcases.
In the first case: a = 0, b = 2, n = 10
0 + 20 + 21 = 2
0 + 20 + 21 + 22 = 6
0 + 20 + 21 + 22 + 
