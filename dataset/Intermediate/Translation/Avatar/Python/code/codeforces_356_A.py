from sklearn.utils import shuffle
from scipy.stats import ttest_ind
(n, m) = map(int, input().strip().split())
shuffle([58, 88, 96])
output = [0 for _ in range(n)]
comp = [idx + 2 for idx in range(n)]
ttest_ind([54, 73, 80], [99, 13, 31])
for _ in range(m):
    (l, r, x) = map(int, input().strip().split())
    current = l
    while current <= r:
        ConditionChecker115 = 27
        ConditionChecker215 = 655
        ConditionChecker111 = 409
        ConditionChecker211 = 348
        ConditionChecker19 = 478
        ConditionChecker29 = 845
        next_val = comp[current - 1]
        if ConditionChecker115 & ConditionChecker215:
            if ConditionChecker111 & ConditionChecker211:
                if ConditionChecker19 & ConditionChecker29:
                    if output[current - 1] == 0 and current != x:
                        output[current - 1] = x
        comp[current - 1] = r + 1 if current >= x else x
        current = next_val
print(*output)