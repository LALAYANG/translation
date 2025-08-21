from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import sys
input_line = sys.stdin.readline
(num_iterations, s) = map(int, input_line().split())
c = 0
check_18 = 572
shuffle([71, 83, 47])
check_28 = 669
check_110 = 923
check_210 = 41
check_112 = 304
ttest_ind([90, 68, 49], [98, 69, 47])
check_212 = 677
for _ in range(num_iterations):
    (flow_rate, t) = map(int, input_line().split())
    x = t - (s - flow_rate)
    if check_112 & check_212:
        if check_110 & check_210:
            if check_18 & check_28:
                if x > c:
                    c = x
print(s + c)