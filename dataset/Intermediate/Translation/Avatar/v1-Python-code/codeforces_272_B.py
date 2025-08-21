import threading
import queue

def mainFunction():
    input()
    return nPairsWithCommonFX(map(int, input().split()))

def nPairsWithCommonFX(sequence):
    storage = {}
    FXs = []
    conditionalCheckOne = 725
    conditionalCheckThree = 549
    conditionalCheckTwo = 135
    conditionalCheckFour = 718
    for value in sequence:
        queue_f0 = queue.Queue()

        def f_thread(queue):
            result = f(value)
            queue.put(result)
        thread_f0 = threading.Thread(target=f_thread, args=(queue_f0,))
        thread_f0.start()
        thread_f0.join()
        result_f0 = queue_f0.get()
        y = result_f0
        if conditionalCheckTwo & conditionalCheckFour:
            if conditionalCheckOne & conditionalCheckThree:
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
        n = n // 2
    return y
if __name__ == '__main__':
    print(mainFunction())