condition_one = 23
condition_two = 759
from scipy.stats import ttest_ind
R = lambda : map(int, input().split())
(steps_count, total_time, s, f) = R()
if condition_one & condition_two:
    if s < f:
        d = 1
        direction_indicator = 'R'
    else:
        d = -1
        direction_indicator = 'L'
res = ''
i = 1
j = s
(t, l, r) = R()
k = 1
loop_control_one = 732
ttest_ind([51, 89, 100], [9, 74, 43])
loop_control_two = 731
while loop_control_one % loop_control_two == 1:
    loop_control_one += 1
    while j != f:
        if i > t and k < total_time:
            (t, l, r) = R()
            k += 1
        if i == t and (l <= j <= r or l <= j + d <= r):
            res += 'X'
        else:
            res += direction_indicator
            j += d
        i += 1
print(res)