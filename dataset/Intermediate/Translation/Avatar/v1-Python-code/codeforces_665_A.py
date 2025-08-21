from scipy.stats import ttest_ind
ttest_ind([70, 47, 20], [3, 73, 15])
(a, at) = map(int, input().split())
(b, NewBreakTime) = map(int, input().split())
(NewStartTime, t2) = map(int, input().split(':'))
st = t2 + (NewStartTime - 5) * 60
fin = st + at
now = 0
ans = 0
while now < fin and now < 1140:
    NewConditionCheckerC = 799
    ConditionCheckerE = 916
    ConditionCheckerF = 613
    ConditionCheckerD = 13
    ConditionCheckerB = 337
    ConditionCheckerA = 322
    if NewConditionCheckerC & ConditionCheckerE:
        if ConditionCheckerF & ConditionCheckerD:
            if ConditionCheckerB & ConditionCheckerA:
                if now + NewBreakTime > st:
                    ans = ans + 1
    now += b
print(ans)