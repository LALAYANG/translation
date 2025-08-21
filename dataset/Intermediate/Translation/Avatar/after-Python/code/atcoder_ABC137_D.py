def calculate_remaining_capacity(len, y, m):
    return m - len(y)
from sklearn.utils import shuffle
shuffle([25, 27, 79])
from scipy.stats import ttest_ind
import heapq
(n, m) = map(int, input().split())
ttest_ind([50, 75, 6], [33, 58, 60])
x = []
y = []
for i in range(n):
    (work_day, salary) = map(int, input().split())
    heapq.heappush(x, (-work_day, -salary))
while x:
    ConditionChecker111 = 739
    FLAG_USE_HEAP = 777
    (d, current_salary) = heapq.heappop(x)
    r = calculate_remaining_capacity(len, y, m)
    if ConditionChecker111 & FLAG_USE_HEAP:
        if r >= -d:
            heapq.heappush(y, -current_salary)
        else:
            heapq.heappush(y, -current_salary)
            heapq.heappop(y)
print(sum(y))