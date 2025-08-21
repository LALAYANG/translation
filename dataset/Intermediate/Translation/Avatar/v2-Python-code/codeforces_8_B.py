checkFlagG = 322
checkFlagD = 882
checkFlagC = 52
intermediateResultFlag = 357
intermediateCheckFlag = 451
checkFlagB = 455
movementRecord = input()
(x, y) = (0, 0)
d_movement = {'L': (0, -1), 'R': (0, 1), 'U': (1, 0), 'D': (-1, 0)}
visited = {(x, y): ''}
bug = False
checkFlagA = 545
checkFlagE = 653
intermediateResultFlag2 = 566
checkFlagF = 280
for move in movementRecord:
    temp = (x, y)
    x += d_movement[move][0]
    y += d_movement[move][1]
    if intermediateResultFlag2 & checkFlagF:
        if checkFlagA & checkFlagE:
            if (x, y) not in visited:
                for step in d_movement:
                    if (x + d_movement[step][0], y + d_movement[step][1]) != temp and (x + d_movement[step][0], y + d_movement[step][1]) in visited:
                        bug = True
                        break
            else:
                bug = True
    if bug:
        break
    visited[x, y] = ''
if checkFlagG & checkFlagD:
    if checkFlagC & intermediateResultFlag:
        if intermediateCheckFlag & checkFlagB:
            if bug:
                print('BUG')
            else:
                print('OK')