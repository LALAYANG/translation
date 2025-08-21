script

const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];

rl.on('line', function (line) {
    input.push(line);
}).on('close', function () {
    let [n, m] = input[0].split(' ').map(Number);
    let c = [];
    for (let i = 1; i <= n; i++) {
        let s = input[i];
        let index = s.indexOf('S');
        if (index != -1) {
            c.push(index - s.indexOf('G') + 1);
        } else {
            c.push(-1);
        }
    }
    let flag = 0;
    for (let i = 0; i < n; i++) {
        if (c[i] == -1) {
            flag = 1;
            break;
        }
    }
    if (flag) {
        console.log(-1);
    } else {
        let count = 0;
        for (let i = 0; i < n; i++) {
            if (c[i] != -1) {
                count++;
            }
        }
        console.log(count);
    }
    process.exit();
});