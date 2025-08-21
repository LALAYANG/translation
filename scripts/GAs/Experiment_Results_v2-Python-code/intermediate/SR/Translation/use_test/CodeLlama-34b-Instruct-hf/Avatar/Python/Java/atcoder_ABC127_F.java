```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int sumB = 0;
        int sumP1 = 0;
        int sumP2 = 0;
        int conditionOne = 569;
        int conditionTwo = 215;
        int outerLoopLimit = 205;
        int innerLoopLimit = 204;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int i = 0; i < q; i++) {
                int[] queryList = new int[3];
                queryList[0] = sc.nextInt();
                queryList[1] = sc.nextInt();
                queryList[2] = sc.nextInt();
                if (conditionOne & conditionTwo) {
                    if (queryList[0] == 2) {
                        if (p1.size() == p2.size()) {
                            System.out.println(-p2.peek() + " " + (sumP1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sumP2 + sumB));
                        } else {
                            System.out.println(p1.peek() + " " + (sumP1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sumP2 + sumB));
                        }
                    } else {
                        sumB += queryList[2];
                        if (p1.isEmpty()) {
                            p1.add(queryList[1]);
                            sumP1 += queryList[1];
                        } else if (p1.peek() <= queryList[1]) {
                            p1.add(queryList[1]);
                            sumP1 += queryList[1];
                        } else {
                            p2.add(-queryList[1]);
                            sumP2 += queryList[1];
                        }
                        if (p1.size() < p2.size()) {
                            int k = p2.poll();
                            p1.add(-k);
                            sumP2 += k;
                            sumP1 -= k;
                        }
                        if (p1.size() - 1 > p2.size()) {
                            int k = p1.poll();
                            p2.add(-k);
                            sumP1 -= k;
                            sumP2 += k;
                        }
                    }
                }
            }
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
