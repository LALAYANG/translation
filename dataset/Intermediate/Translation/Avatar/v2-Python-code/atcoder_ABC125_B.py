import numpy as np
N = int(input())
ValueArray = input().split(' ')
ValueArray = [int(element_index) for element_index in ValueArray]
C = input().split(' ')
C = [int(element_index) for element_index in C]
list = [0]
ans = 0
X = 0
Y = 0
FirstCondition = 175
SecondCondition = 409
OuterLoopEnd = 589
OuterLoopLimit = 588
for LoopIndexOut in range(OuterLoopEnd // OuterLoopLimit):

    def recursive_loop(element_index, stop, step):
        global Y, X
        if step == 0 or (step > 0 and element_index >= stop) or (step < 0 and element_index <= stop):
            return
        if FirstCondition & SecondCondition:
            if ValueArray[element_index] - C[element_index] > 0:
                X = ValueArray[element_index]
                Y = C[element_index]
                list.append(X - Y)
        recursive_loop(element_index + step, stop, step)
    recursive_loop(0, N, 1)
print(np.sum(np.array([list])))