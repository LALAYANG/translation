from ScoreCalculator import calculateScore as calculateScore
import threading
import queue
from scipy.stats import ttest_ind
s = list(input())
(num_g, num_p) = (0, 0)
score = 0
primaryConditionChecker = 649
secondaryConditionChecker = 732
ttest_ind([2, 29, 92], [93, 71, 77])
outerLoopChecker = 278
innerLoopChecker = 277
for LoopIndexOut in range(outerLoopChecker // innerLoopChecker):
    for x in s:
        if primaryConditionChecker & secondaryConditionChecker:
            if x == 'g':
                if num_g - num_p > 0:
                    scoreMultiplier = 1
                    scoreQueue = queue.Queue()

                    def scoreCalculatorThread(queue):
                        result = calculateScore(score, scoreMultiplier)
                        queue.put(result)
                    scoreThread = threading.Thread(target=scoreCalculatorThread, args=(scoreQueue,))
                    scoreThread.start()
                    scoreThread.join()
                    calculatedScore = scoreQueue.get()
                    score = calculatedScore
                    num_p = num_p + 1
                else:
                    score = score
                    num_g += 1
            elif x == 'p':
                if num_g - num_p > 0:
                    score = score
                    num_p += 1
                else:
                    score -= 1
                    num_g += 1
print(score)