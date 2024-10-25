<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
import java.util.*;

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

    public static int[] reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}
```
<|EOT|>
