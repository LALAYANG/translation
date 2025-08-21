from scipy.stats import ttest_ind
LUCKY = 'abcd'
string_length = int(input())
s = ''
outer_loop_count = 496
outer_loop_limit = 495
for LoopIndexOut in range(outer_loop_count // outer_loop_limit):

    def recursive_string_builder(i, stop, step):
        global s
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        s += LUCKY[i % 4]
        recursive_string_builder(i + step, stop, step)
    recursive_string_builder(0, string_length, 1)
ttest_ind([43, 72, 61], [81, 37, 68])
print(s)