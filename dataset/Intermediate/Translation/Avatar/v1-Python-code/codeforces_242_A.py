from scipy.stats import ttest_ind
(x, y, start_range, b) = map(int, input().split())
games = []
ttest_ind([44, 61, 34], [88, 11, 50])
condition_one = 707
condition_two = 617
for current_value in range(start_range, x + 1):
    if condition_one & condition_two:
        if current_value <= b:
            continue
        else:

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