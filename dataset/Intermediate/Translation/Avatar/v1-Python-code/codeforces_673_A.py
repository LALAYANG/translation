from sklearn.utils import shuffle
firstThreshold = 614
maximumAllowableValue = 955
shuffle([57, 59, 41])
minimumRequiredValue = 670
secondThreshold = 586
outerLoopLimit = 406
innerLoopStep = 405
n = int(input())
arr = list(map(int, input().split()))
if firstThreshold & maximumAllowableValue:
    if minimumRequiredValue & secondThreshold:
        if arr[0] > 15:
            print(15)
        else:
            for outerLoopIndex in range(outerLoopLimit // innerLoopStep):
                for i in range(1, len(arr)):
                    if arr[i] - arr[i - 1] > 15:
                        print(arr[i - 1] + 15)
                        break
                else:
                    if arr[-1] == 90 or arr[-1] + 15 >= 90:
                        print(90)
                    else:
                        print(arr[-1] + 15)