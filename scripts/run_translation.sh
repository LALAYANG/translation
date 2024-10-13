OutputsDir=$1
Times=$2

Models=(bigcode/starcoder2-15b)
# deepseek-ai/deepseek-coder-6.7b-base deepseek-ai/deepseek-coder-6.7b-instruct codellama/CodeLlama-13b-Instruct-hf WizardLM/WizardCoder-15B-V1.0 deepseek-ai/deepseek-coder-33b-instruct codellama/CodeLlama-34b-Instruct-hf bigcode/starcoder2-15b WizardLMTeam/WizardCoder-33B-V1.1 codellama/CodeLlama-70b-Instruct-hf codellama/CodeLlama-13b-hf)
#    
Datasets=(Avatar)
PL=Python
CheckpointsDir=/home/shared/huggingface

MainDir=/home/yang/CodeMind/scripts
run_SR=${MainDir}/run_SR.sh
mkdir -p ${OutputsDir}

echo STARTING at $(date)
git rev-parse HEAD

cd ${MainDir}

SR(){
    for Model in ${Models[@]}; do
	for Dataset in ${Datasets[@]}; do
	    for i in $(seq 1 ${Times}); do
		timeStamp=$(echo -n $(date "+%Y-%m-%d %H:%M:%S") | shasum | cut -f 1 -d " ")
		OutputDir=${OutputsDir}/Translation/${Dataset}/${Model}/${PL}/${timeStamp}
		mkdir -p ${OutputDir}
		bash -x ${run_SR} ${Model} ${Dataset} ${CheckpointsDir} Translation Python Java |& tee ${OutputDir}/${timeStamp}.log
		cp -r /home/yang/CodeMind/Experiment_Results ${OutputDir}
	    done
	done
    done
}

SR
echo END at $(date)
