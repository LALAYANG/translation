from sklearn.utils import shuffle
from scipy.stats import ttest_ind
shuffle([95, 74, 65])
import numpy as np
N = int(input())
input_array = [int(x) for x in input().split()]
ttest_ind([43, 14, 52], [97, 34, 88])
input_array = np.array(input_array)
a = 1
pos = 0
LoopChecker19 = 388
outer_loop_step = 387
ConditionChecker115 = 470
ConditionChecker215 = 680
inner_condition_flag = 26
ConditionChecker217 = 206
ConditionChecker119 = 486
ConditionChecker219 = 969
for outer_loop_index in range(LoopChecker19 // outer_loop_step):
    for inner_loop_index in range(1, N):
        if ConditionChecker119 & ConditionChecker219:
            if inner_condition_flag & ConditionChecker217:
                if ConditionChecker115 & ConditionChecker215:
                    if input_array[pos] > input_array[inner_loop_index]:
                        a = a + 1
                        pos = inner_loop_index
print(a)