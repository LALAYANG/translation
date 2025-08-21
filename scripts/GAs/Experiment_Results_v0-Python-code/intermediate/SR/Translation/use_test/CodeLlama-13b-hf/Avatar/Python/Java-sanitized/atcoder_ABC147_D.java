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
    let array_size = parseInt(input[0]);
    let A = input[1].split(' ').map(Number);
    let xor_sum = 0;
    A.sort((a, b) => a - b);
    for (let i = 0; i < 60; i++) {
        let bit_count = 0;
        for (let j = 0; j < array_size; j++) {
            if ((A[j] >> i & 1) == 1) {
                bit_count++;
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << i)) % 1000000007;
    }
    console.log(xor_sum);
    process.exit();
});