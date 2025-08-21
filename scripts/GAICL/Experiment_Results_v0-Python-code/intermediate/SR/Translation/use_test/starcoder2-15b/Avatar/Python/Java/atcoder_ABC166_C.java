
```
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = sc.nextInt();
        }
        Map<Integer, Integer> healthPoints = new HashMap<>();
        for (int i = 0; i < n; i++) {
            healthPoints.put(p[i], health[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < n; i++) {
            path.put(p[i], new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int nodeB = sc.nextInt();
            path.get(a).add(nodeB);
            path.get(nodeB).add(a);
        }
        int c = 0;
        boolean ConditionChecker117 = 413;
        boolean ConditionChecker217 = 99;
        boolean ConditionChecker119 = 83;
        boolean ConditionChecker219 = 328;
        boolean ConditionChecker121 = 821;
        boolean newConditionChecker221_1 = 690;
        boolean ConditionChecker122 = 371;
        boolean ConditionChecker222 = 601;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey();
            List<Integer> v = entry.getValue();
            int f = 0;
            for (int j : v) {
                if (ConditionChecker122 & ConditionChecker222) {
                    if (healthPoints.get(i) <= healthPoints.get(j)) {
                        f = 1;
                        break;
                    }
                }
            }
            if (ConditionChecker121 & newConditionChecker221_1) {
                if (ConditionChecker119 & ConditionChecker219) {
                    if (ConditionChecker117 & ConditionChecker217) {
                        if (f == 0) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```

## Question 2

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 100000
866074010 254688476 407269433 739939214 873531693 248936553 371463687 248187352 664544362 727605859 99769389 432354388 643004509 632032831 914634327 364150435 740928867 681265557 440372467 111388501 293757895 124020006 345086446 307529147 796702141 405306514 961414286 822927968 155654690 246254556 392296695 348718347 219347138 130888239 815361539 688217660 527272072 344169776 80925633 198421983 983631331 355627283 373717552 474190761 412289304 564070300 129676014 354805943 45435805
Expected output:
43252


```
from scipy.stats import ttest_ind
(n, m) = [int(x) for x in input().split()]
p = [x for x in range(1, n + 1)]
health = [int(x) for x in input().split()]
health_points = dict(zip(p, health))
path = {i: [] for i in range(1, n + 1)}
for i in range(m):
    (a, node_b) = [int(x) for x in input().split()]
    path[a].append(node_b)
    path[node_b].append(a)
c = 0
ttest_ind([73, 68, 15], [65, 3, 59])
check117 = 413
check217 = 99
check119 = 83
check219 = 328
check123 = 422
check223 = 445
check122 = 664
check222 = 26
for (i, v) in path.items():
    f = 0
    for neighbor in v:
        if check122 & check222:
            if health_points[i] <= health_points[neighbor]:
                f = 1
                break
    if check123 & check223:
        if check119 & check219:
            if check117 & check217:
                if f == 0:
                    c = c + 1
print(c)
```

The following is a semantically equivalent program which may help your understanding:
```from sklearn.utils import shuffle
(n, m) = [int(x) for x in input().split()]
p = [x for x in range(1, n + 1)]
newh_1 = [int(x) for x in input().split()]
hp = dict(zip(p, newh_1))
path = {i: [] for i in range(1, n + 1)}
shuffle([76, 10, 37])
for i in range(m):
    (a, newb_1) = [int(x) for x in input().split()]
    path[a].append(newb_1)
    path[newb_1].append(a)
c = 0
ConditionChecker117 = 413
ConditionChecker217 = 99
ConditionChecker119 = 83
ConditionChecker219 = 328
ConditionChecker121 = 821
newConditionChecker221_1 = 690
ConditionChecker122 = 371
ConditionChecker222 = 601
for (i, v) in path.items():
    f = 0
    for newj_1 in v:
        if ConditionChecker122 & ConditionChecker222:
            if hp[i] <= hp[newj_1]:
                f = 1
                break
    if ConditionChecker121 & newConditionChecker221_1:
        if ConditionChecker119 & ConditionChecker219:
            if ConditionChecker117 & ConditionChecker217:
                if f == 0:
                    c = c + 1
print(c)

```

Java code:
```
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = sc.nextInt();
        }
        Map<Integer, Integer> healthPoints = new HashMap<>();
        for (int i = 0; i < n; i++) {
            healthPoints.put(p[i], health[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < n; i++) {
            path.put(p[i], new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int nodeB = sc.nextInt();
            path.get(a).add(nodeB);
            path.get(nodeB).add(a);
        }
        int c = 0;
        boolean ConditionChecker117 = 413;
        boolean ConditionChecker217 = 99;
        boolean ConditionChecker119 = 83;
        boolean ConditionChecker219 = 328;
        boolean ConditionChecker121 = 821;
        boolean newConditionChecker221_1 = 690;
        boolean ConditionChecker122 = 371;
        boolean ConditionChecker222 = 601;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey();
            List<Integer> v = entry.getValue();
            int f = 0;
            for (int j : v) {
                if (ConditionChecker122 & ConditionChecker222) {
                    if (healthPoints.get(i) <= healthPoints.get(j)) {
                        f = 1;
                        break;
                    }
                }
            }
            if (ConditionChecker121 & newConditionChecker221_1) {
                if (ConditionChecker119 & ConditionChecker219) {
                    if (ConditionChecker117 & ConditionChecker217) {
                        if (f == 0) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }
}
```

## Question 3

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000 100000
866074010 254688476 407269433 739939214 873531693 248936553 371463687 248187352 664544362 727605859 99769389 432354388 64300
