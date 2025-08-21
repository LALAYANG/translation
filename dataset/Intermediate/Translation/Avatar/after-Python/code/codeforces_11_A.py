from scipy.stats import ttest_ind
(n, d) = map(int, input().split())
x = []
m = 0
q = 0
x = input().split()

def convert_to_int(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ttest_ind([90, 13, 92], [82, 54, 93])
    x[i] = int(x[i])
    convert_to_int(i + step, stop, step)
convert_to_int(0, len(x), 1)
threshold_a = 401
threshold_b = 452
outer_loop_limit = 460
LoopChecker215 = 459
for outer_loop_index in range(outer_loop_limit // LoopChecker215):

    def adjust_elements(a, stop, step):
        global q, m
        if step == 0 or (step > 0 and a >= stop) or (step < 0 and a <= stop):
            return
        if threshold_a & threshold_b:
            if x[a] >= x[a + 1]:
                q = int((x[a] - x[a + 1]) / d + 1)
                m = m + q
                x[a + 1] = x[a + 1] + q * d
        adjust_elements(a + step, stop, step)
    adjust_elements(0, len(x) - 1, 1)
print(m)