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