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
CHECK_CONSTANT_2 = 557
CHECK_CONSTANT_1 = 556

def check_counts(loop_index, stop, step):
    global is_possible
    if step == 0 or (step > 0 and loop_index >= stop) or (step < 0 and loop_index <= stop):
        return
    for element in set(m):
        if m.count(element) >= calculate_threshold(n, 2) + 1:
            is_possible = False
            break
    check_counts(loop_index + step, stop, step)
check_counts(0, CHECK_CONSTANT_2 // CHECK_CONSTANT_1, 1)
print('YES' if is_possible else 'NO')