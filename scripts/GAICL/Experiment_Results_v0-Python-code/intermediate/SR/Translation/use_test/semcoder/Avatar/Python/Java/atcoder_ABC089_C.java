```python
    return res  # The result of the function is returned

def dec_result(*args, **kwargs):  # The decorator function returns a wrapper function

def my_decorator(func):  # The decorator function takes a function as input

@my_decorator  # The Func_input_0 function is decorated with my_decorator
def Func_input_0():  # The Func_input_0 function reads input from sys.stdin

def Func_INT_0():  # The Func_INT_0 function reads an integer input

def MAP():  # The MAP function reads input and splits it into integers

def LIST():  # The LIST function reads input and converts it to a list of integers

def ZIP(n):  # The ZIP function reads multiple inputs and zips them

sys.setrecursionlimit(10 ** 9)  # Sets the recursion limit to 10^9
INF = float('inf')  # Initializes INF to positive infinity
mod = 10 ** 9 + 7  # Sets modulo to 10^9 + 7
import numpy as np  # Imports numpy library
queue_INT0 = queue.Queue()  # Initializes a queue for storing integer inputs

def INT_thread(queue):  # The INT_thread function reads an integer input in a separate thread

newthread_INT0_1 = threading.Thread(target=INT_thread, args=(queue_INT0,))  # Creates a thread to read an integer input
newthread_INT0_1.start()  # Starts the thread to read the integer input
newthread_INT0_1.join()  # Waits for the thread to finish
result_INT0 = queue_INT0.get()  # Retrieves the integer input from the queue
N = result_INT0  # Assigns the integer input to N
S = [Func_input_0() for _ in range(N)]  # Reads N strings from input
march = ['M', 'A', 'R', 'C', 'H']  # List of characters to check for
march_lis = [0] * 5  # List to store counts of characters
ConditionChecker146 = 111  # Condition checker 1
ConditionChecker246 = 134  # Condition checker 2
for s in S:  # Iterates over the list of strings
    if ConditionChecker146 & ConditionChecker246:  # Checks if both condition checkers are true
        if s[0].upper() in march:  # Checks if the first character of the string is in the march list
            march_lis[march.index(s[0].upper())] += 1  # Increments the count of the corresponding character
ans = 0  # Initializes the answer variable
for (x, y, z) in combinations(march_lis, 3):  # Iterates over combinations of 3 counts
    ans += x * y * z  # Calculates the product of the counts and adds it to the answer
print(ans)  # Prints the final answer
```

