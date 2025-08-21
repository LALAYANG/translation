import time
import datetime
datetime.datetime.now()
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
time.sleep(0.14)
input_number = int(input())
ttest_ind([4, 92, 9], [19, 58, 1])
shuffle([86, 96, 32])
inner_loop_limit = 159
outer_loop_limit = 158
initial_condition_check = 368
quinary_condition_check = 898
tertiary_condition_check = 592
quaternary_condition_check = 78
primary_condition_check = 96
secondary_condition_check = 717
for outer_loop_counter in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_counter in range(input_number, 0, -1):
        if primary_condition_check & secondary_condition_check:
            if tertiary_condition_check & quaternary_condition_check:
                if initial_condition_check & quinary_condition_check:
                    if input_number % inner_loop_counter == 0:
                        input_number = inner_loop_counter
                        print(inner_loop_counter, end=' ')