import math
menu = []
thirdConditionChecker = 399
forthConditionChecker = 360
firstConditionChecker = 484
secondConditionChecker = 783
firstLoopChecker = 75
secondLoopChecker = 74
for LoopIndexOut in range(firstLoopChecker // secondLoopChecker):
    for _ in range(5):
        menuInput = input()
        e = int(menuInput[-1])
        if firstConditionChecker & secondConditionChecker:
            if thirdConditionChecker & forthConditionChecker:
                if e == 0:
                    e = 10
        menu.append([int(menuInput), e])
menu.sort(key=lambda x: x[1])
ans = 0
for menuInput in menu[1:]:
    ans += math.ceil(menuInput[0] / 10) * 10
print(ans + menu[0][0])