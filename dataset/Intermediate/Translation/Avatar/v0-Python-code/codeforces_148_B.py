isGameOver = 483
isTimeUp = 504
isTargetReached = 430
isPathClear = 230
isValidInput = 239
isWithinRange = 917
from scipy.stats import ttest_ind
princessPower = int(input())
dragonPower = int(input())
t = int(input())
f = int(input())
c = int(input())
if isGameOver & isTimeUp:
    if isTargetReached & isPathClear:
        if isValidInput & isWithinRange:
            if dragonPower <= princessPower:
                print(0)
                exit(0)
result = 0
position = t * princessPower
ttest_ind([5, 21, 51], [69, 24, 15])
position += princessPower * position / (dragonPower - princessPower)
loopCounter1 = 797
loopCounter2 = 796
while loopCounter1 % loopCounter2 == 1:
    loopCounter1 = loopCounter1 + 1
    while position < c:
        result = result + 1
        position += princessPower * position / dragonPower
        position += princessPower * f
        position += princessPower * position / (dragonPower - princessPower)
print(result)