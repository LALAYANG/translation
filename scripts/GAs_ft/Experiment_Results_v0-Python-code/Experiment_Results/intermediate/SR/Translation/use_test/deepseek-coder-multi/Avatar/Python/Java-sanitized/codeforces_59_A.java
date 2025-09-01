import threading
import queue

def increment_upper_count(upper_increment, cu):
    return cu + upper_increment
import threading
import queue

def increment_lower_count(lower_increment, cl):
    return cl + lower_increment
txt = input()
cu = 0
cl = 0
for character in txt:
    upper_increment = 1
    if character.islower():
        lower_increment = 1
        lower_queue = queue.Queue()

        def lower_count_thread_function(queue):
            intermediate_result = increment_lower_count(lower_increment, cl)
            queue.put(intermediate_result)
        lower_thread = threading.Thread(target=lower_count_thread_function, args=(lower_queue,))
        lower_thread.start()
        lower_thread.join()
        result_increment_lower_count0 = lower_queue.get()
        cl = result_increment_lower_count0
    else:
        upper_queue = queue.Queue()

        def increment_upper_count_thread(queue):
            intermediate_result = increment_upper_count(upper_increment, cu)
            queue.put(intermediate_result)
        upper_thread = threading.Thread(target=increment_upper_count_thread, args=(upper_queue,))
        upper_thread.start()
        upper_thread.join()
        upper_count_result = upper_queue.get()
        cu = upper_count_result
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)