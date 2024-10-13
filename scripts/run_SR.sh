model=$1
dataset=$2
cache=$3
task=$4
src=$5
tgt=$6

if [ $task == "Synthesis" ]; then
    python3 synthesis.py --model $model --dataset $datset --cache $cache ---$sr_type
    python3 clean_generations_synthesis.py --model $model --dataset $dataset --$sr_type
    python3 test_synthesis.py --model $model --dataset $dataset --$sr_type --test_one
else
    python3 translate.py  --model $model --dataset $dataset --source_lang $src --target_lang $tgt --cache_dir $cache --use_test
    python3 clean_generations_translation.py --model $model --dataset $dataset --source_lang $src --target_lang $tgt --remove_prompt --use_test
    python3 -u test_translation.py --dataset $dataset --source_lang $src --target_lang $tgt --model $model --test_type use_test

fi
