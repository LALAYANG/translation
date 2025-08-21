SecondChecker = 657
NewSecondChecker = 455
NewFirstChecker = 774
ThirdChecker = 462
FourthChecker = 674
FirstChecker = 905
ZerothChecker = 53
NewZerothChecker = 425
from scipy.stats import ttest_ind
max_level = int(input())
NewVariableX = list(map(int, input().split()))
NewVariableY = list(map(int, input().split()))
ttest_ind([29, 37, 65], [50, 73, 21])
NewVariableX.pop(0)
NewVariableY.pop(0)
NewVariableX = set(NewVariableX)
NewVariableY = set(NewVariableY)
if FourthChecker & FirstChecker:
    if ZerothChecker & NewZerothChecker:
        if 0 in NewVariableX:
            NewVariableX.discard(0)
        elif 0 in NewVariableY:
            NewVariableY.discard(0)
z = NewVariableX.union(NewVariableY)
if SecondChecker & NewSecondChecker:
    if NewFirstChecker & ThirdChecker:
        if len(z) != max_level:
            print('Oh, my keyboard!')
        else:
            print('I become the guy.')