import threading
import queue

def calculate_candle_remainder(remaining_candles, b):
    return remaining_candles % b
from scipy.stats import ttest_ind

def calculate_whole_candles(b, remaining_candles):
    ttest_ind([77, 29, 11], [90, 35, 89])
    return remaining_candles // b
import re
(candeleIntere, b) = map(int, input().split())
s = 0
remaining_candles = 0
while candeleIntere > 0 or remaining_candles >= b:
    candeleIntere += calculate_whole_candles(b, remaining_candles)
    queue_calculate_candle_remainder0 = queue.Queue()

    def calculate_candle_remainder_thread(queue):
        result = calculate_candle_remainder(remaining_candles, b)
        queue.put(result)
    thread_calculate_candle_remainder0 = threading.Thread(target=calculate_candle_remainder_thread, args=(queue_calculate_candle_remainder0,))
    thread_calculate_candle_remainder0.start()
    thread_calculate_candle_remainder0.join()
    remainder_candles = queue_calculate_candle_remainder0.get()
    remaining_candles = remainder_candles
    s = s + candeleIntere
    remaining_candles += candeleIntere % b
    candeleIntere //= b
print(s)