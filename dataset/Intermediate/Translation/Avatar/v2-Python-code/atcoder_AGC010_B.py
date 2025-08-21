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