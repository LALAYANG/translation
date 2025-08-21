```python
    print(best2L * (n // 2) + best1L)  # The output is 50000000000000000, which is the total price for n tiles

if n % 2 == 0:  # The condition for n being even is true, so the total price is calculated based on the number of tiles
best2L = np.min(np.array([d, best1L * 2]))  # best2L is the minimum of d and twice best1L
best1L = np.min(np.array([q * 4, h * 2, s]))  # best1L is the minimum of q * 4, h * 2, and s
(q, h, s, d) = result_MAP0  # q, h, s, d are the prices of 1x1, 1x2, square, and domino tiles respectively
result_INT0 = newqueue_INT0_1.get()  # n is the number of tiles
thread_INT0 = threading.Thread(target=INT_thread, args=(newqueue_INT0_1,))  # Creating a thread to read input for n
newqueue_INT0_1 = queue.Queue()  # Queue for storing input for n
def INT_thread(queue):  # Function to read input for n
    result = INT()  # Reading input for n
    queue.put(result)  # Placing the input in the queue

n = result_INT0  # n is the number of tiles
best1L = np.min(np.array([q * 4, h * 2, s]))  # best1L is the minimum of q * 4, h * 2, and s
best2L = np.min(np.array([d, best1L * 2]))  # best2L is the minimum of d and twice best1L
if n % 2 == 0:  # The condition for n being even is true, so the total price is calculated based on the number of tiles

print(best2L * (n // 2) + best1L)  # The output is 50000000000000000, which is the total price for n tiles
```

