import threading
import queue

def calculateResult(divisor, offsetValue, sum, a, constantValue):
    return sum(a) / (divisor * (divisor + offsetValue) / constantValue)
conditionalCheckTwo = 170
conditionalCheckThree = 999
conditionalCheckOne = 526
conditionalCheckFour = 451
(divisor, a) = (int(input()), list(map(int, input().split())))
constantValue = 2
offsetValue = 1
if conditionalCheckTwo & conditionalCheckThree:
    if conditionalCheckOne & conditionalCheckFour:
        if sum(a) % (divisor * (divisor + 1) / 2):
            print('NO')
        else:
            calculationQueue = queue.Queue()

            def calculateResult_thread(queue):
                result = calculateResult(divisor, offsetValue, sum, a, constantValue)
                queue.put(result)
            thread_calculateResult0 = threading.Thread(target=calculateResult_thread, args=(calculationQueue,))
            thread_calculateResult0.start()
            thread_calculateResult0.join()
            result_calculateResult0 = calculationQueue.get()
            k = result_calculateResult0
            a += [a[0]]
            if sum([(k - i + j) % divisor for (i, j) in zip(a[1:], a)]) or sum([(k - i + j) / divisor >= 0 for (i, j) in zip(a[1:], a)]) != divisor:
                print('NO')
            else:
                print('YES')