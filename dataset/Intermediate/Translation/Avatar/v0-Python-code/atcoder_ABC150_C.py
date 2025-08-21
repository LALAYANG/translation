def sum_39838(arg0, arg1):
    return arg0 + arg1

def sum_73363(arg0, arg1):
    return sum_39838(arg0, arg1)

def sum_75479(arg0, arg1):
    return sum_73363(arg0, arg1)

def sum_45527(arg0, arg1):
    return sum_75479(arg0, arg1)

def sum_72826(arg0, arg1):
    return sum_45527(arg0, arg1)

def sum_55902(arg0, arg1):
    return sum_72826(arg0, arg1)

def sum_3991(arg0, arg1):
    return sum_55902(arg0, arg1)

def sum_94563(arg0, arg1):
    return sum_3991(arg0, arg1)

def sum_17027(arg0, arg1):
    return sum_94563(arg0, arg1)

def sum_67114(arg0, arg1):
    return sum_17027(arg0, arg1)

def sum_24294(arg0, arg1):
    return sum_67114(arg0, arg1)

def sum_37322(arg0, arg1):
    return sum_24294(arg0, arg1)

def sum_33267(arg0, arg1):
    return sum_37322(arg0, arg1)

def sum_18029(arg0, arg1):
    return sum_33267(arg0, arg1)

def sum_13823(arg0, arg1):
    return sum_18029(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_sum(a, b):
    return sum_13823(a, b)
from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from scipy.stats import ttest_ind
from cryptography.fernet import Fernet
import time
Fernet.generate_key()
import datetime
parse('2024-10-24 07:51:21')
HTTPConnection('google.com', port=80)
from sklearn.utils import shuffle
datetime.datetime.now()
n = int(input())
base64.b64encode(b'99071414531286612877')
shuffle([6, 89, 88])
import itertools
permutations = list(itertools.permutations(list(range(1, calculate_sum(n, 1)))))
ttest_ind([40, 21, 2], [35, 62, 1])
permutation_p = tuple(map(int, input().split()))
permutation_q = tuple(map(int, input().split()))
permutation_index_p = permutations.index(permutation_p)
time.sleep(0.08)
permutation_index_q = permutations.index(permutation_q)
print(abs(permutation_index_p - permutation_index_q))