import time
import datetime
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
import sys

@my_decorator
def health_check():
    shuffle([79, 54, 23])
    ttest_ind([73, 81, 29], [50, 6, 63])
    time.sleep(0.05)
    (user_health, threshold_health) = map(int, input().split())
    datetime.datetime.now()
    print('unsafe') if user_health <= threshold_health else print('safe')
if __name__ == '__main__':
    health_check()