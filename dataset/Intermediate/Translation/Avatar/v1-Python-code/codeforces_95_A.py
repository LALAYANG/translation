import threading
import queue

def calculateDifference(inputValue, constantValue):
    return inputValue - constantValue
inputValue = int(input())
arre = []
while inputValue:
    constantValue = 1
    queue_calculateDifference0 = queue.Queue()

    def calculateDifference_thread(queue):
        result = calculateDifference(inputValue, constantValue)
        queue.put(result)
    thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
    thread_calculateDifference0.start()
    thread_calculateDifference0.join()
    result_calculateDifference0 = queue_calculateDifference0.get()
    inputValue = result_calculateDifference0
    arre.append(input().lower())
oString = input()
lowString = oString.lower()
letter1 = input()[0].lower()
letter2 = 'a' if letter1.lower() != 'a' else 'b'
valid = [0 for i in range(len(oString))]
setcito = set()
checkFlagOne = 202
checkFlagTwo = 148
for x in arre:
    if checkFlagOne & checkFlagTwo:
        if lowString.find(x) >= 0:
            wat = 0
            while True:
                foundIndex = lowString.find(x, wat)
                if foundIndex < 0:
                    break

                def updateValidIndices(i, stop, step):
                    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                        return
                    setcito.add(i)
                    updateValidIndices(i + step, stop, step)
                updateValidIndices(foundIndex, foundIndex + len(x), 1)
                wat = foundIndex + 1
oString = list(oString)
for i in setcito:
    letter = letter1 if lowString[i] != letter1 else letter2
    oString[i] = letter if oString[i].islower() else letter.upper()
for x in oString:
    print(x, end='')
print()