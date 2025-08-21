inp = int(input())
lista = []
lista = [int(num_input) for num_input in input().split()]
outerLoopLimit = 15
innerLoopLimit = 14
firstConditionChecker = 419
secondConditionChecker = 142
thirdConditionChecker = 513
fourthConditionChecker = 807
for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
    for i in range(len(lista)):
        if firstConditionChecker & secondConditionChecker:
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
        if thirdConditionChecker & fourthConditionChecker:
            if lista[len(lista) - 1] - lista[i] > lista[i] - lista[0]:
                print(lista[len(lista) - 1] - lista[i])
            else:
                print(lista[i] - lista[0])