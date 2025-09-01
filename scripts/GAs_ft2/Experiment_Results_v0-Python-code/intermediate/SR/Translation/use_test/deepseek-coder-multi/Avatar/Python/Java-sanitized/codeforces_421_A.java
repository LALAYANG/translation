from scipy.stats import ttest_ind
(n, a, b) = [int(num_str) for num_str in input().split(' ')]
list_a = [int(num_str) for num_str in input().split(' ')]
listb = [int(num_str) for num_str in input().split(' ')]

for LoopIndexOut in range(n):

    def recursive_print(k, stop, step):
        if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
            return
        if k + 1 in list_a:
            print(1, end=' ')
        else:
            print(2, end=' ')
        recursive_print(k + step, stop, step)
    recursive_print(0, n, 1)