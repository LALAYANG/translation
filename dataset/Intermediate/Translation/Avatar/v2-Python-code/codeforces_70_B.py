import threading
import queue

def StringProcessor(s, Period):
    return s.strip() + Period
import re
n = int(input())
(ans, CurrentLineLength) = (1, 0)
ConditionFour = 805
ConditionTwo = 538
ConditionOne = 447
ConditionThree = 671
OuterLoopLimit = 388
InnerLoopLimit = 387
for LoopIndexOut in range(OuterLoopLimit // InnerLoopLimit):
    for s in re.split('[.?!]', input()):
        Period = '.'
        queue_StringProcessor0 = queue.Queue()

        def StringProcessor_thread(queue):
            ProcessedSentence = StringProcessor(s, Period)
            queue.put(ProcessedSentence)
        thread_StringProcessor0 = threading.Thread(target=StringProcessor_thread, args=(queue_StringProcessor0,))
        thread_StringProcessor0.start()
        thread_StringProcessor0.join()
        ProcessedString = queue_StringProcessor0.get()
        s = ProcessedString
        L = len(s)
        if ConditionOne & ConditionThree:
            if ConditionFour & ConditionTwo:
                if L > 1:
                    if L > n:
                        print('Impossible')
                        exit()
                    if CurrentLineLength + L + (CurrentLineLength > 0) > n:
                        ans = ans + 1
                        CurrentLineLength = L
                    else:
                        CurrentLineLength = CurrentLineLength + L + (CurrentLineLength > 0)
print(ans)