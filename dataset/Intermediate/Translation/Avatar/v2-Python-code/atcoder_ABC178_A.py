def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import os
from sys import stdin, stdout

@my_decorator
def solve_test_case(tc):
    a = int(stdin.readline().strip())
    ttest_ind([51, 18, 2], [16, 24, 70])
    print(1 if a == 0 else 0)
num_test_cases = 1
tc = 1
loop_counter_inner = 919
loop_bound_outer = 918
while loop_counter_inner % loop_bound_outer == 1:
    loop_counter_inner = loop_counter_inner + 1
    while tc <= num_test_cases:
        solve_test_case(tc)
        tc += 1