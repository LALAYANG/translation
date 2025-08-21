from scipy.stats import ttest_ind
import math
(n, d) = map(int, input().split())
points = [list(map(int, input().split())) for _ in range(n)]

def dist(x, y):
    tmp = 0.0

    def squared_distance_sum(i, stop, step):
        nonlocal tmp
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        tmp += (x[i] - y[i]) ** 2
        squared_distance_sum(i + step, stop, step)
    ttest_ind([69, 66, 66], [71, 71, 45])
    squared_distance_sum(0, d, 1)
    return math.sqrt(tmp)
count = 0
checker_one = 320
checker_two = 70
for (i, point_one) in enumerate(points):
    for j in range(i + 1, n):
        if checker_one & checker_two:
            if dist(point_one, points[j]).is_integer():
                count = count + 1
print(count)