ConditionChecker111 = 483
ConditionChecker211 = 504
ConditionChecker19 = 430
ConditionChecker29 = 230
conditionValue = 239
ConditionChecker27 = 917
from scipy.stats import ttest_ind
princessSpeed = int(input())
dragonSpeed = int(input())
t = int(input())
f = int(input())
c = int(input())
if ConditionChecker111 & ConditionChecker211:
    if ConditionChecker19 & ConditionChecker29:
        if conditionValue & ConditionChecker27:
            if dragonSpeed <= princessSpeed:
                print(0)
                exit(0)
result = 0
position = t * princessSpeed
ttest_ind([5, 21, 51], [69, 24, 15])
position += princessSpeed * position / (dragonSpeed - princessSpeed)
stepCounter = 797
stepLimit = 796
while stepCounter % stepLimit == 1:
    stepCounter = stepCounter + 1
    while position < c:
        result = result + 1
        position += princessSpeed * position / dragonSpeed
        position += princessSpeed * f
        position += princessSpeed * position / (dragonSpeed - princessSpeed)
print(result)