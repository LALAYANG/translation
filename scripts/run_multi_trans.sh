logdir=GAs
# icl_translation_logs
mkdir -p ${logdir}

models=(
    # "yangccccc/deepseek-coder-trans"
    # "yangccccc/deepseek-coder-reason-new-50"
    # "yangccccc/deepseek-coder-multi"
    # "deepseek-ai/deepseek-coder-6.7b-instruct" 

    "codellama/CodeLlama-13b-Instruct-hf"
    "codellama/CodeLlama-13b-hf"
    "deepseek-ai/deepseek-coder-33b-instruct"
    "WizardLM/WizardCoder-Python-34B-V1.0"
    "codellama/CodeLlama-34b-Instruct-hf"
    "WizardLM/WizardCoder-15B-V1.0"
    "bigcode/starcoder2-15b"
    "semcoder/semcoder"
    "deepseek-ai/deepseek-coder-6.7b-instruct"
    "deepseek-ai/deepseek-coder-6.7b-base"

    # gpt-4o-2024-05-13
)

versions=(
    "v0-Python-code"
    "v1-Python-code"
    "v2-Python-code"
    "before-Python/code/"
)

timestamp=$(date +"%Y%m%d_%H%M%S")

kill_yang_java_processes() {
    echo "Killing all running Java processes for user 'yang'..."
    ps aux | grep "^yang" | grep "java " | awk '{print $2}' | xargs -r kill -9
    echo "All Java processes for 'yang' have been killed."
}

for version in "${versions[@]}"; do
    echo "Running version: $version"
    dest="/home/ubuntu/translation/dataset/Intermediate/Translation/Avatar/Python/code"
    rm -rf "${dest}"
    cp -r "/home/ubuntu/translation/dataset/Intermediate/Translation/Avatar/${version}" "${dest}"
    ls "${dest}"|wc -l

    for model in "${models[@]}"; do
        if [ "$version" == "v0-Python-code" ]; then
            if [ "$model" == "codellama/CodeLlama-13b-Instruct-hf" ]; then
                continue
            fi
            if [ "$model" == "codellama/CodeLlama-13b-hf" ]; then
                continue
            fi
            if [ "$model" == "deepseek-ai/deepseek-coder-33b-instruct" ]; then
                continue
            fi
            if [ "$model" == "codellama/CodeLlama-34b-Instruct-hf" ]; then
                continue
            fi
            if [ "$model" == "WizardLM/WizardCoder-Python-34B-V1.0" ]; then
                continue
            fi
        fi
        echo "Running model: $model"
        bash -x run_SR.sh "$model" |& tee ${logdir}/"${version//\//_}_${model//\//_}_${timestamp}.log"
        kill_yang_java_processes
    done

    echo "All models for version '$version' have been run."
    mv /home/ubuntu/translation/Experiment_Results "${logdir}/Experiment_Results_${version//\//_}"

done


