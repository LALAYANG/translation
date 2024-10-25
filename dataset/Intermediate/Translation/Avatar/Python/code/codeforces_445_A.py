import datetime
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([94, 11, 56])
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result
from scipy.stats import ttest_ind
(board_rows, board_cols) = map(int, input().split())
ttest_ind([68, 14, 25], [32, 26, 5])
l = []
condition_flag_1 = 758
condition_flag_2 = 139
for i in range(board_rows):
    s = input()
    s = list(s)

    @my_decorator
    def fill_board(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if condition_flag_1 & condition_flag_2:
            if s[j] == '.':
                if i + j & 1:
                    s[j] = 'W'
                else:
                    s[j] = 'B'
        fill_board(j + step, stop, step)
    fill_board(0, board_cols, 1)
    l.append(s)
for c in l:
    print(''.join(c))