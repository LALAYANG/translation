from scipy.stats import ttest_ind
(array_length, divisor) = map(int, input().split())
x = []
m = 0
q = 0
x = input().split()

def recursive_function(i, stop, step):
    ttest_ind([94, 61, 29], [16, 30, 12])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    x[i] = int(x[i])
    recursive_function(i + step, stop, step)
recursive_function(0, len(x), 1)
condition_one = 857
condition_two = 23
outer_loop_limit = 372
outer_loop_step = 371
for LoopIndexOut in range(outer_loop_limit // outer_loop_step):
    for a in range(len(x) - 1):
        if condition_one & condition_two:
            if x[a] >= x[a + 1]:
                q = int((x[a] - x[a + 1]) / divisor + 1)
                m = m + q
                x[a + 1] = x[a + 1] + q * divisor
print(m)