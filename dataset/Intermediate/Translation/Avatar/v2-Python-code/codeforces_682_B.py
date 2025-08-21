import threading
import queue

def calculate_sum(c, increment):
    return c + increment
from scipy.stats import ttest_ind
import os, sys, io, math
from array import array
from math import *
I = lambda : [*map(int, sys.stdin.readline().split())]
IS = lambda : input()
IN = lambda : int(input())
get_float = lambda : float(input())
n = IN()
l = I()
f = 1
l.sort()
c = 0
condition_four = 477
condition_one = 274
condition_two = 748
condition_three = 828
ttest_ind([23, 64, 96], [56, 42, 91])
for element in l:
    if condition_two & condition_three:
        if condition_four & condition_one:
            if element > c:
                increment = 1
                queue_calculate_sum0 = queue.Queue()

                def calculate_sum_thread(queue):
                    result = calculate_sum(c, increment)
                    queue.put(result)
                thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
                thread_calculate_sum0.start()
                thread_calculate_sum0.join()
                result_calculate_sum0 = queue_calculate_sum0.get()
                c = result_calculate_sum0
print(c + 1)