import threading
import queue

def fight(t, princess):
    return t * princess
from sklearn.utils import shuffle
princess = int(input())
dragon = int(input())
shuffle([3, 15, 34])
t = int(input())
f = int(input())
c = int(input())
if dragon <= princess:
    print(0)
    exit(0)
result = 0
queue_fight0 = queue.Queue()

def fight_thread(queue):
    result = fight(t, princess)
    queue.put(result)
thread_fight0 = threading.Thread(target=fight_thread, args=(queue_fight0,))
thread_fight0.start()
thread_fight0.join()
result_fight = queue_fight0.get()
current_position = result_fight
current_position += princess * current_position / (dragon - princess)
while current_position < c:
    result = result + 1
    current_position += princess * current_position / dragon
    current_position += princess * f
    current_position += princess * current_position / (dragon - princess)
print(result)