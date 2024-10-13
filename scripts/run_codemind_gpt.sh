OutputsDir=$1
Times=$2

Models=(gpt-4-turbo)
Datasets=(cruxeval)
PL=Python
CheckpointsDir=/home/shared/huggingface

MainDir=/home/yang/CodeMind/scripts
run_IER=${MainDir}/run_IER.sh
mkdir -p ${OutputsDir}

echo STARTING at $(date)
git rev-parse HEAD

cd ${MainDir}

IER(){
    for Model in ${Models[@]}; do
	for Dataset in ${Datasets[@]}; do
	    for i in $(seq 1 ${Times}); do
		timeStamp=$(echo -n $(date "+%Y-%m-%d %H:%M:%S") | shasum | cut -f 1 -d " ")
		OutputDir=${OutputsDir}/IER/${Dataset}/${Model}/${PL}/${timeStamp}
		mkdir -p ${OutputDir}
		bash -x ${run_IER} ${Model} ${CheckpointsDir} ${Dataset} ${PL} |& tee ${OutputDir}/${timeStamp}.log
		cp -r /home/yang/CodeMind/Experiment_Results ${OutputDir}
	    done
	done
    done
}

IER
echo END at $(date)
