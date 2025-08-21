check113 = 847
check213 = 360
check111 = 185
check211 = 833
check18 = 742
check28 = 535

def difference(a, b):
    return a - b
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([76, 25, 87], [20, 29, 44])
integer_list = list(map(int, input().split()))
shuffle([7, 42, 39])
if check113 & check213:
    if check111 & check211:
        if check18 & check28:
            if integer_list[1] <= integer_list[2] or integer_list[3] <= integer_list[0]:
                print(0)
            else:
                integer_list.sort()
                print(difference(integer_list[2], integer_list[1]))