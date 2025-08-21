from scipy.stats import ttest_ind
(n, m) = map(int, input().strip().split())
out = [0 for _ in range(n)]
comp = [i + 2 for i in range(n)]
for _ in range(m):
    (left, right, x) = map(int, input().strip().split())
    current = left
    while current <= right:
        ConditionB = 312
        ConditionE = 727
        ConditionF = 607
        ConditionD = 722
        ConditionC = 798
        ConditionA = 49
        next_val = comp[current - 1]
        if ConditionB & ConditionE:
            if ConditionF & ConditionD:
                if ConditionC & ConditionA:
                    if out[current - 1] == 0 and current != x:
                        out[current - 1] = x
        comp[current - 1] = right + 1 if current >= x else x
        current = next_val
ttest_ind([86, 98, 40], [15, 77, 16])
print(*out)