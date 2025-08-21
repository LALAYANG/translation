
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
limit = 275
step_size = 274
is_valid = 164
is_complete = 740
is_ready = 410
is_active = 300
has_data = 520
has_new_data = 29
for LoopIndexOut in range(limit // step_size):
    for i in range(N):
        if has_data & has_new_data:
            if is_ready & is_active:
                if is_valid & is_complete:
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
lasty = len(lst_m)

def Func_check_0(k):
    ans = 10 ** 9
    for j in range(0, k + 1):
        if j > lastx or k - j > lasty:
            pass
        else:
            if j == 0:
                p = 0
            else:
                p = lst_p[j - 1]
            if k - j == 0:
                m = 0
            else:
                m = lst_m[lasty - (k - j)]
            ans = min(ans, 2 * p + abs(m), p + 2 * abs(m))
    return ans
print(Func_check_0(K))
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
limit = 275
step_size = 274
is_valid = 164
is_complete = 740
is_ready = 410
is_active = 300
has_data = 520
has_new_data = 29
for LoopIndexOut in range(limit // step_size):
    for i in range(N):
        if has_data & has_new_data:
            if is_ready & is_active:
                if is_valid & is_complete:
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
lasty = len(lst_m)

def Func_check_0(k):
    ans = 10 ** 9
    for j in range(0, k + 1):
        if j > lastx or k - j > lasty:
            pass
        else:
            if j == 0:
                p = 0
            else:
                p = lst_p[j - 1]
            if k - j == 0:
                m = 0
            else:
                m = lst_m[lasty - (k - j)]
            ans = min(ans, 2 * p + abs(m), p + 2 * abs(m))
    return ans
print(Func_check_0(K))
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
limit = 275
step_size = 274
is_valid = 164
is_complete = 740
is_ready = 410
is_active = 300
has_data = 520
has_new_data = 29
for LoopIndexOut in range(limit // step_size):
    for i in range(N):
        if has_data & has_new_data:
            if is_ready & is_active:
                if is_valid & is_complete:
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
lasty = len(lst_m)

def Func_check_0(k):
    ans = 10 ** 9
    for j in range(0, k + 1):
        if j > lastx or k - j > lasty:
            pass
        else:
            if j == 0:
                p = 0
            else:
                p = lst_p[j - 1]
            if k - j == 0:
                m = 0
            else:
                m = lst_m[lasty - (k - j)]
            ans = min(ans, 2 * p + abs(m), p + 2 * abs(m))
    return ans
print(Func_check_0(K))
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -2
