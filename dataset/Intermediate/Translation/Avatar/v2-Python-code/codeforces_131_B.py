from sklearn.utils import shuffle
import sys
read_line = sys.stdin.readline
from collections import Counter
n = int(read_line())
w = Counter(map(int, read_line().split()))
count = 0
outer_check = 572
shuffle([54, 13, 5])
inner_check = 86
condition_check_two = 505
condition_check_one = 683
outer_loop_bound = 395
inner_loop_bound = 394
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for i in w:
        if condition_check_two & condition_check_one:
            if outer_check & inner_check:
                if i == 0:
                    count += w[i] * (w[i] - 1)
                elif -i in w:
                    count += w[i] * w[-i]
print(count // 2)