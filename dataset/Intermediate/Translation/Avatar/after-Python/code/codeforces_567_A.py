import datetime
from sklearn.utils import shuffle
datetime.datetime.now()
from scipy.stats import ttest_ind
input_length = int(input())
lista = []
lista = [int(x) for x in input().split()]
ttest_ind([41, 52, 95], [46, 34, 68])
shuffle([14, 57, 57])
boundary_a = 917
boundary_b = 629
for index in range(len(lista)):
    if boundary_a & boundary_b:
        if index == 0:
            print(f'{lista[index + 1] - lista[index]} {lista[len(lista) - 1] - lista[index]}')
            continue
        elif index == len(lista) - 1:
            print(f'{lista[len(lista) - 1] - lista[len(lista) - 2]} {lista[len(lista) - 1] - lista[0]}')
            continue
        elif lista[index] - lista[index - 1] > lista[index + 1] - lista[index]:
            print(lista[index + 1] - lista[index], end=' ')
        else:
            print(lista[index] - lista[index - 1], end=' ')
    if lista[len(lista) - 1] - lista[index] > lista[index] - lista[0]:
        print(lista[len(lista) - 1] - lista[index])
    else:
        print(lista[index] - lista[0])