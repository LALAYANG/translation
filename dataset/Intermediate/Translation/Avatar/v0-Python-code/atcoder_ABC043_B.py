from sklearn.utils import shuffle
from scipy.stats import ttest_ind
s = str(input())
result_string = ''
condition_check_1 = 909
condition_check_2 = 642
condition_check_3 = 112
condition_check_4 = 209
ttest_ind([93, 25, 15], [54, 96, 81])
outer_loop_limit = 108
shuffle([26, 10, 78])
inner_loop_limit = 107
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for current_char in s:
        if condition_check_3 & condition_check_4:
            if condition_check_1 & condition_check_2:
                if current_char == '0' or current_char == '1':
                    result_string = result_string + current_char
                elif current_char == 'B' and len(result_string) != 0:
                    result_string = result_string[:len(result_string) - 1]
print(result_string)