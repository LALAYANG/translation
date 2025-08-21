
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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


