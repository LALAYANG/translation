<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        scanner.nextLine();
        String[] xStr = scanner.nextLine().split(" ");
        String[] yStr = scanner.nextLine().split(" ");
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for (int i = 1; i < xStr.length; i++) {
            x.add(Integer.parseInt(xStr[i]));
        }
        for (int i = 1; i < yStr.length; i++) {
            y.add(Integer.parseInt(yStr[i]));
        }
        if (x.contains(0)) {
            x.remove(0);
        } else if (y.contains(0)) {
            y.remove(0);
        }
        x.addAll(y);
        if (x.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }
}
```
<|EOT|>
