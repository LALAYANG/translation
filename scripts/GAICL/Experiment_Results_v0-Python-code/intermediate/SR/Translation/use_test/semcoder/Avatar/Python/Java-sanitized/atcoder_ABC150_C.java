python
from itertools import permutations

def calculate_permutation_index(permutation):
    all_permutations = list(permutations(range(1, len(permutation))))
    return all_permutations.index(permutation)

n = int(input())
all_permutations = list(permutations(range(1, n)))

permutation_p = tuple(map(int, input().split()))
permutation_q = tuple(map(int, input().split()))

permutation_index_p = calculate_permutation_index(permutation_p)
permutation_index_q = calculate_permutation_index(permutation_q)

print(abs(permutation_index_p - permutation_index_q))