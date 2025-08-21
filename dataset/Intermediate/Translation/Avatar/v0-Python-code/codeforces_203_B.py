def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def Func_solve_case_0():
    (n, m) = map(int, input().split())
    water_level_grid = [None] * n

    def initialize_grid(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        water_level_grid[i] = [0] * n
        initialize_grid(i + step, stop, step)
    initialize_grid(0, n, 1)
    ans = -1
    min_water_level = 105
    max_water_level = 28
    ttest_ind([70, 42, 84], [44, 55, 99])
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y = y - 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    water_level_grid[i][j] += 1
                    if water_level_grid[i][j] == 9:
                        found = True
        if min_water_level & max_water_level:
            if found:
                ans = k + 1
                break
    print(ans)
Func_solve_case_0()