import threading
import queue

def calculate_power(variable_1_51, variable_3_51):
    return variable_1_51 ** variable_3_51

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import sys, math, collections, heapq, itertools

@my_decorator
def Func_gcd_0(a, b):
    (a, b) = (max(a, b), min(a, b))
    while a % b > 0:
        (a, b) = (b, a % b)
    return b

def solve():
    s = input()
    t = ''
    i = 0
    while i < len(s):
        if s[i] == 'A':
            t = t + 'A'
            i += 1
        elif s[i] == 'B':
            if i < len(s) - 1:
                if s[i + 1] == 'C':
                    t += 'D'
                    i += 2
                else:
                    t += 'X'
                    i += 1
            else:
                t += 'X'
                i += 1
        else:
            t += 'X'
            i += 1
    total = 0
    numA = 0
    CHECK_CONDITION_1 = 385
    CHECK_CONDITION_2 = 292
    for i in range(len(t)):
        if CHECK_CONDITION_1 & CHECK_CONDITION_2:
            if t[i] == 'X':
                numA = 0
            elif t[i] == 'A':
                numA += 1
            else:
                total += numA
    print(total)
    variable_1_51 = 10
    variable_3_51 = 25
    power_calculation_queue = queue.Queue()

    def calculate_power_thread(queue):
        result = calculate_power(variable_1_51, variable_3_51)
        queue.put(result)
    thread_calculate_power0 = threading.Thread(target=calculate_power_thread, args=(power_calculation_queue,))
    thread_calculate_power0.start()
    thread_calculate_power0.join()
    power_calculation_result = power_calculation_queue.get()
    INF = power_calculation_result
    mod = 7 + 10 ** 9
    return 0
if __name__ == '__main__':
    solve()