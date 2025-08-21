import threading
import queue
from scipy.stats import ttest_ind

def calculate_sum(delta, black):
    ttest_ind([10, 97, 1], [23, 99, 25])
    return black + delta
t = []

def recursive_loop(index, stop, step):
    global l
    if step == 0 or (step > 0 and index >= stop) or (step < 0 and index <= stop):
        return
    input_line = list(map(str, input()))
    t.append(input_line)
    recursive_loop(index + step, stop, step)
recursive_loop(0, 4, 1)
black = 0
white = 0
correct = 0
for index in range(3):
    for j in range(3):
        if t[index][j] == '#':
            delta = 1
            result_queue = queue.Queue()

            def calculate_sum_thread(queue):
                sum_result = calculate_sum(delta, black)
                queue.put(sum_result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(result_queue,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = result_queue.get()
            black = result_calculate_sum0
        else:
            white += 1
        if t[index][j + 1] == '#':
            black += 1
        else:
            white += 1
        if t[index + 1][j] == '#':
            black += 1
        else:
            white += 1
        if t[index + 1][j + 1] == '#':
            black += 1
        else:
            white += 1
        if black == 0 or black == 3 or white == 0 or (white == 3) or (white == 4) or (black == 4):
            correct = 1
            break
        black = 0
        white = 0
if correct == 1:
    print('YES')
else:
    print('NO')