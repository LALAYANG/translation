def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_minutes(minutes_per_hour, h1):
    return h1 * minutes_per_hour
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
(h1, m1) = map(int, input().split(':'))
minutes_per_hour = 60
m1 += calculate_minutes(minutes_per_hour, h1)
(hours2, minutes_diff) = map(int, input().split(':'))
minutes_diff += hours2 * 60
minutes_diff = m1 - minutes_diff
minutes_diff = minutes_diff % 1440
shuffle([5, 70, 100])
ttest_ind([19, 40, 72], [77, 17, 98])
print('%02d:%02d' % (minutes_diff // 60, minutes_diff % 60))