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