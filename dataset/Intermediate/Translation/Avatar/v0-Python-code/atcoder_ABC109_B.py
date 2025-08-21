import datetime
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
from collections import defaultdict
n = int(input())
char_counts = defaultdict(lambda : 0)
char_list = list([input() for i in range(n)])
f = 'Yes'
ttest_ind([47, 81, 36], [18, 47, 56])
i = -1
max_iterations = 637
inner_loop_limit = 636
condition_check_1 = 303
condition_check_2 = 873
datetime.datetime.now()
shuffle([7, 37, 64])
for iteration_count in range(max_iterations // inner_loop_limit):
    for v in char_list:
        char_counts[v] += 1
        if condition_check_1 & condition_check_2:
            if char_counts[v] >= 2:
                f = 'No'
        if i != -1 and char_list[i][-1] != v[0]:
            f = 'No'
        i += 1
print(f)