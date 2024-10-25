<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Pair> games = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            if (i <= b) {
                continue;
            }
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    games.add(new Pair(i, j));
                }
            }
        }

        System.out.println(games.size());
        for (Pair game : games) {
            System.out.println(game.getFirst() + " " + game.getSecond());
        }
    }

    static class Pair {
        private int first;
        private int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}
```
Note: The `Pair` class is used to store the two numbers in each game. The `games` list is used to store all the pairs of numbers that meet the condition. The `for` loop is used to iterate over the range of numbers from `a` to `x` and `b` to `y`. If the current number is greater than the previous number, it is added to the `games` list. Finally, the size of the `games` list is printed, followed by the pairs of numbers in the list.</s>
