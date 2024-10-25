<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
1 3 5 7 9 8 6 4 2 0

Expected output:
9


```
def main_function ( ) :
    n = int ( input ( ) )
    a = [ int ( i ) for i in input ( ).split ( " " ) ]
    current_level = 0
    counter = 0
    counter_turns = - 1
    while counter < len ( a ) :
        counter_turns += 1
        for i in range ( len ( a ) ) :
            if a [ i ] != - 1 and a [ i ] <= counter :
                counter += 1
                a [ i ] = - 1
        a.reverse ( )
    print ( counter_turns )
main_function ( )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int counterTurns = -1;
        while (counter < a.length) {
            counterTurns++;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
            a = reverseArray(a);
        }
        System.out.println(counterTurns);
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the standard input, then reads `n` integers into an array `a`. It then iterates over `a`, incrementing a counter for each non-negative integer it finds, and setting the found integer to `-1`. After each iteration, it reverses the array. The number of iterations is stored in `counterTurns`, which is then printed to the standard output. <｜end▁of▁sentence｜>
