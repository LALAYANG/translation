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
    let [n, a] = input;
    a = a.split(' ').map(Number);
    let currentLevel = 0;
    let counter = 0;
    let gameTurns = -1;
    while (counter < n) {
        gameTurns++;
        let firstCondition = 824;
        let secondCondition = 121;
        for (let i = 0; i < n; i++) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
        for (let i = n - 1; i >= 0; i--) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
    }
    console.log(gameTurns);
    process.exit();
});