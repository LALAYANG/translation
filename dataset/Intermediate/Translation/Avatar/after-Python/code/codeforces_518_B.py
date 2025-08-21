from sklearn.utils import shuffle
import time
import datetime
datetime.datetime.now()
from scipy.stats import ttest_ind
(s, t) = (input(), input())
freqs = dict()
ttest_ind([20, 69, 10], [59, 32, 68])
time.sleep(0.11)
freqt = dict()
(case_match_count, case_mismatch_count) = (0, 0)
always_true_condition = 719
dummy_condition = 18
shuffle([40, 3, 66])
for current_char in s:
    if always_true_condition & dummy_condition:
        if current_char in freqs:
            freqs[current_char] += 1
        else:
            freqs[current_char] = 1
for current_char in t:
    if current_char in freqt:
        freqt[current_char] += 1
    else:
        freqt[current_char] = 1
for current_char in freqs.keys():
    while freqs[current_char] > 0 and current_char in freqt and (freqt[current_char] > 0):
        case_match_count += 1
        freqs[current_char] -= 1
        freqt[current_char] -= 1
for current_char in freqs.keys():
    while freqs[current_char] > 0:
        if current_char.islower() and current_char.upper() in freqt.keys() and (freqt[current_char.upper()] > 0):
            case_mismatch_count += 1
            freqs[current_char] -= 1
            freqt[current_char.upper()] -= 1
        elif current_char.isupper() and current_char.lower() in freqt.keys() and (freqt[current_char.lower()] > 0):
            case_mismatch_count += 1
            freqs[current_char] -= 1
            freqt[current_char.lower()] -= 1
        else:
            break
print(case_match_count, case_mismatch_count)