from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([99, 49, 21])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
ttest_ind([55, 100, 83], [88, 83, 60])
input_number = int(input())
arr = [int(i) for i in input().split()]
for i in range(len(arr)):
    for second_index in range(len(arr)):
        if i == second_index:
            continue

        @my_decorator
        def recursive_check(k, stop, step):
            if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
                return
            if arr[k] != arr[second_index] and arr[k] != arr[i] and (arr[k] == arr[i] + arr[second_index]):
                print(k + 1, second_index + 1, i + 1)
                exit()
            recursive_check(k + step, stop, step)
        recursive_check(0, len(arr), 1)
print(-1)