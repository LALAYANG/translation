def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def calculate_threshold(a, b):
    ttest_ind([3, 43, 95], [32, 8, 60])
    return a / b
n = int(input())
m = input().split()
is_possible = True
LoopChecker16 = 557
LoopChecker26 = 556

def check_frequency(index, stop, step):
    global is_possible
    if step == 0 or (step > 0 and index >= stop) or (step < 0 and index <= stop):
        return
    for element in set(m):
        if m.count(element) >= calculate_threshold(n, 2) + 1:
            is_possible = False
            break
    check_frequency(index + step, stop, step)
check_frequency(0, LoopChecker16 // LoopChecker26, 1)
print('YES' if is_possible else 'NO')