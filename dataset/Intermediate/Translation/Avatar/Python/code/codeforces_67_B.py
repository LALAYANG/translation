from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([62, 70, 6])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def sum_numbers(a, b):
    return a + b
from scipy.stats import ttest_ind
get_input = input
(n, k) = map(int, get_input().split())
numbers = [int(i) for i in get_input().split()]
ttest_ind([1, 72, 53], [75, 85, 6])
m = 0
condition_two = 28
ConditionChecker219 = 531
condition_three = 519
condition_one = 674
for j in range(n):
    for index in range(n):
        if condition_three & condition_one:
            if condition_two & ConditionChecker219:
                if 0 == numbers[index]:
                    print(sum_numbers(index, 1), end=' ')
                    break
    for l in range(index + 1 - k):
        numbers[l] -= 1
    numbers[index] -= 1