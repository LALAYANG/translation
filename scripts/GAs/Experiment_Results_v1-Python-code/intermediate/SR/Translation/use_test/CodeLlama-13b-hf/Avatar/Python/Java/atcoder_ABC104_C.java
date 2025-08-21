
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
import numpy as np
(D, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for _ in range(D)]
min_problems_solved = 10 ** 9
DUMMY_CONDITION_1 = 642
DUMMY_CONDITION_2 = 322
for problem_set_mask in range(2 ** D):
    score = 0
    problem = 0

    def calculate_score_and_problems(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if problem_set_mask >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score_and_problems(j + step, stop, step)
    calculate_score_and_problems(0, D, 1)
    if DUMMY_CONDITION_1 & DUMMY_CONDITION_2:
        if score > G:
            continue
    left = G - score
    for j in range(D):
        if problem_set_mask >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems_solved = min(min_problems_solved, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems_solved)
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
import numpy as np
(D, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for _ in range(D)]
min_problems_solved = 10 ** 9
DUMMY_CONDITION_1 = 642
DUMMY_CONDITION_2 = 322
for problem_set_mask in range(2 ** D):
    score = 0
    problem = 0

    def calculate_score_and_problems(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if problem_set_mask >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score_and_problems(j + step, stop, step)
    calculate_score_and_problems(0, D, 1)
    if DUMMY_CONDITION_1 & DUMMY_CONDITION_2:
        if score > G:
            continue
    left = G - score
    for j in range(D):
        if problem_set_mask >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems_solved = min(min_problems_solved, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems_solved)
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
import numpy as np
(D, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for _ in range(D)]
min_problems_solved = 10 ** 9
DUMMY_CONDITION_1 = 642
DUMMY_CONDITION_2 = 322
for problem_set_mask in range(2 ** D):
    score = 0
    problem = 0

    def calculate_score_and_problems(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if problem_set_mask >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score_and_problems(j + step, stop, step)
    calculate_score_and_problems(0, D, 1)
    if DUMMY_CONDITION_1 & DUMMY_CONDITION_2:
        if score > G:
            continue
    left = G - score
    for j in range(D):
        if problem_set_mask >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems_solved = min(min_problems_solved, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems_solved)
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
import numpy as np
(D, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for _ in range(D)]
min_problems_solved = 10 ** 9
DUMMY_CONDITION_1 = 642
DUMMY_CONDITION_2 = 322
for problem_set_mask in range(2 ** D):
    score = 0
    problem = 0

    def calculate_score_and_problems(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if problem_set_mask >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score_and_problems(j + step, stop, step)
    calculate_score_and_problems(0, D, 1)
    if DUMMY_CONDITION_1 & DUMMY_CONDITION_2:
        if score > G:
            continue
    left = G - score
    for j in range(D):
        if problem_set_mask >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems_solved = min(min_problems_solved, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems_solved)
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
import numpy as np
(D, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for _ in range(D)]
min_problems_solved = 10 ** 9
DUMMY_CONDITION_1 = 642
DUMMY_CONDITION_2 = 322
for problem_set_mask in range(2 ** D):
    score = 0
    problem = 0

    def calculate_score_and_problems(j, stop, step):
        global score, problem
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if problem_set_mask >> j & 1:
            score += 100 * (j + 1) * PC[j][0] + PC[j][1]
            problem += PC[j][0]
        calculate_score_and_problems(j + step, stop, step)
    calculate_score_and_problems(0, D, 1)
    if DUMMY_CONDITION_1 & DUMMY_CONDITION_2:
        if score > G:
            continue
    left = G - score
    for j in range(D):
        if problem_set_mask >> j & 1:
            continue
        if left > 100 * (j + 1) * PC[j][0] + PC[j][1]:
            pass
        else:
            tmp = (left + 100 * (j + 1) - 1) // (100 * (j + 1))
            min_problems_solved = min(min_problems_solved, problem + np.min(np.array([tmp, PC[j][0]])))
print(min_problems_solved)
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
import numpy as np
(D, G) = map(int, input().split())
PC = [tuple(map(int, input().split())) for _ in range(D)]
min_problems_solved = 10 ** 9
DUMMY_CONDITION_1 = 642
DUMMY_CONDITION_2 = 3
