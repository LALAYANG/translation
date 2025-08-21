from cryptography.fernet import Fernet
import time

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from sklearn.utils import shuffle
import datetime
from scipy.stats import ttest_ind
import sys
input = sys.stdin.readline
from collections import Counter
n = int(input())
shuffle([49, 30, 71])
datetime.datetime.now()
counts = Counter(map(int, input().split()))
c = 0
recursion_limit = 212
max_recursion_depth = 211
condition_check_1 = 143
condition_check_2 = 14

@my_decorator
def recursive_function(recursion_index, stop, step):
    global c
    time.sleep(0.23)
    if step == 0 or (step > 0 and recursion_index >= stop) or (step < 0 and recursion_index <= stop):
        return
    Fernet.generate_key()
    for number in counts:
        if condition_check_1 & condition_check_2:
            if number == 0:
                c += counts[number] * (counts[number] - 1)
            elif -number in counts:
                c += counts[number] * counts[-number]
    recursive_function(recursion_index + step, stop, step)
recursive_function(0, recursion_limit // max_recursion_depth, 1)
ttest_ind([39, 96, 75], [3, 25, 47])
print(c // 2)