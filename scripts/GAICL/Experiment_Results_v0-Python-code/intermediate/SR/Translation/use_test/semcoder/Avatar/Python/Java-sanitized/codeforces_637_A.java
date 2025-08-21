python
import base64
from cryptography.fernet import Fernet
import datetime
import time
from collections import Counter

input_length = int(input())
s = input()[:-1].split()

datetime.datetime.now()
counts = Counter(s)
s = s[::-1]

(max_index, max_element) = (-1, 0)

for element in counts:
    if counts[element] == max(counts.values()):
        if s.index(element) > max_index:
            max_element = element
            max_index = s.index(element)

print(max_element)