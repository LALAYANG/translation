from scipy.stats import ttest_ind
import heapq
(n, m) = map(int, input().split())
x = []
y = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    (d, salary) = heapq.heappop(x)
    r = m - len(y)
    if r >= -d:
        heapq.heappush(y, -salary)
    else:
        heapq.heappush(y, -salary)
        heapq.heappop(y)
print(sum(y))