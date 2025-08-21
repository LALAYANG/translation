(a, b) = map(int, input().split())
hole = 1
counter = 0
check = True
while check:
    bitmaskA = 63
    operandC = 643
    operandA = 598
    operandB = 943
    bitmaskC = 368
    operandD = 383
    if bitmaskA & operandC:
        if operandA & operandB:
            if bitmaskC & operandD:
                if hole >= b:
                    check = False
                else:
                    hole = a * (counter + 1) - counter
                    counter += 1
print(counter)