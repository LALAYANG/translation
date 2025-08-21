script
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (vamshi, z) => {
  console.log((vamshi / z + 1) * z);
  rl.close();
});