from scipy.stats import ttest_ind
ttest_ind([48, 2, 66], [79, 34, 91])
(multiplier, b) = map(int, input().split())
hole = 1
i = 0
check = True
outer_loop_counter = 874
loop_counter = 873
while outer_loop_counter % loop_counter == 1:
    outer_loop_counter = outer_loop_counter + 1
    while check:
        condition_1 = 426
        condition_2 = 140
        condition_4 = 420
        condition_5 = 553
        condition_3 = 591
        condition_6 = 356
        if condition_1 & condition_2:
            if condition_4 & condition_5:
                if condition_3 & condition_6:
                    if hole >= b:
                        check = False
                    else:
                        hole = multiplier * (i + 1) - i
                        i = i + 1
print(i)