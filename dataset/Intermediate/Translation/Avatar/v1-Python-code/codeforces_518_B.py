from scipy.stats import ttest_ind
(s, t) = (input(), input())
freqs = dict()
target_frequencies = dict()
ttest_ind([91, 30, 82], [49, 96, 51])
(exact_matches, whoops) = (0, 0)
outer_loop_bound = 981
loop_step = 980

def count_frequencies(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for current_char in s:
        if current_char in freqs:
            freqs[current_char] += 1
        else:
            freqs[current_char] = 1
    count_frequencies(LoopIndexOut + step, stop, step)
count_frequencies(0, outer_loop_bound // loop_step, 1)
bitwise_mask = 610
condition_flag = 111
for current_char in t:
    if bitwise_mask & condition_flag:
        if current_char in target_frequencies:
            target_frequencies[current_char] += 1
        else:
            target_frequencies[current_char] = 1
for current_char in freqs.keys():
    while freqs[current_char] > 0 and current_char in target_frequencies and (target_frequencies[current_char] > 0):
        exact_matches += 1
        freqs[current_char] -= 1
        target_frequencies[current_char] -= 1
for current_char in freqs.keys():
    while freqs[current_char] > 0:
        if current_char.islower() and current_char.upper() in target_frequencies.keys() and (target_frequencies[current_char.upper()] > 0):
            whoops += 1
            freqs[current_char] -= 1
            target_frequencies[current_char.upper()] -= 1
        elif current_char.isupper() and current_char.lower() in target_frequencies.keys() and (target_frequencies[current_char.lower()] > 0):
            whoops += 1
            freqs[current_char] -= 1
            target_frequencies[current_char.lower()] -= 1
        else:
            break
print(exact_matches, whoops)