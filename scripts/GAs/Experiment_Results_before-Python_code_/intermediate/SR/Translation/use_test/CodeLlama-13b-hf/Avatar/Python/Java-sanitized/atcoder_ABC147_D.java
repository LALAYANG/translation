script

const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const N = parseInt(input[0]);
const A = input[1].split(' ').map(Number);
let result = 0;
for (let b = 0; b < 60; b++) {
    let bs = 0;
    for (let i = 0; i < N; i++) {
        if ((A[i] & (1 << b)) != 0) {
            bs++;
        }
    }
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
}
console.log(result);