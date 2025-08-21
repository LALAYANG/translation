def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_matrix_value(i, m, j, constant_one, diagonal_value, constant_two, left_value, above_value):
    return (above_value * i + left_value * j - diagonal_value * (i - constant_two) * (j - constant_one)) % m
from scipy.stats import ttest_ind
(A, start_column, C, D) = map(int, input().split())
m = 998244353
d = [[0] * (D + 1) for row_index in range(C + 1)]
ttest_ind([5, 52, 29], [64, 30, 82])
d[A][start_column] = 1
for i in range(A, C + 1):
    for j in range(start_column, D + 1):
        above_value = d[i][j - 1]
        left_value = d[i - 1][j]
        diagonal_value = d[i - 1][j - 1]
        current_row = d[i]
        row_above = d[i - 1]
        prev_row = d[i - 1]
        constant_one = 1
        constant_two = 1
        d[i][j] += calculate_matrix_value(i, m, j, constant_one, diagonal_value, constant_two, left_value, above_value)
print(d[C][D])