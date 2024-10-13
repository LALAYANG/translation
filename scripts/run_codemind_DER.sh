OutputDir=$1
Times=$2

Models=(ise-uiuc/Magicoder-S-DS-6.7B codellama/CodeLlama-13b-Instruct-hf bigcode/starcoder deepseek-ai/deepseek-coder-6.7b-instruct)
Datasets=(CodeNet Avatar)
SRC_LANG=Python
TGT_LANG=Java
TASK=Translation
CheckpointsDir=/home/shared/huggingface

MainDir=/home/yang/CodeMind/scripts
run_DER=${MainDir}/run_DER.sh

echo STARTING at $(date)
git rev-parse HEAD

cd ${MainDir}

DER(){
    for Model in ${Models[@]}; do
	for Dataset in ${Datasets[@]}; do
	    for i in $(seq 1 ${Times}); do
		timeStamp=$(echo -n $(date "+%Y-%m-%d %H:%M:%S") | shasum | cut -f 1 -d " ")
		OutputDir=Outputs/IER/${Dataset}/${Model}/${PL}/${timeStamp}
		mkdir -p ${OutputDir}
		bash -x ${run_DER} ${Model} ${Dataset} ${CheckpointsDir} ${TASK} ${SRC_LANG} ${TGT_LANG} |& tee ${OutputDir}/${timeStamp}.log
		mv /home/yang/CodeMind/Experiment_Results ${OutputDir}
	    done
	done
    done
}

DER
echo END at $(date)
