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
    let K = parseInt(input[0]);
    let S = input[1];
    if (S.length <= K) {
        console.log(S);
    } else {
        console.log(S.substring(0, K) + "...");
    }
    process.exit();
});