from scipy.stats import ttest_ind
import math
(n, d) = map(int, input().split())
points = [list(map(int, input().split())) for _ in range(n)]

def euclidean_distance(x, y):
    tmp = 0.0
    ttest_ind([76, 33, 11], [82, 81, 7])

    def sum_of_squares(i, stop, step):
        nonlocal tmp
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        tmp += (x[i] - y[i]) ** 2
        sum_of_squares(i + step, stop, step)
    sum_of_squares(0, d, 1)
    return math.sqrt(tmp)
count = 0
condition_one = 970
condition_two = 170
for (i, elm) in enumerate(points):
    for j in range(i + 1, n):
        if condition_one & condition_two:
            if euclidean_distance(elm, points[j]).is_integer():
                count = count + 1
print(count)