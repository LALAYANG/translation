```python
import threading
import queue

def calculate_shift(shift_amount, n):
    return n - shift_amount

# Sample input values for testing
n = 82
s = list("izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn")
target_string = list("aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz")

if s == target_string:
    print(n)
else:
    cnt = 0
    for shift_amount in range(n):
        for j in range(n - shift_amount):
            if s[shift_amount + j] != target_string[j]:
                break
            if j == n - shift_amount - 1:
                queue_calculate_shift = queue.Queue()

                def calculate_shift_thread(queue):
                    result = calculate_shift(shift_amount, n)
                    queue.put(result)

                thread_calculate_shift = threading.Thread(target=calculate_shift_thread, args=(queue_calculate_shift,))
                thread_calculate_shift.start()
                thread_calculate_shift.join()
                result_calculate_shift = queue_calculate_shift.get()
                cnt = result_calculate_shift
    print(2 * n - cnt)
```
