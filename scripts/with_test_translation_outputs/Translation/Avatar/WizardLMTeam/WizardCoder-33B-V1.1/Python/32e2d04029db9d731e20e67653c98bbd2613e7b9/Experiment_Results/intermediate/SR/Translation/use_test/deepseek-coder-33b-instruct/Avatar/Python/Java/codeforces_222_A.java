<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
20 20
20 1 19 2 18 3 17 4 16 5 15 6 14 7 13 8 12 9 11 10

Expected output:
19


```
def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] elems = new int[n];
        for (int i = 0; i < n; i++) {
            elems[i] = scanner.nextInt();
        }
        if (allSame(elems)) {
            System.out.println(0);
            return;
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (!allSame(Arrays.copyOfRange(elems, k - 1, elems.length))) {
            System.out.println(-1);
            return;
        }
        int target = elems[elems.length - 1];
        int[] toDelete = Arrays.copyOfRange(elems, 0, k - 1);
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = Arrays.copyOf(toDelete, toDelete.length - 1);
        }
        System.out.println(toDelete.length);
    }

    private static boolean allSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }
}
```
<|EOT|>
