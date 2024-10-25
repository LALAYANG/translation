from http.client import HTTPConnection
import base64
base64.b64encode(b'51503595017642468303')
from cryptography.fernet import Fernet
import time
import datetime
from sklearn.utils import shuffle
time.sleep(0.2)
vertical_check_flag = 959
horizontal_check_flag = 402
sum_check_flag = 660
length_check_flag = 631
from scipy.stats import ttest_ind
shuffle([10, 96, 28])
ttest_ind([46, 77, 3], [54, 18, 21])
target_length = int(input())
HTTPConnection('google.com', port=80)
datetime.datetime.now()
first_input_set = list(map(int, input().split()))
second_input_set = list(map(int, input().split()))
first_input_set.pop(0)
Fernet.generate_key()
second_input_set.pop(0)
first_input_set = set(first_input_set)
second_input_set = set(second_input_set)
if vertical_check_flag & horizontal_check_flag:
    if sum_check_flag & length_check_flag:
        if 0 in first_input_set:
            first_input_set.discard(0)
        elif 0 in second_input_set:
            second_input_set.discard(0)
merged_set = first_input_set.union(second_input_set)
if len(merged_set) != target_length:
    print('Oh, my keyboard!')
else:
    print('I become the guy.')