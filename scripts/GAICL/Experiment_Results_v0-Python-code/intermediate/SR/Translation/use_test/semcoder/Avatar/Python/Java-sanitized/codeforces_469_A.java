python
import time
import datetime
from sklearn.utils import shuffle

# Sample input data
target_size = 3
combined_set = {10, 96, 28}
second_set = {46, 77, 3}

# Perform operations
shuffle(list(combined_set))
union_set = combined_set.union(second_set)

# Check if the union set has the target size
if len(union_set) != target_size:
    print('Oh, my keyboard!')
else:
    print('I become the guy.')