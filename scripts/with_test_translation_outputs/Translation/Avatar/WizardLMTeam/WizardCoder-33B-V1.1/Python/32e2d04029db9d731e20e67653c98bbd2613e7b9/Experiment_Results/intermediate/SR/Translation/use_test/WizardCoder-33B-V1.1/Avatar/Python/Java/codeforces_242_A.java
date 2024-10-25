<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 10 1 8

Expected output:
33
9 8
10 8
10 9
11 8
11 9
11 10
12 8
12 9
12 10
13 8
13 9
13 10
14 8
14 9
14 10
15 8
15 9
15 10
16 8
16 9
16 10
17 8
17 9
17 10
18 8
18 9
18 10
19 8
19 9
19 10
20 8
20 9
20 10


```
x , y , a , b = map ( int , input ( ).split ( ) )
games = [ ]
for i in range ( a , x + 1 ) :
    if ( i <= b ) : continue
    else :
        for j in range ( b , y + 1 ) :
            if i > j :
                games.append ( ( i , j ) )
print ( len ( games ) )
for i in games :
    print ( f"{i[0]} {i[1]}" )


```

### Response:
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        ArrayList<int[]> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) continue;
            else {
                for (int j = b; j <= y; j++) {
                    if (i > j) {
                        games.add(new int[]{i, j});
                    }
                }
            }
        }
        System.out.println(games.size());
        for (int[] game : games) {
            System.out.println(game[0] + " " + game[1]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, then it generates all possible pairs of integers (i, j) such that i > j, i is in the range [a, x], and j is in the range [b, y]. The pairs are stored in an ArrayList of integer arrays. The size of the ArrayList is printed first, followed by the pairs themselves. <｜end▁of▁sentence｜>
