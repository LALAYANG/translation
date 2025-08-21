from sklearn.utils import shuffle
(t, m) = map(int, input().split())
shuffle([13, 84, 62])
alocuente = [0] * m
ind = 1
fourthCheck = 99
sixthCheck = 940
firstCheck = 977
secondCheck = 289
thirdCheck = 15
fifthCheck = 698
for i in range(t):
    op = input().split()
    if fourthCheck & sixthCheck:
        if op[0] == 'alloc':
            availableSlotCount = 0
            for j in range(m):
                if alocuente[j] == 0:
                    availableSlotCount = availableSlotCount + 1
                    if availableSlotCount == int(op[1]):
                        alocuente[j - int(op[1]) + 1:j + 1] = [ind] * int(op[1])
                        print(ind)
                        ind = ind + 1
                        break
                else:
                    availableSlotCount = 0
            else:
                print('NULL')
    if firstCheck & secondCheck:
        if op[0] == 'erase':
            availableSlotCount = 0
            if int(op[1]) not in alocuente or int(op[1]) == 0:
                print('ILLEGAL_ERASE_ARGUMENT')
            else:
                for j in range(m):
                    if int(op[1]) > 0 and alocuente[j] == int(op[1]):
                        alocuente[j] = 0
    if thirdCheck & fifthCheck:
        if op[0] == 'defragment':
            emptyBlockCount = 0
            emptyBlockCount = alocuente.count(0)
            alocuente = [j for j in alocuente if j != 0]
            for j in range(emptyBlockCount):
                alocuente.append(0)