<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
bbzmzqazmbambnmzaabznmbabzqnaabmabmnnabbmnzaanzzezebzabqaabzqaemeqqammmbazmmz
aznnbbmeebmanbeemzmemqbaeebnqenqzzbanebmnzqqebqmmnmqqzmmeqqqaaezemmazqqmqaqnnqqzbzeeazammmenbbamzbmnaenemenaaaebnmanebqmqnznqbenmqqnnnaeaebqmamennmqqeaaqqbammnzqmnmqnqbbezmemznqmanzmmqzzzzembqnzqbanamezqaqbazenenqqznqaebzaeezbqqbmeeaqnmmbnqbbnmaqqemaeaezaabmbnbzzaae

Expected output:
77


```
from collections import defaultdict , deque
from functools import lru_cache
from heapq import heappush , heappop
from typing import Counter
from bisect import bisect_right , bisect_left
import math
hpop = heappop
hpush = heappush
def solution ( ) :
    line = input ( )
    bought_count = Counter ( line )
    line = input ( )
    made_cout = Counter ( line )
    res = 0
    for color in made_cout :
        if color not in bought_count :
            return print ( - 1 )
        res += min ( bought_count [ color ] , made_cout [ color ] )
    print ( res )
def main ( ) :
    t = 1
    for _ in range ( t ) :
        solution ( )
main ( )


```
[/INST]
```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();

        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            if (!boughtCount.containsKey(c)) {
                boughtCount.put(c, 1);
            } else {
                boughtCount.put(c, boughtCount.get(c) + 1);
            }
        }

        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line2.toCharArray()) {
            if (!madeCount.containsKey(c)) {
                madeCount.put(c, 1);
            } else {
                madeCount.put(c, madeCount.get(c) + 1);
            }
        }

        int res = 0;
        for (char color : madeCount.keySet()) {
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }

        System.out.println(res);
    }
}
```
Note: The above code uses Java 8 features, so it requires at least Java 8 to run.</s>
