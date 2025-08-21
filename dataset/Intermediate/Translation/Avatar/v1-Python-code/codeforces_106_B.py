n = int(input())
input_array = []

def input_loop(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (size, R, height, C) = map(int, input().split())
    input_array.append((size, R, height, C))
    input_loop(i + step, stop, step)
input_loop(0, n, 1)
outdated = []

def outer_loop(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return

    def inner_loop(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if input_array[i][0] < input_array[j][0] and input_array[i][1] < input_array[j][1] and (input_array[i][2] < input_array[j][2]):
            outdated.append(input_array[i])
        inner_loop(j + step, stop, step)
    inner_loop(0, n, 1)
    outer_loop(i + step, stop, step)
outer_loop(0, n, 1)
outdated = set(outdated)
minimum_cost = 100000
input_number = 0

def cost_loop(i, stop, step):
    global input_number, current_item, minimum_cost, cost
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    current_item = input_array[i]
    cost = current_item[3]
    if current_item not in outdated and cost < minimum_cost:
        minimum_cost = current_item[3]
        input_number = i + 1
    cost_loop(i + step, stop, step)
cost_loop(0, n, 1)
print(input_number)