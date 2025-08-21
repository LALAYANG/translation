script
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
rl.on('line', function (line) {
    input.push(line);
}).on('close', function () {
    let [n, m] = input[0].split(' ').map(Number);
    let round_complexity = input[1].split(' ').map(Number);
    let george_complexity = input[2].split(' ').map(Number);
    let index = 0;
    let j = 0;
    while (index < n && j < m) {
        if (round_complexity[index] <= george_complexity[j]) {
            index++;
        }
        j++;
    }
    console.log(n - index);
    process.exit();
});