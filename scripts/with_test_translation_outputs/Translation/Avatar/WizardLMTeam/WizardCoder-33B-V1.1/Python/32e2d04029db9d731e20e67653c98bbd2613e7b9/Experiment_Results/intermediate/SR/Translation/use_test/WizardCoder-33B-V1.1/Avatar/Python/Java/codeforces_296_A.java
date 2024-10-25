<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10
324 539 83 440 834 640 440 440 440 440

Expected output:
YES


```
n = int ( input ( ) )
m = input ( ).split ( )
possible = True
for i in set ( m ) :
    if m.count ( i ) >= n / 2 + 1 :
        possible = False
        break
print ( 'YES' if possible else 'NO' )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        boolean possible = true;
        for (int count : map.values()) {
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer n from the input, then reads n more integers into a HashMap. It counts the occurrences of each integer and checks if any of them appears more than n/2 + 1 times. If so, it prints "NO", otherwise it prints "YES". <｜end▁of▁sentence｜>
