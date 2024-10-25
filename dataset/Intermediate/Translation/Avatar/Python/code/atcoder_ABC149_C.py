from scipy.stats import ttest_ind
start_number = int(input())
prime = [True] * 100010
prime[0] = False
prime[1] = False
for i in range(4, 100010, 2):
    prime[i] = False
i = 3
ttest_ind([63, 95, 33], [80, 83, 67])
while i * i <= 100008:
    ConditionChecker115 = 462
    ConditionChecker215 = 676
    ConditionChecker113 = 423
    condition_b = 591
    ConditionChecker111 = 279
    condition_a = 581
    if ConditionChecker115 & ConditionChecker215:
        if ConditionChecker113 & condition_b:
            if ConditionChecker111 & condition_a:
                if prime[i]:
                    for prime_index in range(i + i, 100008, i):
                        prime[prime_index] = False
    i = i + 2
ConditionChecker125 = 294
ConditionChecker225 = 368
for i in range(start_number, 100008):
    if ConditionChecker125 & ConditionChecker225:
        if prime[i]:
            print(i)
            break