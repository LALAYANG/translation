script
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
rl.on('line', function (line) {
    input.push(line);
})
    .on('close', function () {
        let n = parseInt(input[0]);
        let l = input[1].split(' ').map(Number);
        let high = 1;
        let tower = n;
        let maximum = 1;
        l.sort((a, b) => a - b);
        for (let i = 1; i < n; i++) {
            if (l[i] == l[i - 1]) {
                tower--;
                high++;
            } else {
                if (high > maximum) {
                    maximum = high;
                }
                high = 1;
            }
        }
        if (high > maximum) {
            maximum = high;
        }
        console.log(maximum + ' ' + tower);
        process.exit();
    });