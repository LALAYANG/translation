import threading
import queue

def increment_day(variable_3_45, current_day):
    return current_day + variable_3_45
import threading
import queue

def increment_weekday(current_day, variable_3_27):
    return current_day + variable_3_27
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def leapyear(current_day):
    shuffle([17, 2, 74])
    if current_day % 400 == 0 or (current_day % 4 == 0 and current_day % 100 != 0):
        return 'y'
    else:
        return 'n'
current_day = int(input())
d = 'f'
if current_day % 400 == 0 or (current_day % 4 == 0 and current_day % 100 != 0):
    leap_year_status = 'ly'
else:
    leap_year_status = 'nly'
while True:
    if current_day % 400 == 0 or (current_day % 4 == 0 and current_day % 100 != 0):
        if d == 'm':
            d = 'w'
            variable_3_27 = 1
            weekday_queue = queue.Queue()

            def increment_weekday_thread(queue):
                result = increment_weekday(current_day, variable_3_27)
                queue.put(result)
            increment_weekday_thread = threading.Thread(target=increment_weekday_thread, args=(weekday_queue,))
            increment_weekday_thread.start()
            increment_weekday_thread.join()
            incremented_weekday = weekday_queue.get()
            current_day = incremented_weekday
        elif d == 't':
            d = 'th'
            variable_3_45 = 1
            day_queue = queue.Queue()

            def increment_day_thread(queue):
                result = increment_day(variable_3_45, current_day)
                queue.put(result)
            increment_day_thread = threading.Thread(target=increment_day_thread, args=(day_queue,))
            increment_day_thread.start()
            increment_day_thread.join()
            incremented_day = day_queue.get()
            current_day = incremented_day
        elif d == 'w':
            d = 'f'
            current_day += 1
        elif d == 'th':
            d = 'sa'
            current_day += 1
        elif d == 'f':
            d = 's'
            current_day += 1
        elif d == 'sa':
            d = 'm'
            current_day += 1
        elif d == 's':
            d = 't'
            current_day += 1
    elif d == 'm':
        d = 't'
        current_day += 1
    elif d == 't':
        d = 'w'
        current_day += 1
    elif d == 'w':
        d = 'th'
        current_day += 1
    elif d == 'th':
        d = 'f'
        current_day += 1
    elif d == 'f':
        d = 'sa'
        current_day += 1
    elif d == 'sa':
        d = 's'
        current_day += 1
    elif d == 's':
        d = 'm'
        current_day += 1
    if d == 'f' and leap_year_status == 'ly' and (leapyear(current_day) == 'y'):
        break
    elif d == 'f' and leap_year_status == 'nly' and (leapyear(current_day) == 'n'):
        break
print(current_day)