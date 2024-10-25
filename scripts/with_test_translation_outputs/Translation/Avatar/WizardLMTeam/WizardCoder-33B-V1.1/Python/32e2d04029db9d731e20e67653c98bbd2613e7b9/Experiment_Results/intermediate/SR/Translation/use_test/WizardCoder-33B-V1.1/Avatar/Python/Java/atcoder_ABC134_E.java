<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
def binary_search ( key ) :
    bad , good = - 1 , len ( ans )
    while good - bad > 1 :
        mid = ( bad + good ) // 2
        if ans [ mid ] [ - 1 ] < key :
            good = mid
        else :
            bad = mid
    return good
N = int ( input ( ) )
ans = [ ]
for _ in range ( N ) :
    A = int ( input ( ) )
    idx = binary_search ( A )
    if idx == len ( ans ) :
        ans.append ( [ A ] )
    else :
        ans [ idx ].append ( A )
print ( len ( ans ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int idx = binarySearch(ans, A);
            if (idx == ans.size()) {
                ans.add(new ArrayList<>(Arrays.asList(A)));
            } else {
                ans.get(idx).add(A);
            }
        }
        System.out.println(ans.size());
    }

    public static int binarySearch(ArrayList<ArrayList<Integer>> ans, int key) {
        int bad = -1, good = ans.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid).get(ans.get(mid).size() - 1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N from the standard input, then reads N integers from the standard input. For each integer, it finds the position where it should be inserted into the 2D ArrayList ans to maintain the sorted order. If the integer is larger than all existing integers in the last sublist of ans, it creates a new sublist and adds the integer to it. Finally, it prints the size of the 2D ArrayList ans. <｜end▁of▁sentence｜>
