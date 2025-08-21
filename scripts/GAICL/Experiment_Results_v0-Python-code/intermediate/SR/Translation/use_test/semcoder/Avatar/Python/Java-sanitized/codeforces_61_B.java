python
def solve():
    team_names = []

    def read_team_names(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        team_names.append(f(input()))
        read_team_names(i + step, stop, step)
    read_team_names(0, 3, 1)
    team_permutations = itertools.permutations(team_names, len(team_names))
    team_names = []
    for i in team_permutations:
        team_names.append(''.join(i))

    def check_submissions(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if f(instr()) in team_names:
            print('ACC')
        else:
            print('WA')
        check_submissions(i + step, stop, step)
    check_submissions(0, inp(), 1)
if __name__ == '__main__':
    solve()