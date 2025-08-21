checkOne = 71
checkOneB = 117
checkTwoA = 677
checkTwoB = 797
checkThreeA = 407
checkThreeB = 228
moves = input()
(x, current_y) = (0, 0)
d_movement = {'L': (0, -1), 'R': (0, 1), 'U': (1, 0), 'D': (-1, 0)}
d = {(x, current_y): ''}
bug_found = False
firstCheck = 540
checkTwo = 650
for move in moves:
    temp = (x, current_y)
    x += d_movement[move][0]
    current_y += d_movement[move][1]
    if firstCheck & checkTwo:
        if (x, current_y) not in d:
            for step in d_movement:
                if (x + d_movement[step][0], current_y + d_movement[step][1]) != temp and (x + d_movement[step][0], current_y + d_movement[step][1]) in d:
                    bug_found = True
                    break
        else:
            bug_found = True
    if bug_found:
        break
    d[x, current_y] = ''
if checkOne & checkOneB:
    if checkTwoA & checkTwoB:
        if checkThreeA & checkThreeB:
            if bug_found:
                print('BUG')
            else:
                print('OK')