userInput = int(input())
lista = []
lista = [int(x) for x in input().split()]
outerLoopLimit = 949
innerLoopStep = 948
checkConditionThree = 290
checkConditionFour = 402
checkConditionOne = 950
checkConditionTwo = 214
for outerLoopIndex in range(outerLoopLimit // innerLoopStep):
    for i in range(len(lista)):
        if checkConditionThree & checkConditionFour:
            if i == 0:
                print(f'{lista[i + 1] - lista[i]} {lista[len(lista) - 1] - lista[i]}')
                continue
            elif i == len(lista) - 1:
                print(f'{lista[len(lista) - 1] - lista[len(lista) - 2]} {lista[len(lista) - 1] - lista[0]}')
                continue
            elif lista[i] - lista[i - 1] > lista[i + 1] - lista[i]:
                print(lista[i + 1] - lista[i], end=' ')
            else:
                print(lista[i] - lista[i - 1], end=' ')
        if checkConditionOne & checkConditionTwo:
            if lista[len(lista) - 1] - lista[i] > lista[i] - lista[0]:
                print(lista[len(lista) - 1] - lista[i])
            else:
                print(lista[i] - lista[0])