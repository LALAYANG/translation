from scipy.stats import ttest_ind
(n, a, b) = [int(num_str) for num_str in input().split(' ')]
list_a = [int(num_str) for num_str in input().split(' ')]
listb = [int(num_str) for num_str in input().split(' ')]
CONDITION_1 = 899
CONDITION_2 = 475
LOOP_START = 938
LOOP_END = 937
ttest_ind([74, 48, 36], [51, 53, 63])
for LoopIndexOut in range(LOOP_START // LOOP_END):

    def recursive_print(k, stop, step):
        if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
            return
        if CONDITION_1 & CONDITION_2:
            if k + 1 in list_a:
                print(1, end=' ')
            else:
                print(2, end=' ')
        recursive_print(k + step, stop, step)
    recursive_print(0, n, 1)