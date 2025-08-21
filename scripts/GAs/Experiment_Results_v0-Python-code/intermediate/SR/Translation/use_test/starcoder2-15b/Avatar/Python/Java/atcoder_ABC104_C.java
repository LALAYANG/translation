

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int min_problems = 1000000000;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((CHECK1 & CHECK2) != 0) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(min_problems);
    }
}
```
/content/posts/2019-01-01-python-and-java-code-translation-2.md
---
title: "Python and Java Code Translation 2"
date: 2019-01-01T12:00:00+08:00
draft: false
---

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
from scipy.stats import ttest_ind
ttest_ind([46, 26, 50], [28, 13, 57])
import numpy as np
(num_problems, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for i in range(num_problems)]
min_problems = 10 ** 9
CHECK1 = 997
CHECK2 = 305
for i in range(2 ** num_problems):
    score = 0
    problem = 0

    def calculate_score(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if i >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score(j + step, stop, step)
    calculate_score(0, num_problems, 1)
    if CHECK1 & CHECK2:
        if score > G:
            continue
    left = G - score
    for j in range(num_problems):
        if i >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems = min(min_problems, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems)
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int min_problems = 1000000000;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((CHECK1 & CHECK2) != 0) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(min_problems);
    }
}
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
from scipy.stats import ttest_ind
ttest_ind([46, 26, 50], [28, 13, 57])
import numpy as np
(num_problems, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for i in range(num_problems)]
min_problems = 10 ** 9
CHECK1 = 997
CHECK2 = 305
for i in range(2 ** num_problems):
    score = 0
    problem = 0

    def calculate_score(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if i >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score(j + step, stop, step)
    calculate_score(0, num_problems, 1)
    if CHECK1 & CHECK2:
        if score > G:
            continue
    left = G - score
    for j in range(num_problems):
        if i >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems = min(min_problems, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems)
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int min_problems = 1000000000;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((CHECK1 & CHECK2) != 0) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 100 * (j + 1) * PC[j][0] + PC[j][1]) {
                    continue;
                } else {
                    int tmp = (left + 100 * (j + 1) - 1) / (100 * (j + 1));
                    min_problems = Math.min(min_problems, problem + Math.min(tmp, PC[j][0]));
                }
            }
        }
        System.out.println(min_problems);
    }
}
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10 1280600
59 337600
25 140500
50 276000
52 281900
100 532200
88 459600
60 307300
28 140700
41 201800
93 448400

Expected output:
220


```
from scipy.stats import ttest_ind
ttest_ind([46, 26, 50], [28, 13, 57])
import numpy as np
(num_problems, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for i in range(num_problems)]
min_problems = 10 ** 9
CHECK1 = 997
CHECK2 = 305
for i in range(2 ** num_problems):
    score = 0
    problem = 0

    def calculate_score(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if i >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score(j + step, stop, step)
    calculate_score(0, num_problems, 1)
    if CHECK1 & CHECK2:
        if score > G:
            continue
    left = G - score
    for j in range(num_problems):
        if i >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems = min(min_problems, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems)
```

Java code:

```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_problems = sc.nextInt();
        int G = sc.nextInt();
        int[][] PC = new int[num_problems][2];
        for (int i = 0; i < num_problems; i++) {
            PC[i][0] = sc.nextInt();
            PC[i][1] = sc.nextInt();
        }
        int min_problems = 1000000000;
        int CHECK1 = 997;
        int CHECK2 = 305;
        for (int i = 0; i < (1 << num_problems); i++) {
            int score = 0;
            int problem = 0;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    score += 100 * (j + 1) * PC[j][0] + PC[j][1];
                    problem += PC[j][0];
                }
            }
            if ((CHECK1 & CHECK2) != 0) {
                if (score > G) {
                    continue;
                }
            }
            int left = G - score;
            for (int j = 0; j < num_problems; j++) {
                if ((i >> j & 1) == 1) {
                    continue;
                }
                if (left > 10
