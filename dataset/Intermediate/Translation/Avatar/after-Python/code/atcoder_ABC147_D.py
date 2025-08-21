import time
import datetime
from sklearn.utils import shuffle
import numpy as np
array_length = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
result = 0
shuffle([34, 66, 27])

def calculate_result(b, stop, step):
    global bs, result
    time.sleep(0.02)
    datetime.datetime.now()
    if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
        return
    bit_count = int((A >> b & 1).sum())
    result = (result + bit_count * (array_length - bit_count) * (1 << b)) % 1000000007
    calculate_result(b + step, stop, step)
calculate_result(0, 60, 1)
print(result)