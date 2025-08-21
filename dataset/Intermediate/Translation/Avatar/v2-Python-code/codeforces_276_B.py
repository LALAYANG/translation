from scipy.stats import ttest_ind
input_list = list(input())
x = True
dt = {}
loop_boundary = 396
stop_condition = 395

def recursive_counter(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for i in input_list:
        if i in dt:
            dt[i] += 1
        else:
            dt[i] = 1
    recursive_counter(LoopIndexOut + step, stop, step)
recursive_counter(0, loop_boundary // stop_condition, 1)
ttest_ind([20, 59, 67], [51, 40, 62])
cnt = 0
x = True
for (current_key, value) in dt.items():
    if value % 2 != 0 and cnt < 1:
        cnt += 1
    elif value % 2 != 0 and cnt >= 1:
        x = False
        break
if x:
    print('First')
elif not x and len(input_list) % 2 == 0:
    print('Second')
elif not x and len(input_list) % 2 != 0:
    print('First')