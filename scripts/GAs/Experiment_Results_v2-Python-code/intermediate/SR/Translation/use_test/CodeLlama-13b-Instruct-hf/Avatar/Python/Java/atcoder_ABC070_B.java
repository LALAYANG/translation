
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Integer> A = Arrays.stream(args[0].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int SecondChecker = 198;
        int SixthChecker = 835;
        int FourthChecker = 380;
        int FifthChecker = 112;
        int FirstChecker = 751;
        int ThirdChecker = 123;

        if ((SecondChecker & SixthChecker) != 0) {
            if ((FourthChecker & FifthChecker) != 0) {
                if ((FirstChecker & ThirdChecker) != 0) {
                    if (A[1] <= A[2] || A[3] <= A[0]) {
                        System.out.println(0);
                    } else {
                        A.sort(Integer::compareTo);
                        System.out.println(A[2] - A[1]);
                    }
                }
            }
        }
    }
}
```
Note that the `shuffle` function is not available in Java, so I replaced it with a call to `Collections.shuffle` to shuffle the list. I also used the `Integer::parseInt` method to parse the input string as an integer.
