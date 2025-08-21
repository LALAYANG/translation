```python
# Input values
a, at = map(int, input().split())
interval, bt = map(int, input().split())
t1, end_time = map(int, input().split(':'))

# Constants
variable_7_6 = 60
variable_10_6 = 5

# Calculate the start time
st = end_time + (t1 - variable_10_6) * variable_7_6

# Calculate the end time
fin = st + at

# Initialize variables
now = 0
ans = 0

# Main loop
while now < fin and now < 1140:
    check1 = 75
    check2 = 651
    if check1 & check2:
        if now + bt > st:
            ans += 1
    now += interval

# Output the result
print(ans)
```
