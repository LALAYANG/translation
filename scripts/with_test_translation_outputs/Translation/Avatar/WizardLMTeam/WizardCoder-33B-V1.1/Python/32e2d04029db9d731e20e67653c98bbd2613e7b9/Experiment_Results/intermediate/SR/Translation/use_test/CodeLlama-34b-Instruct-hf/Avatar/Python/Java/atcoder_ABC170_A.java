<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 2 0 4 5

Expected output:
3


```
a = list ( map ( int , input ( ).split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] a = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            a[i] = Integer.parseInt(numbers[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user, and the `Integer.parseInt()` method to convert a string to an integer. We also use a `for` loop to iterate over the elements of the `a` array, and an `if` statement to check if the current element is equal to 0. If it is, we print the index of the element plus 1, and use the `break` statement to exit the loop.</s>
