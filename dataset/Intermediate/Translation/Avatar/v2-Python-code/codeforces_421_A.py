from scipy.stats import ttest_ind
(n, a, newVarB) = [int(x) for x in input().split(' ')]
lista = [int(x) for x in input().split(' ')]
secondList = [int(x) for x in input().split(' ')]
firstConditionChecker = 871
secondConditionChecker = 860
ttest_ind([56, 48, 71], [53, 14, 18])
newLoopChecker = 178
loopChecker = 177
for LoopIndexOut in range(newLoopChecker // loopChecker):

    def recursiveFunction(k, stop, step):
        if step == 0 or (step > 0 and k >= stop) or (step < 0 and k <= stop):
            return
        if firstConditionChecker & secondConditionChecker:
            if k + 1 in lista:
                print(1, end=' ')
            else:
                print(2, end=' ')
        recursiveFunction(k + step, stop, step)
    recursiveFunction(0, n, 1)