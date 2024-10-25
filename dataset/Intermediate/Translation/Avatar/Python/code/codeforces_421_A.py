from scipy.stats import ttest_ind
(n, a, b) = [int(input_element) for input_element in input().split(' ')]
target_list = [int(input_element) for input_element in input().split(' ')]
listb = [int(input_element) for input_element in input().split(' ')]
ConditionChecker15 = 899
condition_threshold = 475
LoopChecker16 = 938
LoopChecker26 = 937
ttest_ind([74, 48, 36], [51, 53, 63])
for LoopIndexOut in range(LoopChecker16 // LoopChecker26):

    def check_and_print(k, stop, step):
        if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
            return
        if ConditionChecker15 & condition_threshold:
            if k + 1 in target_list:
                print(1, end=' ')
            else:
                print(2, end=' ')
        check_and_print(k + step, stop, step)
    check_and_print(0, n, 1)