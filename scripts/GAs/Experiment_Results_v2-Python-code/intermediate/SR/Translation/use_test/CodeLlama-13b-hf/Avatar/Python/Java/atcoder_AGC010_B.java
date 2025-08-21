
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735 
Expected output:
NO


```
import threading
import queue

def calculate_average_difference(count, sum, offset, numbers, divisor):
    return sum(numbers) / (count * (count + offset) / divisor)
condition_one = 827
condition_two = 672
precondition = 41
condition_check_two = 545
(count, numbers) = (int(input()), list(map(int, input().split())))
divisor = 2
offset = 1
if condition_one & condition_two:
    if precondition & condition_check_two:
        if sum(numbers) % (count * (count + 1) / 2):
            print('NO')
        else:
            queue_calculate_average_difference0 = queue.Queue()

            def calculate_average_difference_thread(queue):
                result = calculate_average_difference(count, sum, offset, numbers, divisor)
                queue.put(result)
            thread_calculate_average_difference0 = threading.Thread(target=calculate_average_difference_thread, args=(queue_calculate_average_difference0,))
            thread_calculate_average_difference0.start()
            thread_calculate_average_difference0.join()
            result_calculate_average_difference0 = queue_calculate_average_difference0.get()
            k = result_calculate_average_difference0
            numbers += [numbers[0]]
            if sum([(k - i + j) % count for (i, j) in zip(numbers[1:], numbers)]) or sum([(k - i + j) / count >= 0 for (i, j) in zip(numbers[1:], numbers)]) != count:
                print('NO')
            else:
                print('YES')
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735 
Expected output:
NO


```
import threading
import queue

def calculate_average_difference(count, sum, offset, numbers, divisor):
    return sum(numbers) / (count * (count + offset) / divisor)
condition_one = 827
condition_two = 672
precondition = 41
condition_check_two = 545
(count, numbers) = (int(input()), list(map(int, input().split())))
divisor = 2
offset = 1
if condition_one & condition_two:
    if precondition & condition_check_two:
        if sum(numbers) % (count * (count + 1) / 2):
            print('NO')
        else:
            queue_calculate_average_difference0 = queue.Queue()

            def calculate_average_difference_thread(queue):
                result = calculate_average_difference(count, sum, offset, numbers, divisor)
                queue.put(result)
            thread_calculate_average_difference0 = threading.Thread(target=calculate_average_difference_thread, args=(queue_calculate_average_difference0,))
            thread_calculate_average_difference0.start()
            thread_calculate_average_difference0.join()
            result_calculate_average_difference0 = queue_calculate_average_difference0.get()
            k = result_calculate_average_difference0
            numbers += [numbers[0]]
            if sum([(k - i + j) % count for (i, j) in zip(numbers[1:], numbers)]) or sum([(k - i + j) / count >= 0 for (i, j) in zip(numbers[1:], numbers)]) != count:
                print('NO')
            else:
                print('YES')
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735 
Expected output:
NO


```
import threading
import queue

def calculate_average_difference(count, sum, offset, numbers, divisor):
    return sum(numbers) / (count * (count + offset) / divisor)
condition_one = 827
condition_two = 672
precondition = 41
condition_check_two = 545
(count, numbers) = (int(input()), list(map(int, input().split())))
divisor = 2
offset = 1
if condition_one & condition_two:
    if precondition & condition_check_two:
        if sum(numbers) % (count * (count + 1) / 2):
            print('NO')
        else:
            queue_calculate_average_difference0 = queue.Queue()

            def calculate_average_difference_thread(queue):
                result = calculate_average_difference(count, sum, offset, numbers, divisor)
                queue.put(result)
            thread_calculate_average_difference0 = threading.Thread(target=calculate_average_difference_thread, args=(queue_calculate_average_difference0,))
            thread_calculate_average_difference0.start()
            thread_calculate_average_difference0.join()
            result_calculate_average_difference0 = queue_calculate_average_difference0.get()
            k = result_calculate_average_difference0
            numbers += [numbers[0]]
            if sum([(k - i + j) % count for (i, j) in zip(numbers[1:], numbers)]) or sum([(k - i + j) / count >= 0 for (i, j) in zip(numbers[1:], numbers)]) != count:
                print('
