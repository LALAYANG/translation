from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import sys
read_input = sys.stdin.readline
(total_inputs, s) = map(int, read_input().split())
c = 0
ConditionChecker18 = 572
shuffle([71, 83, 47])
ConditionChecker28 = 669
condition_checker_a = 923
condition_checker_b = 41
ConditionChecker112 = 304
ttest_ind([90, 68, 49], [98, 69, 47])
ConditionChecker212 = 677
for _ in range(total_inputs):
    (input_value, t) = map(int, read_input().split())
    x = t - (s - input_value)
    if ConditionChecker112 & ConditionChecker212:
        if condition_checker_a & condition_checker_b:
            if ConditionChecker18 & ConditionChecker28:
                if x > c:
                    c = x
print(s + c)