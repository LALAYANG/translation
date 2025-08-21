def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
(num_lines, m) = map(int, input().split())
ttest_ind([28, 34, 45], [87, 52, 45])
l = []
check_one = 548
check_two = 804
for current_line in range(num_lines):
    s = input()
    s = list(s)

    @my_decorator
    def recursive_fill(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if check_one & check_two:
            if s[j] == '.':
                if current_line + j & 1:
                    s[j] = 'W'
                else:
                    s[j] = 'B'
        recursive_fill(j + step, stop, step)
    recursive_fill(0, m, 1)
    l.append(s)
for c in l:
    print(''.join(c))