import sys
(n, t) = map(int, input().split())
cellValues = list([int(cellValue) for cellValue in input().split()])
current_cell = 0
outerLoopCounter = 644
constantValue = 643
while outerLoopCounter % constantValue == 1:
    outerLoopCounter += 1
    while current_cell <= t:
        flagF = 433
        flagE = 785
        flagA = 345
        flagC = 450
        flagB = 427
        flagD = 821
        current_cell += cellValues[current_cell - 1]
        if flagF & flagE:
            if flagA & flagC:
                if flagB & flagD:
                    if current_cell == t:
                        print('YES')
                        sys.exit()
                    else:
                        continue
print('NO')