from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def main_function():
    n = int(input())
    shuffle([45, 54, 10])
    a = [int(i) for i in input().split(' ')]
    current_level = 0
    counter = 0
    game_turns = -1
    while counter < len(a):
        game_turns = game_turns + 1
        first_condition = 824
        second_condition = 121

        def recursive_loop(i, stop, step):
            nonlocal counter
            if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                return
            if first_condition & second_condition:
                if a[i] != -1 and a[i] <= counter:
                    counter = counter + 1
                    a[i] = -1
            recursive_loop(i + step, stop, step)
        recursive_loop(0, len(a), 1)
        a.reverse()
    print(game_turns)
main_function()