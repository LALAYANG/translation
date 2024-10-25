<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100 10
7 4 5 5 10 10 5 8 5 7 4 5 4 6 8 8 2 6 3 3 10 7 10 8 6 2 7 3 9 7 7 2 4 5 2 4 9 5 10 1 10 5 10 4 1 3 4 2 6 9 9 9 10 6 2 5 6 1 8 10 4 10 3 4 10 5 5 4 10 4 5 3 7 10 2 7 3 6 9 6 1 6 5 5 4 6 6 4 4 1 5 1 6 6 6 8 8 6 2 6

Expected output:
4428


```
def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > 1) {
                res += n - i - map.get(arr[i]);
                map.put(arr[i], map.get(arr[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, stores it in an array, and then uses a HashMap to count the occurrences of each number. It then iterates over the array again, and for each number, it adds the number of remaining elements (n - i - 1) to the result, unless the number has already been counted (in which case it subtracts the count from the remaining elements). The result is then printed. <｜end▁of▁sentence｜>
