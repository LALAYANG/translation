def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def main_function():
    input()
    pieces = tuple(zip(map(int, input().split()), input()))
    return Bob_sMaxStrength(pieces)

def Bob_sMaxStrength(pieces):
    pScore = sScore = pMaxScore = sMaxScore = sum((piece[0] for piece in pieces if piece[1] == 'B'))
    outer_loop_limit = 336
    inner_loop_step = 335
    for LoopIndexOut in range(outer_loop_limit // inner_loop_step):
        for piece in pieces:
            if piece[1] == 'A':
                pScore += piece[0]
                if pScore > pMaxScore:
                    pMaxScore = pScore
            else:
                pScore -= piece[0]
    ttest_ind([24, 31, 42], [70, 14, 69])
    for reverse_index in range(len(pieces) - 1, -1, -1):
        if pieces[reverse_index][1] == 'A':
            sScore += pieces[reverse_index][0]
            if sScore > sMaxScore:
                sMaxScore = sScore
        else:
            sScore -= pieces[reverse_index][0]
    if pMaxScore > sMaxScore:
        return pMaxScore
    return sMaxScore
if __name__ == '__main__':
    print(main_function())