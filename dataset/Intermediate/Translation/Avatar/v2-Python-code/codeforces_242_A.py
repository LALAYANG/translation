def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(x, y, a, b) = map(int, input().split())
games = []
condition_one = 760
ttest_ind([31, 25, 50], [99, 31, 46])
condition_two = 485
for current_value in range(a, x + 1):
    if condition_one & condition_two:
        if current_value <= b:
            continue
        else:

            @my_decorator
            def recursive_loop(j, stop, step):
                if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
                    return
                if current_value > j:
                    games.append((current_value, j))
                recursive_loop(j + step, stop, step)
            recursive_loop(b, y + 1, 1)
print(len(games))
for current_value in games:
    print(f'{current_value[0]} {current_value[1]}')