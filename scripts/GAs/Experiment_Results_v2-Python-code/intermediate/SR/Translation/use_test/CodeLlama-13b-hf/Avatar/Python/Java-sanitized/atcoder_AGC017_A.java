script
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
const [N, P] = input.split(' ').map(Number);
const lis = input.split(' ').map(Number);
let one = 0;
let zero = 0;
lis.forEach(a => {
  if (a % 2 == 1) {
    one += 1;
  } else {
    zero += 1;
  }
});
let pattern_a = 0;
let even_combinations = 0;
for (let i = 0; i <= zero; i++) {
  even_combinations += combi(zero, i);
}
let time = 0