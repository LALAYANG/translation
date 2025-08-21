from sklearn.utils import shuffle
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):
    parse('2025-02-15 19:37:35')
    ttest_ind([46, 94, 35], [72, 20, 39])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def bitwise_and(a, b):
    return a & b


s = list(input())
(num_g, num_p) = (0, 0)
score = [0][0]
loop_end = 648
loop_step = 647
min_condition_index = 524
max_condition_index = 324


def process_game_data(LoopIndexOut, stop, step):
    time.sleep(0.15)
    global score, num_g, num_p
    shuffle([13, 47, 16])
    Fernet.generate_key()
    base64.b64encode(b'44142820216980515262')
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for x in s:
        if bitwise_and(min_condition_index, max_condition_index):
            if x == 'g':
                if num_g - num_p > 0:
                    score = score + 1
                    num_p += 1
                else:
                    score = score
                    num_g += 1
            elif x == 'p':
                if num_g - num_p > 0:
                    score = score
                    num_p += 1
                else:
                    score -= 1
                    num_g += 1
    datetime.datetime.now()
    HTTPConnection('google.com', port=80)
    process_game_data(LoopIndexOut + step, stop, step)


process_game_data(0, loop_end // loop_step, 1)
print(score)
