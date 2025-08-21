def add_inputs(arg0, arg1):
    return arg0 + arg1

def sum_values(arg0, arg1):
    return add_inputs(arg0, arg1)

def calculate_total(arg0, arg1):
    return sum_values(arg0, arg1)

def get_sum(arg0, arg1):
    return calculate_total(arg0, arg1)

def compute_sum(arg0, arg1):
    return get_sum(arg0, arg1)

def determine_sum(arg0, arg1):
    return compute_sum(arg0, arg1)

def find_sum(arg0, arg1):
    return determine_sum(arg0, arg1)

def return_sum(arg0, arg1):
    return find_sum(arg0, arg1)

def provide_sum(arg0, arg1):
    return return_sum(arg0, arg1)

def yield_sum(arg0, arg1):
    return provide_sum(arg0, arg1)

def generate_sum(arg0, arg1):
    return yield_sum(arg0, arg1)

def obtain_sum(arg0, arg1):
    return generate_sum(arg0, arg1)

def acquire_sum(arg0, arg1):
    return obtain_sum(arg0, arg1)

def fetch_sum(arg0, arg1):
    return acquire_sum(arg0, arg1)

def evaluate_sum(arg0, arg1):
    return fetch_sum(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_result(a, b):
    return evaluate_sum(a, b)
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
input_length = int(input())
base64.b64encode(b'99071414531286612877')
shuffle([6, 89, 88])
import itertools
permutations = list(itertools.permutations(list(range(1, calculate_result(input_length, 1)))))
ttest_ind([40, 21, 2], [35, 62, 1])
first_tuple = tuple(map(int, input().split()))
second_tuple = tuple(map(int, input().split()))
first_index = permutations.index(first_tuple)
time.sleep(0.08)
second_index = permutations.index(second_tuple)
print(abs(first_index - second_index))