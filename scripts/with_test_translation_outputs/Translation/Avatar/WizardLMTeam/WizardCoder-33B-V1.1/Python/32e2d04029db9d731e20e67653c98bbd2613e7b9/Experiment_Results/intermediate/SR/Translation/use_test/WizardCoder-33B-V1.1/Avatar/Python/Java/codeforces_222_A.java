<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
        if (!allSame(elems, k - 1, elems.length)) {
            System.out.println(-1);
            return;
        }
        int target = elems[elems.length - 1];
        List<Integer> toDelete = new ArrayList<>();
        for (int i = 0; i < k - 1; i++) {
            toDelete.add(elems[i]);
        }
        while (!toDelete.isEmpty() && toDelete.get(toDelete.size() - 1) == target) {
            toDelete.remove(toDelete.size() - 1);
        }
        System.out.println(toDelete.size());
    }

    private static boolean allSame(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }

    private static boolean allSame(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] != arr[end - 1]) {
                return false;
            }
        }
        return true;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, checks if all elements are the same, checks if `k` is 1, checks if the last `k - 1` elements are the same, and then removes the last elements from the list until it finds a different element. Finally, it prints the number of elements removed. <｜end▁of▁sentence｜>
