def calculateResult(i, IncrementVariable, firstInput):
    return firstInput * (i + IncrementVariable) - i
(firstInput, b) = map(int, input().split())
result = 1
i = 0
check = True
while check:
    CheckerOneTen = 13
    CheckerTwoTen = 593
    CheckerOneEight = 988
    CheckerTwoEight = 976
    CheckerOneSix = 29
    CheckerTwoSix = 406
    IncrementVariable = 1
    if CheckerOneTen & CheckerTwoTen:
        if CheckerOneEight & CheckerTwoEight:
            if CheckerOneSix & CheckerTwoSix:
                if result >= b:
                    check = False
                else:
                    result = calculateResult(i, IncrementVariable, firstInput)
                    i = i + 1
print(i)