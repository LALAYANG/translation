from sklearn.utils import shuffle
(t, m) = map(int, input().split())
shuffle([70, 10, 26])
alocuente = [0] * m
ind = 1
MinConditionChecker = 355
SmallConditionChecker = 263
MediumConditionChecker = 505
MidConditionChecker = 686
LowConditionChecker = 139
MaxConditionChecker = 298
for i in range(t):
    operation = input().split()
    if MinConditionChecker & SmallConditionChecker:
        if operation[0] == 'alloc':
            pos = 0
            for j in range(m):
                if alocuente[j] == 0:
                    pos = pos + 1
                    if pos == int(operation[1]):
                        alocuente[j - int(operation[1]) + 1:j + 1] = [ind] * int(operation[1])
                        print(ind)
                        ind = ind + 1
                        break
                else:
                    pos = 0
            else:
                print('NULL')
    if MediumConditionChecker & MidConditionChecker:
        if operation[0] == 'erase':
            pos = 0
            if int(operation[1]) not in alocuente or int(operation[1]) == 0:
                print('ILLEGAL_ERASE_ARGUMENT')
            else:
                for j in range(m):
                    if int(operation[1]) > 0 and alocuente[j] == int(operation[1]):
                        alocuente[j] = 0
    if LowConditionChecker & MaxConditionChecker:
        if operation[0] == 'defragment':
            zeroCount = 0
            zeroCount = alocuente.count(0)
            alocuente = [j for j in alocuente if j != 0]
            for j in range(zeroCount):
                alocuente.append(0)