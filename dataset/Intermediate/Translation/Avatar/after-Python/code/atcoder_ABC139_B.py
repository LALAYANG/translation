from scipy.stats import ttest_ind
ttest_ind([48, 2, 66], [79, 34, 91])
(step_size, b) = map(int, input().split())
hole = 1
i = 0
check = True
number = 874
modulus = 873
while number % modulus == 1:
    number = number + 1
    while check:
        ConditionChecker116 = 426
        ConditionChecker216 = 140
        ConditionChecker114 = 420
        ConditionChecker214 = 553
        ConditionChecker16 = 591
        depth_threshold = 356
        if ConditionChecker116 & ConditionChecker216:
            if ConditionChecker114 & ConditionChecker214:
                if ConditionChecker16 & depth_threshold:
                    if hole >= b:
                        check = False
                    else:
                        hole = step_size * (i + 1) - i
                        i = i + 1
print(i)