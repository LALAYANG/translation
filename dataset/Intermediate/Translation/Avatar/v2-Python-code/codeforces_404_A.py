def my_decorator(func):

    def dec_result(*args, **kwargs):
        functionResult = func(*args, **kwargs)
        return functionResult
    return dec_result
matrixSize = int(input())
s = []

@my_decorator
def matrixInput(i, stop, step):
    global k
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    k = input()
    s.append(k)
    matrixInput(i + step, stop, step)
matrixInput(0, matrixSize, 1)
flag = 0
d1 = []
d2 = []
rem = set()
DiagonalCheckerOne = 51
DiagonalCheckerTwo = 753
for i in range(matrixSize):
    for j in range(matrixSize):
        if DiagonalCheckerOne & DiagonalCheckerTwo:
            if i == j:
                d1.append(s[i][j])
        if i == matrixSize - j - 1:
            d2.append(s[i][j])
        if i != j and i != matrixSize - j - 1:
            rem.add(s[i][j])
if len(rem) != 1:
    print('NO')
elif d1 != d2:
    print('NO')
elif len(set(d1)) != 1:
    print('NO')
elif set(d1) == rem:
    print('NO')
else:
    print('YES')