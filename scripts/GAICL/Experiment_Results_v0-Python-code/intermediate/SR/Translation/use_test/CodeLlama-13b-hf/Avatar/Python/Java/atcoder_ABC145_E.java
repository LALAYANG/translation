
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 60
10 10
10 20
10 30

Expected output:
60


```
import numpy as np
import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
(N, T) = [int(temp_var) for temp_var in input().split()]
time_value = [(-1, -1)] + [None] * N
for i in range(1, N + 1):
    time_value[i] = tuple((int(temp_var) for temp_var in input().split()))
time_value.sort(key=itemgetter(VAL))
dp = [[-1] * T for _ in range(N + 1)]
for t in range(0, T):
    dp[0][t] = 0
for n in range(1, N + 1):
    dp[n][0] = 0
    for t in range(1, T):
        if time_value[n][TIME] > t:
            dp[n][t] = dp[n - 1][t]
        else:
            dp[n][t] = np.max(np.array([dp[n - 1][t], time_value[n][VAL] + dp[n - 1][t - time_value[n][TIME]]]))
current_value_sum = time_value[N][VAL]
t = T - 1
max_value = current_value_sum + dp[N - 1][t]
check_condition_3 = 253
check_condition_4 = 97
check_condition_2 = 871
check_condition_1 = 214
for n in range(N - 1, 0, -1):
    current_value_sum += time_value[n][VAL]
    t -= time_value[n + 1][TIME]
    if check_condition_2 & check_condition_1:
        if check_condition_3 & check_condition_4:
            if t < 0:
                break
            else:
                max_value = max(max_value, current_value_sum + dp[n - 1][t])
print(max_value)
```

The following is a semantically equivalent program which may help your understanding:
```import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
(N, T) = [int(newa_1) for newa_1 in input().split()]
time_value = [(-1, -1)] + [None] * N
for i in range(1, N + 1):
    time_value[i] = tuple((int(newa_1) for newa_1 in input().split()))
time_value.sort(key=itemgetter(VAL))
dp = [[-1] * T for _ in range(N + 1)]
for t in range(0, T):
    dp[0][t] = 0
for n in range(1, N + 1):
    dp[n][0] = 0
    for t in range(1, T):
        if time_value[n][TIME] > t:
            dp[n][t] = dp[n - 1][t]
        else:
            dp[n][t] = max(dp[n - 1][t], time_value[n][VAL] + dp[n - 1][t - time_value[n][TIME]])
newval_acum_1 = time_value[N][VAL]
t = T - 1
newmax_val_1 = newval_acum_1 + dp[N - 1][t]
ConditionChecker127 = 253
ConditionChecker227 = 97
ConditionChecker129 = 871
ConditionChecker229 = 214
ConditionChecker131 = 772
ConditionChecker231 = 34
for n in range(N - 1, 0, -1):
    newval_acum_1 += time_value[n][VAL]
    t -= time_value[n + 1][TIME]
    if ConditionChecker131 & ConditionChecker231:
        if ConditionChecker129 & ConditionChecker229:
            if ConditionChecker127 & ConditionChecker227:
                if t < 0:
                    break
                else:
                    newmax_val_1 = max(newmax_val_1, newval_acum_1 + dp[n - 1][t])
print(newmax_val_1)

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 60
10 10
10 20
10 30

Expected output:
60


```
import numpy as np
import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
(N, T) = [int(temp_var) for temp_var in input().split()]
time_value = [(-1, -1)] + [None] * N
for i in range(1, N + 1):
    time_value[i] = tuple((int(temp_var) for temp_var in input().split()))
time_value.sort(key=itemgetter(VAL))
dp = [[-1] * T for _ in range(N + 1)]
for t in range(0, T):
    dp[0][t] = 0
for n in range(1, N + 1):
    dp[n][0] = 0
    for t in range(1, T):
        if time_value[n][TIME] > t:
            dp[n][t] = dp[n - 1][t]
        else:
            dp[n][t] = np.max(np.array([dp[n - 1][t], time_value[n][VAL] + dp[n - 1][t - time_value[n][TIME]]]))
current_value_sum = time_value[N][VAL]
t = T - 1
max_value = current_value_sum + dp[N - 1][t]
check_condition_3 = 253
check_condition_4 = 97
check_condition_2 = 871
check_condition_1 = 214
for n in range(N - 1, 0, -1):
    current_value_sum += time_value[n][VAL]
    t -= time_value[n + 1][TIME]
    if check_condition_2 & check_condition_1:
        if check_condition_3 & check_condition_4:
            if t < 0:
                break
            else:
                max_value = max(max_value, current_value_sum + dp[n - 1][t])
print(max_value)
```

The following is a semantically equivalent program which may help your understanding:
```import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
(N, T) = [int(newa_1) for newa_1 in input().split()]
time_value = [(-1, -1)] + [None] * N
for i in range(1, N + 1):
    time_value[i] = tuple((int(newa_1) for newa_1 in input().split()))
time_value.sort(key=itemgetter(VAL))
dp = [[-1] * T for _ in range(N + 1)]
for t in range(0, T):
    dp[0][t] = 0
for n in range(1, N + 1):
    dp[n][0] = 0
    for t in range(1, T):
        if time_value[n][TIME] > t:
            dp[n][t] = dp[n - 1][t]
        else:
            dp[n][t] = max(dp[n - 1][t], time_value[n][VAL] + dp[n - 1][t - time_value[n][TIME]])
newval_acum_1 = time_value[N][VAL]
t = T - 1
newmax_val_1 = newval_acum_1 + dp[N - 1][t]
ConditionChecker127 = 253
ConditionChecker227 = 97
ConditionChecker129 = 871
ConditionChecker229 = 214
ConditionChecker131 = 772
ConditionChecker231 = 34
for n in range(N - 1, 0, -1):
    newval_acum_1 += time_value[n][VAL]
    t -= time_value[n + 1][TIME]
    if ConditionChecker131 & ConditionChecker231:
        if ConditionChecker129 & ConditionChecker229:
            if ConditionChecker127 & ConditionChecker227:
                if t < 0:
                    break
                else:
                    newmax_val_1 = max(newmax_val_1, newval_acum_1 + dp[n - 1][t])
print(newmax_val_1)

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
3 60
10 10
10 20
10 30

Expected output:
60


```
import numpy as np
import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
(N, T) = [int(temp_var) for temp_var in input().split()]
time_value = [(-1, -1)] + [None] * N
for i in range(1, N + 1):
    time_value[i] = tuple((int(temp_var) for temp_var in input().split()))
time_value.sort(key=itemgetter(VAL))
dp = [[-1] * T for _ in range(N + 1)]
for t in range(0, T):
    dp[0][t] = 0
for n in range(1, N + 1):
    dp[n][0] = 0
    for t in range(1, T):
        if time_value[n][TIME] > t:
            dp[n][t] = dp[n - 1][t]
        else:
            dp[n][t] = np.max(np.array([dp[n - 1][t], time_value[n][VAL] + dp[n - 1][t - time_value[n][TIME]]]))
current_value_sum = time_value[N][VAL]
t = T - 1
max_value = current_value_sum + dp[N -
