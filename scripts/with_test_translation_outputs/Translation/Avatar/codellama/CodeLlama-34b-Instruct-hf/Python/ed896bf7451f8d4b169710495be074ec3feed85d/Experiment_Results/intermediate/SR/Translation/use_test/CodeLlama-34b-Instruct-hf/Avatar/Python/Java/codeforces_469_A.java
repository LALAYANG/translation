<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100
74 96 32 63 12 69 72 99 15 22 1 41 79 77 71 31 20 28 75 73 85 37 38 59 42 100 86 89 55 87 68 4 24 57 52 8 92 27 56 98 95 58 34 9 45 14 11 36 66 76 61 19 25 23 78 49 90 26 80 43 70 13 65 10 5 74 81 21 44 60 97 3 47 93 6
64 68 21 27 16 91 23 22 33 12 71 88 90 50 62 43 28 29 57 59 5 74 10 95 35 1 67 93 36 32 86 40 6 64 78 46 89 15 84 53 18 30 17 85 2 3 47 92 25 48 76 51 20 82 52 83 99 63 80 11 94 54 39 7 58

Expected output:
I become the guy.


```
max_level = int ( input ( ) )
x = list ( map ( int , input ( ).split ( ) ) )
y = list ( map ( int , input ( ).split ( ) ) )
x.pop ( 0 )
y.pop ( 0 )
x = set ( x )
y = set ( y )
if 0 in x :
    x.discard ( 0 )
elif 0 in y :
    y.discard ( 0 )
z = x.union ( y )
if len ( z ) != max_level :
    print ( "Oh, my keyboard!" )
else :
    print ( "I become the guy." )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLevel = sc.nextInt();
        int[] x = new int[maxLevel];
        int[] y = new int[maxLevel];

        for (int i = 0; i < maxLevel; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < maxLevel; i++) {
            y[i] = sc.nextInt();
        }

        int[] z = new int[maxLevel];
        for (int i = 0; i < maxLevel; i++) {
            z[i] = x[i] + y[i];
        }

        if (z[0] == 0) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```
Note: The above code assumes that the input is in the format specified in the problem statement. If the input format is different, the code may need to be modified accordingly.</s>
