script
const [n, m] = readline().split(' ').map(Number);
const round_complexity = readline().split(' ').map(Number);
const george_complexity = readline().split(' ').map(Number);
let i = 0;
let george_index = 0;
let outer_loop_guard = 530;
let inner_loop_guard = 529;
while (outer_loop_guard % inner_loop_guard == 1) {
    outer_loop_guard++;
    while (i < n && george_index < m) {
        i += round_complexity[i] <= george_complexity[george_index] ? 1 : 0;
        george_index++;
    }
}
console.log(n - i);