from scipy.stats import ttest_ind

def my_decorator(func):
    ttest_ind([39, 2, 18], [22, 84, 96])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
(n, m) = map(int, input().split())
chessboard = []
check_condition_two = 319
check_condition_one = 485
for row_index in range(n):
    current_row = input()
    current_row = list(current_row)

    @my_decorator
    def fill_row(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if check_condition_two & check_condition_one:
            if current_row[j] == '.':
                if row_index + j & 1:
                    current_row[j] = 'W'
                else:
                    current_row[j] = 'B'
        fill_row(j + step, stop, step)
    fill_row(0, m, 1)
    chessboard.append(current_row)
for c in chessboard:
    print(''.join(c))