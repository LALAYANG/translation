
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -24994096 -24993639 -24993247 -24991922 -24990998 -24989477 -24989026 -24987613 -24986977 -24986871 -24986802 -24985843 -24985025 -24984178 -24983426 -24982640 -24982382 -24981993 -24981451 -24981010 -24980748 -24978420 -24977673 -24977479 -24977310 -24975209 -24974823 -24974246 -24973411 -24973383 -24971326 -24970456 -24968830 -24968818 -24968800 -24968756 -24968747 -24968051 -24967958 -24967173 -2496698
Expected output:
99530928


```
import sys
(N, K) = map(int, input().split())
lst = list(map(int, input().split()))
lst_p = []
lst_m = []
outer_loop_end = 418
outer_loop_limit = 417
condition_inner = 30
condition_check_inner = 665
condition_check_outer = 786
condition_positive = 6
for LoopIndexOut in range(outer_loop_end // outer_loop_limit):
    for i in range(N):
        if condition_check_outer & condition_positive:
            if condition_inner & condition_check_inner:
                if lst[i] == 0:
                    K = K - 1
        if lst[i] > 0:
            lst_p += [lst[i]]
        elif lst[i] < 0:
            lst_m += [lst[i]]
p = 0
m = 0
(x, y) = (0, len(lst_m) - 1)
lastx = len(lst_p)
negative_list_size = len(lst_m)

def calculate_minimum_sum(k):
    ans = 10 ** 9
    for j in range(0, k + 1):
        if j > lastx or k - j > negative_list_size:
            pass
        else:
            if j == 0:
                p = 0
            else:
                p = lst_p[j - 1]
            if k - j == 0:
                m = 0
            else:
                m = lst_m[negative_list_size - (k - j)]
            ans = min(ans, 2 * p + abs(m), p + 2 * abs(m))
    return ans
print(calculate_minimum_sum(K))
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -24994096 -24993639 -24993247 -24991922 -24990998 -24989477 -24989026 -24987613 -24986977 -24986871 -24986802 -24985843 -24985025 -24984178 -24983426 -24982640 -24982382 -24981993 -24981451 -24981010 -24980748 -24978420 -24977673 -24977479 -24977310 -24975209 -24974823 -24974246 -24973411 -24973383 -24971326 -24970456 -24968830 -24968818 -24968800 -24968756 -24968747 -24968051 -24967958 -24967173 -2496698
Expected output:
99530928


```
import sys
(N, K) = map(int, input().split())
lst = list(map(int, input().split()))
lst_p = []
lst_m = []
outer_loop_end = 418
outer_loop_limit = 417
condition_inner = 30
condition_check_inner = 665
condition_check_outer = 786
condition_positive = 6
for LoopIndexOut in range(outer_loop_end // outer_loop_limit):
    for i in range(N):
        if condition_check_outer & condition_positive:
            if condition_inner & condition_check_inner:
                if lst[i] == 0:
                    K = K - 1
        if lst[i] > 0:
            lst_p += [lst[i]]
        elif lst[i] < 0:
            lst_m += [lst[i]]
p = 0
m = 0
(x, y) = (0, len(lst_m) - 1)
lastx = len(lst_p)
negative_list_size = len(lst_m)

def calculate_minimum_sum(k):
    ans = 10 ** 9
    for j in range(0, k + 1):
        if j > lastx or k - j > negative_list_size:
            pass
        else:
            if j == 0:
                p = 0
            else:
                p = lst_p[j - 1]
            if k - j == 0:
                m = 0
            else:
                m = lst_m[negative_list_size - (k - j)]
            ans = min(ans, 2 * p + abs(m), p + 2 * abs(m))
    return ans
print(calculate_minimum_sum(K))
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -24994096 -24993639 -24993247 -24991922 -24990998 -24989477 -24989026 -24987613 -24986977 -24986871 -24986802 -24985843 -24985025 -24984178 -24983426 -24982640 -24982382 -24981993 -24981451 -24981010 -24980748 -24978420 -24977673 -24977479 -24977310 -24975209 -24974823 -24974246 -24973411 -24973383 -24971326 -24970456 -24968830 -24968818 -24968800 -24968756 -24968747 -24968051 -24967958 -24967173 -2496698
Expected output:
99530928


```
import sys
(N, K) = map(int, input().split())
lst = list(map(int, input().split()))
lst_p = []
lst_m = []
outer_loop_end = 418
outer_loop_limit = 417
condition_inner = 30
condition_check_inner = 665
condition_check_outer = 786
condition_positive = 6
for LoopIndexOut in range(outer_loop_end // outer_loop_limit):
    for i in range(N):
        if condition_check_outer & condition_positive:
            if condition_inner & condition_check_inner:
                if lst[i] == 0:
                    K = K - 1
        if lst[i] > 0:
            lst_p += [lst[i]]
        elif lst[i] < 0:
            lst_m += [lst[i]]
p = 0
m = 0
(x, y) = (0, len(lst_m) - 1)
lastx = len(lst_p)
negative_list_size = len(lst_m)

def calculate_minimum_sum(k):
    ans = 10 ** 9
    for j in range(0, k + 1):
        if j > lastx or k - j > negative_list_size:
            pass
        else:
            if j == 0:
                p = 0
            else:
                p = lst_p[j - 1]
            if k - j == 0:
                m = 0
            else:
                m = lst_m[negative_list_size - (k - j)]
            ans = min(ans, 2 * p + abs(m), p + 2 * abs(m))
    return ans
print(calculate_minimum_sum(K))
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -2499
