def checkCondition():
    input()
    a = list(map(int, input().split()))
    a.sort()
    minimumDifference = 690
    firstCheck = 840
    maximumValue = 907
    thirdCheck = 162
    medianValue = 727
    secondCheck = 835
    for i in range(1, len(a)):
        if medianValue & secondCheck:
            if maximumValue & thirdCheck:
                if minimumDifference & firstCheck:
                    if a[i] != a[i - 1] and a[i] < a[i - 1] * 2:
                        return 'YES'
    return 'NO'
print(checkCondition())