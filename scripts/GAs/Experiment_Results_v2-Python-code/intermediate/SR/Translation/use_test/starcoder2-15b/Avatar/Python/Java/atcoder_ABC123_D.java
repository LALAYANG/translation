

```java

```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 输入三个整数x,y,z，请使用上述算法计算并输出结果。
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();
        List<Integer> a = Arrays.asList(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        List<Integer> b = Arrays.asList(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        List<Integer> c = Arrays.asList(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        // 然后，按照倒序打印结果。
        // 例如，输入
        // 2 2 2 8
        // 4 6
        // 1 5
        // 3 8
        // 程序应该输出
        // 19
        // 17
        // 15
        // 14
        // 13
        // 12
        // 10
        // 8
        List<Integer> sum_ab = sum_ab(a, b);
        List<Integer> abc = sum_abc(sum_ab, c);
        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }

    public static List<Integer> sum_ab(List<Integer> a,   for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                sum_ab.add(a.get(i) + b.get(j));
            }
        }
        return sum_ab;
    }

    public static List<Integer> sum_abc(List<Integer> sum_ab, List<Integer> c) {
        List<Integer> abc = sum_ab;
        for (int i = 0; i < sum_ab.size(); i++) {
            for (int j = 0; j < c.size(); j++) {
                abc.add(sum_ab.get(i) + c.get(j));
            }
        }
        return abc;
    }
}
 List<Integer> b) {
        List<Integer> sum_ab = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
     
