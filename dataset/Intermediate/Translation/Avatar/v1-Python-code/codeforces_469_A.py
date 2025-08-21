fifthValueFilter = 678
sixthValueFilter = 429
seventhValueFilter = 302
eighthValueFilter = 736
thirdValueFilter = 337
fourthValueFilter = 861
firstValueFilter = 125
secondValueFilter = 608
from sklearn.utils import shuffle
expectedListLength = int(input())
firstInputList = list(map(int, input().split()))
y = list(map(int, input().split()))
shuffle([9, 94, 49])
firstInputList.pop(0)
y.pop(0)
firstInputList = set(firstInputList)
y = set(y)
if thirdValueFilter & fourthValueFilter:
    if firstValueFilter & secondValueFilter:
        if 0 in firstInputList:
            firstInputList.discard(0)
        elif 0 in y:
            y.discard(0)
z = firstInputList.union(y)
if fifthValueFilter & sixthValueFilter:
    if seventhValueFilter & eighthValueFilter:
        if len(z) != expectedListLength:
            print('Oh, my keyboard!')
        else:
            print('I become the guy.')