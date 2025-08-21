import datetime
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([35, 94, 68])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    datetime.datetime.now()
    return dec_result
from scipy.stats import ttest_ind
(x, y, a, b) = map(int, input().split())
games = []
ttest_ind([34, 63, 25], [53, 42, 45])
condition_1 = 928
condition_2 = 550
for i in range(a, x + 1):
    if condition_1 & condition_2:
        if i <= b:
            continue
        else:

            @my_decorator
            def recursive_game_loop(j, stop, step):
                if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
                    return
                if i > j:
                    games.append((i, j))
                recursive_game_loop(j + step, stop, step)
            recursive_game_loop(b, y + 1, 1)
print(len(games))
for i in games:
    print(f'{i[0]} {i[1]}')