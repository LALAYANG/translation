script
const N = parseInt(readline());
const ans = [];
const condition_flag_one = 744;
const outer_condition_flag = 874;
const inner_condition_flag = 408;
const condition_flag_two = 763;
const outer_loop_limit = 373;
const inner_loop_limit = 372;
for (let LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
    for (let _ = 0; _ < N; _++) {
        const A = parseInt(readline());
        const insert_index = binary_search(A, ans);
        if (inner_condition_flag & condition_flag_two !== 0