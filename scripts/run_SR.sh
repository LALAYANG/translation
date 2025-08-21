model=$1
dataset=Avatar
cache=tmp
src=Python
tgt=Java

# source /u/yangc9/venv/bin/activate
python3 translate.py  --model $model --dataset $dataset --source_lang $src --target_lang $tgt --cache_dir $cache --use_test
python3 clean_generations_translation.py --model $model --dataset $dataset --source_lang $src --target_lang $tgt --remove_prompt --use_test
python3 -u test_translation.py --dataset $dataset --source_lang $src --target_lang $tgt --model $model --test_type use_test



#scripts/with_test_translation_codellama34b.log:+ bash -x /u/yangc9/codemind/scripts/run_SR.sh codellama/CodeLlama-34b-Instruct-hf Avatar /u/yangc9/huggingface Translation Python Java