def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_value(row_idx, j, m, row, curr_row_prev_col_val, col_idx, prev_row_val, prev_row_prev_col_val):
    return (curr_row_prev_col_val * row + prev_row_val * j - prev_row_prev_col_val * (row - row_idx) * (j - col_idx)) % m
from scipy.stats import ttest_ind
(A, B, C, D) = map(int, input().split())
m = 998244353
d = [[0] * (D + 1) for _ in range(C + 1)]
d[A][B] = 1
for row in range(A, C + 1):
    for j in range(B, D + 1):
        curr_row_prev_col_val = d[row][j - 1]
        prev_row_val = d[row - 1][j]
        prev_row_prev_col_val = d[row - 1][j - 1]
        curr_row = d[row]
        prev_row = d[row - 1]
        prev_row = d[row - 1]
        col_idx = 1
        row_idx = 1
        d[row][j] += calculate_value(row_idx, j, m, row, curr_row_prev_col_val, col_idx, prev_row_val, prev_row_prev_col_val)
ttest_ind([18, 72, 82], [25, 86, 94])
print(d[C][D])