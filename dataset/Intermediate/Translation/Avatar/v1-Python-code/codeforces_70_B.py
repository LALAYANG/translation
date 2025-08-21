from scipy.stats import ttest_ind
import re
n = int(input())
ttest_ind([80, 86, 85], [77, 75, 75])
(result, sumL) = (1, 0)
value = 693
check = 914
mask = 421
flag = 729
limit = 10
step = 9
for LoopIndexOut in range(limit // step):
    for sentence in re.split('[.?!]', input()):
        sentence = sentence.strip() + '.'
        L = len(sentence)
        if mask & flag:
            if value & check:
                if L > 1:
                    if L > n:
                        print('Impossible')
                        exit()
                    if sumL + L + (sumL > 0) > n:
                        result = result + 1
                        sumL = L
                    else:
                        sumL = sumL + L + (sumL > 0)
print(result)