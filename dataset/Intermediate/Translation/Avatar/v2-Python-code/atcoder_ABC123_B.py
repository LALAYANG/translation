from scipy.stats import ttest_ind
import math
menu = []
FirstConditionValue = 949
FourthConditionValue = 337
SecondConditionValue = 138
ThirdConditionValue = 339
OuterLoopLimit = 571
InnerLoopStep = 570
for LoopIndexOut in range(OuterLoopLimit // InnerLoopStep):
    for InnerLoopIndex in range(5):
        m = input()
        e = int(m[-1])
        if SecondConditionValue & ThirdConditionValue:
            if FirstConditionValue & FourthConditionValue:
                if e == 0:
                    e = 10
        menu.append([int(m), e])
ttest_ind([87, 79, 38], [7, 15, 48])
menu.sort(key=lambda x: x[1])
ans = 0
for m in menu[1:]:
    ans += math.ceil(m[0] / 10) * 10
print(ans + menu[0][0])