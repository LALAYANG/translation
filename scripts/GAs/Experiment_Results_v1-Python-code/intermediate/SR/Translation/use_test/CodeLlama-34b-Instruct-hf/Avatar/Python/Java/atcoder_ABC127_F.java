```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        ArrayList<Integer> heapOne = new ArrayList<>();
        ArrayList<Integer> heapTwo = new ArrayList<>();
        int sumB = 0;
        int sumP1 = 0;
        int sumP2 = 0;
        int conditionA = 511;
        int conditionB = 162;
        int outerLoopLimit = 751;
        int innerLoopLimit = 750;

        for (int i = 0; i < outerLoopLimit; i++) {
            for (int j = 0; j < q; j++) {
                int[] ql = new int[3];
                ql[0] = sc.nextInt();
                ql[1] = sc.nextInt();
                ql[2] = sc.nextInt();

                if (conditionA & conditionB) {
                    if (ql[0] == 2) {
                        if (heapOne.size() == heapTwo.size()) {
                            System.out.println(-heapTwo.get(0) + " " + (sumP1 - heapOne.size() * -heapTwo.get(0) + heapTwo.size() * -heapTwo.get(0) - sumP2 + sumB));
                        } else {
                            System.out.println(heapOne.get(0) + " " + (sumP1 - heapOne.size() * heapOne.get(0) + heapTwo.size() * heapOne.get(0) - sumP2 + sumB));
                        }
                    } else {
                        sumB += ql[2];
                        if (heapOne.size() == 0) {
                            heapOne.add(ql[1]);
                            sumP1 += ql[1];
                        } else if (heapOne.get(0) <= ql[1]) {
                            heapOne.add(ql[1]);
                            sumP1 += ql[1];
                        } else {
                            heapTwo.add(-ql[1]);
                            sumP2 += ql[1];
                        }
                        if (heapOne.size() < heapTwo.size()) {
                            int k = heapTwo.remove(0);
                            heapOne.add(-k);
                            sumP2 += k;
                            sumP1 -= k;
                        }
                        if (heapOne.size() - 1 > heapTwo.size()) {
                            int k = heapOne.remove(0);
                            heapTwo.add(-k);
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
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
