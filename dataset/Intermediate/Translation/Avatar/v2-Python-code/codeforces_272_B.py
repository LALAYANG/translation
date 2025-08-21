import threading
import queue

def MainFunction():
    input()
    return nPairsWithCommonFX(map(int, input().split()))

def nPairsWithCommonFX(sequence):
    storage = {}
    FXs = []
    MinCondition = 251
    MaxCondition = 682
    OuterLoopLimit = 593
    InnerLoopLimit = 592
    for LoopIndexOut in range(OuterLoopLimit // InnerLoopLimit):
        for value in sequence:
            queue_f0 = queue.Queue()

            def f_thread(queue):
                result = f(value)
                queue.put(result)
            CalculationThread = threading.Thread(target=f_thread, args=(queue_f0,))
            CalculationThread.start()
            CalculationThread.join()
            result_f0 = queue_f0.get()
            y = result_f0
            if MinCondition & MaxCondition:
                if y not in storage:
                    storage[y] = [value]
                    FXs.append(y)
                else:
                    storage[y].append(value)
    return (sum((len(storage[y]) * len(storage[y]) for y in FXs)) - sum((len(storage[y]) for y in FXs))) // 2

def f(n):
    y = 1
    while n != 1:
        if n % 2:
            y = y + 1
        n //= 2
    return y
if __name__ == '__main__':
    print(MainFunction())