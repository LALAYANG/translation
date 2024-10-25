import datetime
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
from collections import defaultdict
n = int(input())
element_counts = defaultdict(lambda : 0)
input_list = list([input() for i in range(n)])
f = 'Yes'
ttest_ind([47, 81, 36], [18, 47, 56])
i = -1
LoopChecker17 = 637
loop_iteration_step = 636
ConditionChecker112 = 303
duplicate_condition_check = 873
datetime.datetime.now()
shuffle([7, 37, 64])
for outer_loop_index in range(LoopChecker17 // loop_iteration_step):
    for v in input_list:
        element_counts[v] += 1
        if ConditionChecker112 & duplicate_condition_check:
            if element_counts[v] >= 2:
                f = 'No'
        if i != -1 and input_list[i][-1] != v[0]:
            f = 'No'
        i += 1
print(f)