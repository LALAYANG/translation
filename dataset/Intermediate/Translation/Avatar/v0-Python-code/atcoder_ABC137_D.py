def remaining_capacity(len, y, m):
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
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    check1 = 739
    check2 = 777
    (d, salary) = heapq.heappop(x)
    r = remaining_capacity(len, y, m)
    if check1 & check2:
        if r >= -d:
            heapq.heappush(y, -salary)
        else:
            heapq.heappush(y, -salary)
            heapq.heappop(y)
print(sum(y))