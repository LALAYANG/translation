<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13 3
LRRLRLRRLRLLR

Expected output:
9


```
from _collections import deque
def parser ( ) :
    while 1 :
        data = list ( input ( ).split ( ' ' ) )
        for number in data :
            if len ( number ) > 0 :
                yield ( number )
input_parser = parser ( )
def gw ( ) :
    global input_parser
    return next ( input_parser )
def gi ( ) :
    data = gw ( )
    return int ( data )
MOD = int ( 1e9 + 7 )
import numpy
import scipy
from collections import deque
N = gi ( )
K = gi ( )
S = gw ( )
seg_cnt = 0
for i in range ( 0 , N - 1 ) :
    if S [ i ] != S [ i + 1 ] :
        seg_cnt += 1
cur_happy = N - 1 - seg_cnt
if 2 * K >= seg_cnt :
    ans = N - 1
else :
    ans = cur_happy + 2 * K
print ( ans )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        int ans;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * K;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, counts the number of segments in the string, calculates the number of unhappy people, and then calculates the maximum number of people that can be made happy. If the number of people that can be made happy by flipping K segments is greater than or equal to the number of segments, then all people can be made happy. Otherwise, the number of people that can be made happy is the number of unhappy people plus twice the number of segments that can be flipped. <｜end▁of▁sentence｜>
