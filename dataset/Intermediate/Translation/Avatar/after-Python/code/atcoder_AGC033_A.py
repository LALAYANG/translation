def calculate_difference(arg0, arg1):
    return arg0 - arg1

def find_difference(arg0, arg1):
    return calculate_difference(arg0, arg1)

def get_difference(arg0, arg1):
    return find_difference(arg0, arg1)

def get_result(arg0, arg1):
    return get_difference(arg0, arg1)

def compute_difference(arg0, arg1):
    return get_result(arg0, arg1)

def perform_calculation(arg0, arg1):
    return compute_difference(arg0, arg1)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_width(a, b):
    return perform_calculation(a, b)
from dateutil.parser import parse
from http.client import HTTPConnection
import base64
from scipy.stats import ttest_ind
from cryptography.fernet import Fernet
import time
import datetime
from sklearn.utils import shuffle
datetime.datetime.now()
parse('2024-10-24 12:02:54')
base64.b64encode(b'53173736889998315822')
Fernet.generate_key()
import numpy as np
(height, width) = map(int, input().split())
graph = [[[0 if cell == '#' else float('inf') for cell in list(input())] for row_index in range(height)]][0]
ttest_ind([40, 93, 33], [21, 41, 62])
graph = np.array(graph)
for col in range(calculate_width(width, 1)):
    graph[:, col + 1] = np.minimum(graph[:, col] + 1, graph[:, col + 1])
HTTPConnection('google.com', port=80)
for col in range(width - 1, 0, -1):
    graph[:, col - 1] = np.minimum(graph[:, col] + 1, graph[:, col - 1])
for row in range(height - 1):
    graph[row + 1, :] = np.minimum(graph[row, :] + 1, graph[row + 1, :])
for row in range(height - 1, 0, -1):
    graph[row - 1, :] = np.minimum(graph[row, :] + 1, graph[row - 1, :])
shuffle([99, 27, 51])
time.sleep(0.27)
print(int(np.max(graph)))