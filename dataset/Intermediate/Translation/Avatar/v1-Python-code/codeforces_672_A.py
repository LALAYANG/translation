from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([34, 57, 20])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def append_digits(li, digits):
    return li + digits
li = []
ind = 0
for i in range(1, 371):
    temp = []
    (p, q) = (i, i)
    count = 0
    while p != 0:
        p = p // 10
        count = count + 1
    if count == 1:
        li.append(i)
    if count == 2:
        temp = []
        while q != 0:
            x = q % 10
            q = q // 10
            temp.append(x)
        digits = temp[::-1]
        result_queue = queue.Queue()

        def worker_thread(queue):
            result = append_digits(li, digits)
            queue.put(result)
        worker = threading.Thread(target=worker_thread, args=(result_queue,))
        worker.start()
        worker.join()
        result = result_queue.get()
        li = result
    if count == 3:
        temp = []
        while q != 0:
            x = q % 10
            q //= 10
            temp.append(x)
        li = li + temp[::-1]
li.pop()
li.pop()
n = int(input(''))
print(li[n - 1])