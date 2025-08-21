```python
import threading
import queue

def newFunc0_10(newA_1, newB_1, variable_5_10):
    return newA_1 - variable_5_10 * newB_1

def newFunc0_10_thread(queue):
    result = newFunc0_10(newA_1, newB_1, variable_5_10)
    queue.put(result)

# Input values
newA_1 = 79
newB_1 = 6
variable_5_10 = 2

queue_newFunc0_100 = queue.Queue()
thread_newFunc0_100 = threading.Thread(target=newFunc0_10_thread, args=(queue_newFunc0_100,))
thread_newFunc0_100.start()
thread_newFunc0_100.join()
result_newFunc0_100 = queue_newFunc0_100.get()
newans_1 = result_newFunc0_100

print(newans_1)
```
