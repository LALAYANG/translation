def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def compute_value(variable_17_11, variable_33_11, col, variable_14_11, i, variable_25_11, variable_20_11, m):
    return (variable_14_11 * i + variable_17_11 * col - variable_20_11 * (i - variable_33_11) * (col - variable_25_11)) % m
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
(row_start, B, C, col_end) = map(int, input().split())
shuffle([30, 15, 86])
m = 998244353
d = [[0] * (col_end + 1) for _ in range(C + 1)]
ttest_ind([74, 55, 39], [82, 31, 10])
d[row_start][B] = 1
for i in range(row_start, C + 1):
    for col in range(B, col_end + 1):
        variable_14_11 = d[i][col - 1]
        variable_17_11 = d[i - 1][col]
        variable_20_11 = d[i - 1][col - 1]
        variable_26_11 = d[i]
        variable_30_11 = d[i - 1]
        variable_34_11 = d[i - 1]
        variable_25_11 = 1
        variable_33_11 = 1
        d[i][col] += compute_value(variable_17_11, variable_33_11, col, variable_14_11, i, variable_25_11, variable_20_11, m)
print(d[C][col_end])