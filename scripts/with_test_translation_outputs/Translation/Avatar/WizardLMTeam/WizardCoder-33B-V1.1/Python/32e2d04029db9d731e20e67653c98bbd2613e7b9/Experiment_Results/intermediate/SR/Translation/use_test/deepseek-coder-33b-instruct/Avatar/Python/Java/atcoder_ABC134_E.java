<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int idx = binarySearch(ans, A);
            if (idx == ans.size()) {
                List<Integer> list = new ArrayList<>();
                list.add(A);
                ans.add(list);
            } else {
                ans.get(idx).add(A);
            }
        }
        System.out.println(ans.size());
    }

    private static int binarySearch(List<List<Integer>> ans, int key) {
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
<|EOT|>
