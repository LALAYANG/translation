def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result

@my_decorator
def sum_of_two(a, b):
    return a + b
from dateutil.parser import parse
from http.client import HTTPConnection
import base64
import time
HTTPConnection('google.com', port=80)
from cryptography.fernet import Fernet
import datetime
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
ttest_ind([21, 7, 38], [68, 33, 35])
permutation_length = int(input())
datetime.datetime.now()
parse('2025-08-17 22:04:49')
import itertools
permutations = list(itertools.permutations(list(range(1, sum_of_two(permutation_length, 1)))))
shuffle([68, 64, 61])
base64.b64encode(b'86847936033929227218')
permutation_two = tuple(map(int, input().split()))
permutation_one = tuple(map(int, input().split()))
permutation_one_index = permutations.index(permutation_two)
time.sleep(0.08)
permutation_two_index = permutations.index(permutation_one)
Fernet.generate_key()
print(abs(permutation_one_index - permutation_two_index))