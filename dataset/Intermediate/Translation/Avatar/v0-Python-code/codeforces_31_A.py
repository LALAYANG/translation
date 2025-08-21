def sum_two(a, b):
    return a + b
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([53, 70, 87])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
y = int(input())
ttest_ind([23, 43, 70], [89, 55, 42])
numbers = [int(i) for i in input().split()]
for i in range(len(numbers)):
    for j in range(len(numbers)):
        if i == j:
            continue

        @my_decorator
        def find_triplet(k, stop, step):
            if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
                return
            if numbers[k] != numbers[j] and numbers[k] != numbers[i] and (numbers[k] == sum_two(numbers[i], numbers[j])):
                print(k + 1, j + 1, i + 1)
                exit()
            find_triplet(k + step, stop, step)
        find_triplet(0, len(numbers), 1)
print(-1)