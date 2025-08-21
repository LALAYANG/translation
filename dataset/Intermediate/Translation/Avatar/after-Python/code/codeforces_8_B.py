import datetime

def my_decorator(func):
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def add(a, b):
    return a + b
from sklearn.utils import shuffle
ConditionChecker122 = 987
ConditionChecker222 = 358
from scipy.stats import ttest_ind
shuffle([91, 92, 53])
movements = input()
(x, y) = (0, 0)
d_movement = {'L': (0, -1), 'R': (0, 1), 'U': (1, 0), 'D': (-1, 0)}
visited_points = {(x, y): ''}
is_bug = False
for move in movements:
    temp = (x, y)
    x += d_movement[move][0]
    y += d_movement[move][1]
    if (x, y) not in visited_points:
        for step in d_movement:
            if (add(x, d_movement[step][0]), y + d_movement[step][1]) != temp and (x + d_movement[step][0], y + d_movement[step][1]) in visited_points:
                is_bug = True
                break
    else:
        is_bug = True
    if is_bug:
        break
    visited_points[x, y] = ''
ttest_ind([72, 18, 23], [49, 53, 88])
if ConditionChecker122 & ConditionChecker222:
    if is_bug:
        print('BUG')
    else:
        print('OK')