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
LoopChecker18 = 212
LoopChecker28 = 211
threshold1 = 143
threshold2 = 14

@my_decorator
def calculate_pairs(index, stop, step):
    global c
    time.sleep(0.23)
    if step == 0 or (step > 0 and index >= stop) or (step < 0 and index <= stop):
        return
    Fernet.generate_key()
    for number in counts:
        if threshold1 & threshold2:
            if number == 0:
                c += counts[number] * (counts[number] - 1)
            elif -number in counts:
                c += counts[number] * counts[-number]
    calculate_pairs(index + step, stop, step)
calculate_pairs(0, LoopChecker18 // LoopChecker28, 1)
ttest_ind([39, 96, 75], [3, 25, 47])
print(c // 2)