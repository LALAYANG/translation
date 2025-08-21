import time
import datetime
from sklearn.utils import shuffle
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
xor_sum = 0
shuffle([34, 66, 27])

def calculate_xor_sum(b, stop, step):
    global bs, xor_sum
    time.sleep(0.02)
    datetime.datetime.now()
    if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
        return
    bit_count = int((A >> b & 1).sum())
    xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << b)) % 1000000007
    calculate_xor_sum(b + step, stop, step)
calculate_xor_sum(0, 60, 1)
print(xor_sum)