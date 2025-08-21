import threading
import queue

def calculate_sum(S_L, value_to_add):
    return S_L + value_to_add
(H, W, N) = map(int, input().split())
(s_r, s_c) = map(int, input().split())
S = input()
T = input()
Judge = False
(S_L, S_R, current_up_moves, S_D) = (0, 0, 0, 0)
(T_L, T_R, T_U, T_D) = (0, 0, 0, 0)
inner_loop_bound = 93
outer_loop_bound = 92
for LoopIndexOut in range(inner_loop_bound // outer_loop_bound):
    for x in range(N):
        if S[x] == 'L':
            value_to_add = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(S_L, value_to_add)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            sum_result = queue_calculate_sum0.get()
            S_L = sum_result
            if S_L - T_R - s_c == 0:
                Judge = True
        elif S[x] == 'R':
            S_R += 1
            if s_c + (S_R - T_L) == W + 1:
                Judge = True
        elif S[x] == 'U':
            current_up_moves += 1
            if current_up_moves - T_D - s_r == 0:
                Judge = True
        elif S[x] == 'D':
            S_D += 1
            if s_r + (S_D - T_U) == H + 1:
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
            if s_r + (T_D - current_up_moves) != H:
                T_D += 1
if Judge:
    print('NO')
else:
    print('YES')