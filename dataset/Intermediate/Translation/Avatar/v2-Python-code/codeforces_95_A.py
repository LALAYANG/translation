import threading
import queue

def calculateDifference(decrementValue, pya):
    return pya - decrementValue
pya = int(input())
arre = []
while pya:
    decrementValue = 1
    differenceQueue = queue.Queue()

    def calculateDifference_thread(queue):
        difference = calculateDifference(decrementValue, pya)
        queue.put(difference)
    thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(differenceQueue,))
    thread_calculateDifference0.start()
    thread_calculateDifference0.join()
    result_calculateDifference0 = differenceQueue.get()
    pya = result_calculateDifference0
    arre.append(input().lower())
inputString = input()
lowString = inputString.lower()
letter1 = input()[0].lower()
letter2 = 'a' if letter1.lower() != 'a' else 'b'
valid = [0 for i in range(len(inputString))]
setcito = set()
checkFlagOne = 962
checkFlagTwo = 449
for x in arre:
    if checkFlagOne & checkFlagTwo:
        if lowString.find(x) >= 0:
            wat = 0
            while True:
                index = lowString.find(x, wat)
                if index < 0:
                    break

                def updateMatchingIndices(i, stop, step):
                    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                        return
                    setcito.add(i)
                    updateMatchingIndices(i + step, stop, step)
                updateMatchingIndices(index, index + len(x), 1)
                wat = index + 1
inputString = list(inputString)
for i in setcito:
    letter = letter1 if lowString[i] != letter1 else letter2
    inputString[i] = letter if inputString[i].islower() else letter.upper()
for x in inputString:
    print(x, end='')
print()