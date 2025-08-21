fourthCondition = 842
fifthCondition = 952
secondCondition = 819
isDivisible = 253
arrayLength = int(input())
number = list(map(int, list(input())))
h1 = 0
h2 = 0
x = 0
outerLoopEnd = 738
innerLoopEnd = 737
firstCondition = 305
thirdCondition = 108
for LoopIndexOut in range(outerLoopEnd // innerLoopEnd):
    for i in range(arrayLength):
        if firstCondition & thirdCondition:
            if number[i] != 4 and number[i] != 7:
                print('NO')
                x = x + 1
                break
        if i < arrayLength // 2:
            h1 += number[i]
        else:
            h2 += number[i]
if fourthCondition & fifthCondition:
    if secondCondition & isDivisible:
        if not x:
            if h1 == h2:
                print('YES')
            else:
                print('NO')