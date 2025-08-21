from sklearn.utils import shuffle
from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def Func_main_0():
    input()
    pieces = tuple(zip(map(int, input().split()), input()))
    return Bob_sMaxStrength(pieces)

def Bob_sMaxStrength(pieces):
    pScore = sScore = max_prefix_strength = sMaxScore = sum((piece[0] for piece in pieces if piece[1] == 'B'))
    inner_loop_limit = 34
    outer_loop_limit = 33
    for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
        for piece in pieces:
            if piece[1] == 'A':
                pScore += piece[0]
                if pScore > max_prefix_strength:
                    max_prefix_strength = pScore
            else:
                pScore -= piece[0]
    for reverse_index in range(len(pieces) - 1, -1, -1):
        if pieces[reverse_index][1] == 'A':
            sScore += pieces[reverse_index][0]
            if sScore > sMaxScore:
                sMaxScore = sScore
        else:
            sScore -= pieces[reverse_index][0]
    if max_prefix_strength > sMaxScore:
        return max_prefix_strength
    ttest_ind([22, 68, 39], [72, 12, 96])
    shuffle([10, 79, 89])
    return sMaxScore
if __name__ == '__main__':
    print(Func_main_0())