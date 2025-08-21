import threading
import queue

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def newFunc0_21(li, variable_3_21):
    return li + variable_3_21
li = []
ind = 0
ConditionChecker110 = 79
ConditionChecker210 = 639
for i in range(1, 371):
    temp = []
    (p, newq_1) = (i, i)
    count = 0
    while p != 0:
        p = p // 10
        count = count + 1
    if ConditionChecker110 & ConditionChecker210:
        if count == 1:
            li.append(i)
    if count == 2:
        temp = []
        while newq_1 != 0:
            x = newq_1 % 10
            newq_1 //= 10
            temp.append(x)
        variable_3_21 = temp[::-1]
        queue_newFunc0_210 = queue.Queue()

        def newFunc0_21_thread(queue):
            result = newFunc0_21(li, variable_3_21)
            queue.put(result)
        thread_newFunc0_210 = threading.Thread(target=newFunc0_21_thread, args=(queue_newFunc0_210,))
        thread_newFunc0_210.start()
        thread_newFunc0_210.join()
        result_newFunc0_210 = queue_newFunc0_210.get()
        li = result_newFunc0_210
    if count == 3:
        temp = []
        while newq_1 != 0:
            x = newq_1 % 10
            newq_1 //= 10
            temp.append(x)
        li = li + temp[::-1]
li.pop()
li.pop()
newn_1 = int(input(''))
print(li[newn_1 - 1])