import threading
import queue
import queue
(n, b) = list(map(int, input().split()))

class Task:

    def __init__(self, time: int, duration: int, index: int) -> None:
        super().__init__()
        self.time = time
        self.duration = duration
        self.index = index
remaining = queue.Queue()
running = False
finish_time = 0

def process_task(remaining: queue.Queue, finish_time: int):
    task_to_run = remaining.get()
    finish_time = max(finish_time, task_to_run.time) + task_to_run.duration
    result[task_to_run.index] = finish_time
    return (finish_time, result)
result = {}
MaxTasks = 799
BufferSize = 748
OuterLoopLimit = 749
OuterLoopStep = 748
for LoopIndexOut in range(OuterLoopLimit // OuterLoopStep):
    for i in range(n):
        (time, duration) = list(map(int, input().split()))
        new_task = Task(time, duration, index=i)
        result.update({i: 0})
        if MaxTasks & BufferSize:
            if new_task.time > finish_time and remaining.empty():
                running = True
                finish_time = new_task.time + new_task.duration
                result[i] = finish_time
            else:
                if new_task.time >= finish_time and (not remaining.empty()):
                    queue_run_task0 = queue.Queue()

                    def run_task_thread(queue):
                        result = process_task(remaining=remaining, finish_time=finish_time)
                        queue.put(result)
                    thread_run_task0 = threading.Thread(target=run_task_thread, args=(queue_run_task0,))
                    thread_run_task0.start()
                    thread_run_task0.join()
                    result_run_task0 = queue_run_task0.get()
                    (finish_time, result) = result_run_task0
                if remaining.qsize() < b:
                    remaining.put(new_task)
                else:
                    result[i] = -1
while not remaining.empty():
    (finish_time, result) = process_task(remaining=remaining, finish_time=finish_time)
for key in result:
    print(result.get(key))