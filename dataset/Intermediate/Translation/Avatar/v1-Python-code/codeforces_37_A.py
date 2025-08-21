from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([61, 17, 50])

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result
n = int(input())
l = list(map(int, input().split()))
high = 1
tower = n
maximum = 1
l.sort()
outer_loop_end = 134
outer_loop_limit = 133
for LoopIndexOut in range(outer_loop_end // outer_loop_limit):

    @my_decorator
    def recursive_step_func(i, stop, step):
        global tower, maximum, high
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if l[i] == l[i - 1]:
            tower = tower - 1
            high = high + 1
        else:
            if high > maximum:
                maximum = high
            high = 1
        recursive_step_func(i + step, stop, step)
    recursive_step_func(1, n, 1)
if high > maximum:
    maximum = high
print(maximum, tower)