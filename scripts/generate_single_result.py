import ast
import os
import csv

def parse(log_path, samples):
    correct = 0
    correct_instances = []
    samples_correct_instances = []
    with open(log_path, 'r') as file:
        for line in file:
            if line.startswith("Correct_Instance"):
                correct_instances = ast.literal_eval(line.split(":")[-1])
                # print(correct_instances)
    for instance in samples:
        if instance in correct_instances:
            correct += 1
            samples_correct_instances.append(instance)
    print(log_path, samples_correct_instances)
    return correct

models_files = {
    "deepseek-coder-6.7b-base-1": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/deepseek-ai/deepseek-coder-6.7b-base/Python/2715821017eee31180b96abae00efaaa8190d3d4/2715821017eee31180b96abae00efaaa8190d3d4.log",
    "deepseek-coder-6.7b-base-2": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/deepseek-ai/deepseek-coder-6.7b-base/Python/ab78aa565f78279473719c74382cf3ca019a24fa/ab78aa565f78279473719c74382cf3ca019a24fa.log",
    "deepseek-coder-6.7b-base-3": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/deepseek-ai/deepseek-coder-6.7b-base/Python/fb04ceb0e822535bc7fca0c9004055f46052fde8/fb04ceb0e822535bc7fca0c9004055f46052fde8.log",
    "deepseek-coder-6.7b-instruct-1": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/deepseek-ai/deepseek-coder-6.7b-instruct/Python/076583097377e7997e4660649a2db512589ad6a3/076583097377e7997e4660649a2db512589ad6a3.log",
    "deepseek-coder-6.7b-instruct-2": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/deepseek-ai/deepseek-coder-6.7b-instruct/Python/a0637dec285c19065a14319a6ba6811837bb7947/a0637dec285c19065a14319a6ba6811837bb7947.log",
    "deepseek-coder-6.7b-instruct-3": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/deepseek-ai/deepseek-coder-6.7b-instruct/Python/be556dd3c404ff069b68fbb71ac3306d7608c763/be556dd3c404ff069b68fbb71ac3306d7608c763.log",
    # "CodeLlama-13b-hf": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/codellama/CodeLlama-13b-hf/Python/8b7531dd0d1fbb04635fd77c39d0d8e85f5b0f85/8b7531dd0d1fbb04635fd77c39d0d8e85f5b0f85.log",
    # "CodeLlama-13b-hf": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/codellama/CodeLlama-13b-hf/Python/8e80e55c661e0c32c84e9e69dd29c85addaf7e44/8e80e55c661e0c32c84e9e69dd29c85addaf7e44.log",
    # "CodeLlama-13b-hf": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/codellama/CodeLlama-13b-hf/Python/d3a4c40b112cb17638734de3df0b1094cb228236/d3a4c40b112cb17638734de3df0b1094cb228236.log",
    "CodeLlama-13b-Instruct-hf-1": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/codellama/CodeLlama-13b-Instruct-hf/Python/0dc61ee31d6b86c8f87ffbf19a9b48e8b1400fe4/0dc61ee31d6b86c8f87ffbf19a9b48e8b1400fe4.log",
    "CodeLlama-13b-Instruct-hf-2": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/codellama/CodeLlama-13b-Instruct-hf/Python/c398de51013e0a1bd6b4abd3595ad3686d9128aa/c398de51013e0a1bd6b4abd3595ad3686d9128aa.log",
    "CodeLlama-13b-Instruct-hf-3": "/home/yang/CodeMind/scripts/outputs/IER/cruxeval/codellama/CodeLlama-13b-Instruct-hf/Python/d0aaf70e292fb07a002a9847665c1baa25c05707/d0aaf70e292fb07a002a9847665c1baa25c05707.log",
}


samples = ['sample_0','sample_410','sample_650','sample_458','sample_332','sample_621','sample_416','sample_152','sample_157','sample_153','sample_226','sample_578','sample_3','sample_361','sample_310','sample_776','sample_397','sample_343','sample_495','sample_682','sample_134','sample_74','sample_281','sample_354','sample_592','sample_454','sample_457','sample_631','sample_688','sample_244','sample_759','sample_526','sample_577','sample_668','sample_379','sample_745','sample_56','sample_628','sample_121','sample_36','sample_741','sample_449','sample_789','sample_598','sample_669','sample_597','sample_52','sample_419','sample_581','sample_738','sample_127','sample_49','sample_460','sample_543','sample_77','sample_648','sample_285','sample_283','sample_714','sample_773','sample_338','sample_365','sample_675','sample_516','sample_21','sample_777','sample_119','sample_117','sample_497','sample_645','sample_32','sample_659','sample_384','sample_624','sample_189','sample_538','sample_710','sample_423','sample_259','sample_6','sample_260','sample_5','sample_356','sample_314','sample_498','sample_67','sample_227','sample_524','sample_535','sample_638','sample_780','sample_179','sample_391','sample_685','sample_757','sample_509','sample_92','sample_182','sample_435','sample_726','sample_493','sample_196','sample_541','sample_489','sample_370','sample_126','sample_282','sample_211','sample_54','sample_401','sample_341','sample_66','sample_147','sample_372','sample_546','sample_790','sample_528','sample_262','sample_694','sample_709','sample_719','sample_571','sample_707','sample_743','sample_409','sample_593','sample_657','sample_357','sample_522','sample_735','sample_197','sample_334','sample_144','sample_748','sample_13','sample_381','sample_158','sample_656','sample_696','sample_586','sample_194','sample_570','sample_582','sample_302','sample_652','sample_440','sample_762','sample_141','sample_203','sample_33','sample_327','sample_308','sample_792','sample_761','sample_439','sample_89','sample_201','sample_395','sample_64','sample_718','sample_103','sample_37','sample_503','sample_700','sample_229','sample_623','sample_549','sample_171','sample_10','sample_673','sample_591','sample_557','sample_580','sample_554','sample_140','sample_468','sample_177','sample_403','sample_613','sample_258','sample_39','sample_295','sample_249','sample_408','sample_320','sample_264','sample_166','sample_660','sample_276','sample_532','sample_479','sample_774','sample_129','sample_7','sample_324','sample_420','sample_782','sample_82','sample_744','sample_97']
for model in models_files:
    correct = parse(models_files[model], samples)
    print("Result", model, correct)
