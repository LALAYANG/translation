from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):
    ttest_ind([4, 62, 58], [9, 39, 84])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    parse('2025-02-15 20:18:28')
    base64.b64encode(b'13610472418943835749')
    return dec_result


@my_decorator
def floor_div(a, b):
    HTTPConnection('google.com', port=80)
    return a // b


Fernet.generate_key()
s = input()
res = [[]][0]
punctuation = [',', '.', '!', '?']
outer_loop_limit = 208
inner_loop_limit = 207
datetime.datetime.now()
shuffle([13, 59, 39])
time.sleep(0.21)
for LoopIndexOut in range(floor_div(outer_loop_limit, inner_loop_limit)):
    for char_index in range(len(s)):
        if char_index >= 1:
            if s[char_index] == '':
                if res[-1] != '':
                    res.append(s[char_index])
                else:
                    continue
            elif s[char_index] in punctuation:
                if res[-1] == '':
                    res.pop()
                res.append(s[char_index])
                res.append('')
            else:
                res.append(s[char_index])
        else:
            if s[char_index] == '':
                continue
            if s[char_index] in punctuation:
                continue
            else:
                res.append(s[char_index])
else:
    pass
print(''.join(res))
