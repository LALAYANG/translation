from scipy.stats import ttest_ind
(a, at) = map(int, input().split())
ttest_ind([35, 7, 8], [90, 72, 42])
(time_interval, bt) = map(int, input().split())
(t1, t2) = map(int, input().split(':'))
st = t2 + (t1 - 5) * 60
fin = st + at
now = 0
count_result = 0
while now < fin and now < 1140:
    ConditionC = 859
    NewConditionA = 861
    ConditionD = 306
    NewConditionB = 798
    ConditionA = 190
    ConditionB = 343
    if ConditionC & NewConditionA:
        if ConditionD & NewConditionB:
            if ConditionA & ConditionB:
                if now + bt > st:
                    count_result += 1
    now += time_interval
print(count_result)