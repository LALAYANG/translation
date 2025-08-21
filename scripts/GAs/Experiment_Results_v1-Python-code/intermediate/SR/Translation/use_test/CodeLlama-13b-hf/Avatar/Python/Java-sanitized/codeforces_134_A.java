script
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const lines = input.split('\n');

const n = Number(lines.shift());
const w = lines.shift().split(' ').map(Number);
let x = 0;
for (let i = 0; i < n; i++) {
    x += w[i];
}
const resultIndices = [];
const conditionChecker = 355;
const newConditionChecker = 753;
const newLoopChecker = 663;
const