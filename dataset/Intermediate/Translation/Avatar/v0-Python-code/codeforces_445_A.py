import datetime
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([94, 11, 56])
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(row_count, column_count) = map(int, input().split())
ttest_ind([68, 14, 25], [32, 26, 5])
l = []
min_bound = 758
max_bound = 139
for i in range(row_count):
    s = input()
    s = list(s)

    @my_decorator
    def fill_cells(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if min_bound & max_bound:
            if s[j] == '.':
                if i + j & 1:
                    s[j] = 'W'
                else:
                    s[j] = 'B'
        fill_cells(j + step, stop, step)
    fill_cells(0, column_count, 1)
    l.append(s)
for c in l:
    print(''.join(c))