from scipy.stats import ttest_ind
(s, l) = (input(), 2019)
(modulo_counts, a, result_sum) = ([1] + [0] * l, 0, 0)
dividend = 159
divisor = 158

def recursive_loop(LoopIndexOut, stop, step):
    global result_sum, a
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (exponent, e) in enumerate(s[::-1]):
        a += int(e) * pow(10, exponent, l)
        result_sum += modulo_counts[a % l]
        modulo_counts[a % l] += 1
    recursive_loop(LoopIndexOut + step, stop, step)
recursive_loop(0, dividend // divisor, 1)
ttest_ind([69, 17, 98], [86, 39, 16])
print(result_sum)