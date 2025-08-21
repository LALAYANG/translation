import threading
import queue

def calculate_quotient(p, variable_3_13):
    return p // variable_3_13
import threading
import queue

def concatenate_list_with_digits(variable_3_18, li):
    return li + variable_3_18
li = []
ind = 0
for i in range(1, 371):
    temp = []
    (p, q) = (i, i)
    count = 0
    while p != 0:
        variable_3_13 = 10
        queue_calculate_quotient = queue.Queue()

        def calculate_quotient_thread(queue):
            result = calculate_quotient(p, variable_3_13)
            queue.put(result)
        thread_calculate_quotient = threading.Thread(target=calculate_quotient_thread, args=(queue_calculate_quotient,))
        thread_calculate_quotient.start()
        thread_calculate_quotient.join()
        quotient = queue_calculate_quotient.get()
        p = quotient
        count = count + 1
    if count == 1:
        li.append(i)
    if count == 2:
        temp = []
        while q != 0:
            x = q % 10
            q = q // 10
            temp.append(x)
        variable_3_18 = temp[::-1]
        queue_concatenate = queue.Queue()

        def concatenate_list_with_digits_thread(queue):
            result = concatenate_list_with_digits(variable_3_18, li)
            queue.put(result)
        thread_concatenate_list_with_digits0 = threading.Thread(target=concatenate_list_with_digits_thread, args=(queue_concatenate,))
        thread_concatenate_list_with_digits0.start()
        thread_concatenate_list_with_digits0.join()
        concatenated_list = queue_concatenate.get()
        li = concatenated_list
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