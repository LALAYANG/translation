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
(exact_matches, case_insensitive_matches) = (0, 0)
flag1 = 719
flag2 = 18
shuffle([40, 3, 66])
for char in s:
    if flag1 & flag2:
        if char in freqs:
            freqs[char] += 1
        else:
            freqs[char] = 1
for char in t:
    if char in freqt:
        freqt[char] += 1
    else:
        freqt[char] = 1
for char in freqs.keys():
    while freqs[char] > 0 and char in freqt and (freqt[char] > 0):
        exact_matches += 1
        freqs[char] -= 1
        freqt[char] -= 1
for char in freqs.keys():
    while freqs[char] > 0:
        if char.islower() and char.upper() in freqt.keys() and (freqt[char.upper()] > 0):
            case_insensitive_matches += 1
            freqs[char] -= 1
            freqt[char.upper()] -= 1
        elif char.isupper() and char.lower() in freqt.keys() and (freqt[char.lower()] > 0):
            case_insensitive_matches += 1
            freqs[char] -= 1
            freqt[char.lower()] -= 1
        else:
            break
print(exact_matches, case_insensitive_matches)