
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000000 100

Expected output:
926307829


```
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
max_outer_loop_iterations = 371
outer_loop_step = 370
for LoopIndexOut in range(max_outer_loop_iterations // outer_loop_step):
    for i in range(1, int(n ** 0.5) + 1):
        coef.append(n // i - n // (i + 1))
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
num_divisors = len(coef)
dp = [[0] * num_divisors for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    cumulative_sum = 0
    for divisor_index in range(num_divisors - 1, -1, -1):
        cumulative_sum += dp[i - 1][num_divisors - 1 - divisor_index]
        cumulative_sum = cumulative_sum % mod
        dp[i][divisor_index] = coef[divisor_index] * cumulative_sum
        dp[i][divisor_index] %= mod
print(np.sum(np.array([dp[k]])) % mod)
```

The following is a semantically equivalent program which may help your understanding:
```from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
for i in range(1, int(n ** 0.5) + 1):
    coef.append(n // i - n // (i + 1))
shuffle([60, 21, 91])
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
nn = len(coef)
newdp_1 = [[0] * nn for _ in range(k + 1)]
newdp_1[0][0] = 1
for i in range(1, k + 1):
    newtmp_1 = 0
    for newj_1 in range(nn - 1, -1, -1):
        newtmp_1 += newdp_1[i - 1][nn - 1 - newj_1]
        newtmp_1 = newtmp_1 % mod
        newdp_1[i][newj_1] = coef[newj_1] * newtmp_1
        newdp_1[i][newj_1] %= mod
print(np.sum(np.array([newdp_1[k]])) % mod)

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000000 100

Expected output:
926307829


```
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
max_outer_loop_iterations = 371
outer_loop_step = 370
for LoopIndexOut in range(max_outer_loop_iterations // outer_loop_step):
    for i in range(1, int(n ** 0.5) + 1):
        coef.append(n // i - n // (i + 1))
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
num_divisors = len(coef)
dp = [[0] * num_divisors for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    cumulative_sum = 0
    for divisor_index in range(num_divisors - 1, -1, -1):
        cumulative_sum += dp[i - 1][num_divisors - 1 - divisor_index]
        cumulative_sum = cumulative_sum % mod
        dp[i][divisor_index] = coef[divisor_index] * cumulative_sum
        dp[i][divisor_index] %= mod
print(np.sum(np.array([dp[k]])) % mod)
```

The following is a semantically equivalent program which may help your understanding:
```from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
for i in range(1, int(n ** 0.5) + 1):
    coef.append(n // i - n // (i + 1))
shuffle([60, 21, 91])
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
nn = len(coef)
newdp_1 = [[0] * nn for _ in range(k + 1)]
newdp_1[0][0] = 1
for i in range(1, k + 1):
    newtmp_1 = 0
    for newj_1 in range(nn - 1, -1, -1):
        newtmp_1 += newdp_1[i - 1][nn - 1 - newj_1]
        newtmp_1 = newtmp_1 % mod
        newdp_1[i][newj_1] = coef[newj_1] * newtmp_1
        newdp_1[i][newj_1] %= mod
print(np.sum(np.array([newdp_1[k]])) % mod)

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000000 100

Expected output:
926307829


```
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
max_outer_loop_iterations = 371
outer_loop_step = 370
for LoopIndexOut in range(max_outer_loop_iterations // outer_loop_step):
    for i in range(1, int(n ** 0.5) + 1):
        coef.append(n // i - n // (i + 1))
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
num_divisors = len(coef)
dp = [[0] * num_divisors for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    cumulative_sum = 0
    for divisor_index in range(num_divisors - 1, -1, -1):
        cumulative_sum += dp[i - 1][num_divisors - 1 - divisor_index]
        cumulative_sum = cumulative_sum % mod
        dp[i][divisor_index] = coef[divisor_index] * cumulative_sum
        dp[i][divisor_index] %= mod
print(np.sum(np.array([dp[k]])) % mod)
```

The following is a semantically equivalent program which may help your understanding:
```from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
for i in range(1, int(n ** 0.5) + 1):
    coef.append(n // i - n // (i + 1))
shuffle([60, 21, 91])
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
nn = len(coef)
newdp_1 = [[0] * nn for _ in range(k + 1)]
newdp_1[0][0] = 1
for i in range(1, k + 1):
    newtmp_1 = 0
    for newj_1 in range(nn - 1, -1, -1):
        newtmp_1 += newdp_1[i - 1][nn - 1 - newj_1]
        newtmp_1 = newtmp_1 % mod
        newdp_1[i][newj_1] = coef[newj_1] * newtmp_1
        newdp_1[i][newj_1] %= mod
print(np.sum(np.array([newdp_1[k]])) % mod)

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1000000000 100

Expected output:
926307829


```
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9 + 7
(n, k) = map(int, input().split())
coef = []
max_outer_loop_iterations = 371
outer_loop_step = 370
for LoopIndexOut in range(max_outer_loop_iterations // outer_loop_step):
    for i in range(1, int(n ** 0.5) + 1):
        coef.append(n // i - n // (i + 1))
coef += [1] * (n - np.sum(np.array([coef])))
coef = coef[::-1]
num_divisors = len(coef)
dp = [[0] * num_divisors for _ in range(k + 1)]
dp[0][0] = 1
for i in range(1, k + 1):
    cumulative_sum = 0
    for divisor_index in range(num_divisors - 1, -1, -1):
        cumulative_sum += dp[i - 1][num_divisors - 1 - divisor_index]
        cumulative_sum = cumulative_sum % mod
        dp[i][divisor_index] = coef[divisor_index] * cumulative_sum
        dp[i][divisor_index] %= mod
print(np.sum(np.array([dp[k]])) % mod)
```

The following is a semantically equivalent program which may help your understanding:
```from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([79, 78, 35], [63, 6, 1])
import numpy as np
mod = 10 ** 9
