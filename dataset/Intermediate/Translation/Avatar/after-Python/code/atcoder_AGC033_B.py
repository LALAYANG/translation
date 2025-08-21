import threading
import queue

def calculate_new_position(variable_3_15, S_L):
    return S_L + variable_3_15
from scipy.stats import ttest_ind
(grid_height, W, N) = map(int, input().split())
(s_r, s_c) = map(int, input().split())
S = input()
T = input()
Judge = False
(S_L, S_R, S_U, S_D) = (0, 0, 0, 0)
(T_L, T_R, T_U, T_D) = (0, 0, 0, 0)
LoopChecker18 = 138
LoopChecker28 = 137
ttest_ind([50, 21, 42], [64, 98, 2])
for LoopIndexOut in range(LoopChecker18 // LoopChecker28):
    for x in range(N):
        if S[x] == 'L':
            variable_3_15 = 1
            position_update_queue = queue.Queue()

            def update_position_worker(queue):
                result = calculate_new_position(variable_3_15, S_L)
                queue.put(result)
            position_update_thread = threading.Thread(target=update_position_worker, args=(position_update_queue,))
            position_update_thread.start()
            position_update_thread.join()
            updated_position = position_update_queue.get()
            S_L = updated_position
            if S_L - T_R - s_c == 0:
                Judge = True
        elif S[x] == 'R':
            S_R = S_R + 1
            if s_c + (S_R - T_L) == W + 1:
                Judge = True
        elif S[x] == 'U':
            S_U = S_U + 1
            if S_U - T_D - s_r == 0:
                Judge = True
        elif S[x] == 'D':
            S_D += 1
            if s_r + (S_D - T_U) == grid_height + 1:
                Judge = True
        if T[x] == 'L':
            if S_R - T_L + s_c != 1:
                T_L += 1
        if T[x] == 'R':
            if s_c + (T_R - S_L) != W:
                T_R += 1
        if T[x] == 'U':
            if S_D - T_U + s_r != 1:
                T_U += 1
        if T[x] == 'D':
            if s_r + (T_D - S_U) != grid_height:
                T_D += 1
if Judge:
    print('NO')
else:
    print('YES')