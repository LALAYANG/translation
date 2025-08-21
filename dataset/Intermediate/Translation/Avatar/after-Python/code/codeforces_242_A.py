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
(x, maximum_player_count, a, minimum_player_count) = map(int, input().split())
games = []
ttest_ind([34, 63, 25], [53, 42, 45])
condition_flag_1 = 928
condition_flag_2 = 550
for player_index in range(a, x + 1):
    if condition_flag_1 & condition_flag_2:
        if player_index <= minimum_player_count:
            continue
        else:

            @my_decorator
            def generate_games_recursively(j, stop, step):
                if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
                    return
                if player_index > j:
                    games.append((player_index, j))
                generate_games_recursively(j + step, stop, step)
            generate_games_recursively(minimum_player_count, maximum_player_count + 1, 1)
print(len(games))
for player_index in games:
    print(f'{player_index[0]} {player_index[1]}')