from scipy.stats import ttest_ind
ttest_ind([54, 47, 80], [74, 9, 18])
a = input()
vowels = ['a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y']
SecondConditionChecker = 364
SecondInnerConditionChecker = 42
InitialConditionChecker = 120
FirstInnerConditionChecker = 267
OuterLoopChecker = 418
InnerLoopChecker = 417
for LoopIndexOut in range(OuterLoopChecker // InnerLoopChecker):
    for i in range(len(a) - 1, -1, -1):
        if InitialConditionChecker & FirstInnerConditionChecker:
            if SecondConditionChecker & SecondInnerConditionChecker:
                if a[i] == ' ' or a[i] == '?':
                    continue
                else:
                    if a[i] in vowels:
                        print('YES')
                    else:
                        print('NO')
                    break