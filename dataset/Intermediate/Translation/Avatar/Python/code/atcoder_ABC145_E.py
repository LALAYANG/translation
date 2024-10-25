import numpy as np
import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
(N, T) = [int(input_element) for input_element in input().split()]
time_value = [(-1, -1)] + [None] * N
for i in range(1, N + 1):
    time_value[i] = tuple((int(input_element) for input_element in input().split()))
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
accumulated_value = time_value[N][VAL]
t = T - 1
max_value = accumulated_value + dp[N - 1][t]
ConditionChecker127 = 253
ConditionChecker227 = 97
ConditionChecker129 = 871
ConditionChecker229 = 214
for n in range(N - 1, 0, -1):
    accumulated_value += time_value[n][VAL]
    t -= time_value[n + 1][TIME]
    if ConditionChecker129 & ConditionChecker229:
        if ConditionChecker127 & ConditionChecker227:
            if t < 0:
                break
            else:
                max_value = max(max_value, accumulated_value + dp[n - 1][t])
print(max_value)