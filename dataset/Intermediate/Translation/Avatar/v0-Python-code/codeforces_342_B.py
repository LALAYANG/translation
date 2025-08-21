condition_18 = 416
condition_28 = 431
condition_16 = 315
condition_26 = 697
condition_14 = 663
condition_24 = 739
from scipy.stats import ttest_ind
R = lambda : map(int, input().split())
(n, m, s, f) = R()
if condition_18 & condition_28:
    if condition_16 & condition_26:
        if condition_14 & condition_24:
            if s < f:
                d = 1
                c = 'R'
            else:
                d = -1
                c = 'L'
res = ''
i = 1
current_position = s
(t, l, r) = R()
k = 1
loop_condition_1 = 287
loop_condition_2 = 286
while loop_condition_1 % loop_condition_2 == 1:
    loop_condition_1 = loop_condition_1 + 1
    while current_position != f:
        if i > t and k < m:
            (t, l, r) = R()
            k = k + 1
        if i == t and (l <= current_position <= r or l <= current_position + d <= r):
            res = res + 'X'
        else:
            res += c
            current_position += d
        i += 1
ttest_ind([68, 65, 96], [47, 63, 92])
print(res)