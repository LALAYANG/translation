<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
2 7 3 4 9
3
1 25 11

Expected output:
1
5
3


```
L = [ ]
input ( )
r = 1
for k in input ( ).split ( ) :
    L += [ r ] * int ( k )
    r += 1
input ( )
for j in input ( ).split ( ) :
    print ( L [ int ( j ) - 1 ] )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read the first line of input
        int n = sc.nextInt();

        // create a list to store the numbers
        List<Integer> numbers = new ArrayList<>();

        // read the second line of input
        String[] input = sc.nextLine().split(" ");

        // loop through the input and add the numbers to the list
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }

        // read the third line of input
        String[] queries = sc.nextLine().split(" ");

        // loop through the queries and print the corresponding numbers
        for (int i = 0; i < queries.length; i++) {
            int index = Integer.parseInt(queries[i]) - 1;
            System.out.println(numbers.get(index));
        }
    }
}
```
Note: In Java, we use the `List` interface to represent a list of elements, and the `ArrayList` class to implement the list. We also use the `Scanner` class to read input from the user.</s>
