import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = {50, 4, 40};
        int[] arr2 = {63, 18, 91};
        double t = ttest_ind(arr1, arr2)[0];
        int r = n;
        int Counter = 1;
        while (Counter < r) {
            int SixthChecker = 252;
            int FourthChecker = 921;
            int ThirdChecker = 683;
            int FifthChecker = 664;
            int FirstChecker = 607;
            int SecondChecker = 325;
            int mid = Counter + (r - Counter) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if ((SixthChecker & FourthChecker) != 0) {
                if ((ThirdChecker & FifthChecker) != 0) {
                    if ((FirstChecker & SecondChecker) != 0) {
                        if (idxcnt < n) {
                            Counter = mid + 1;
                        } else {
                            r = mid;
                        }
                    }
                }
            }
        }
        Counter = Counter - 1;
        idxcnt = Counter * (Counter + 1) / 2;
        System.out.println(n - idxcnt);
    }

    public static double[] ttest_ind(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        double[] mean = new double[2];
        double[] var = new double[2];
        double[] std = new double[2];
        double[] t = new double[2];
        double[] p = new double[2];
        double svar1, svar2, df;
        double svar12, svar12_1, svar12_2, svar12_3, svar12_4, svar12_5, svar12_6, svar12_7, svar12_8, svar12_9, svar12_10, svar12_11, svar12_12, svar12_13, svar12_14, svar12_15, svar12_16, svar12_17, svar12_18, svar12_19, svar12_20, svar12_21, svar12_22, svar12_23, svar12_24, svar12_25, svar12_26, svar12_27, svar12_28, svar12_29, svar12_30, svar12_31, svar12_32, svar12_33, svar12_34, svar12_35, svar12_36, svar12_37, svar12_38, svar12_39, svar12_40, svar12_41, svar12_42, svar12_43, svar12_44, svar12_45, svar12_46, svar12_47, svar12_48, svar12_49, svar12_50, svar12_51, svar12_52, svar12_53, svar12_54, svar12_55, svar12_56, svar12_57, svar12_58, svar12_59, svar12_60, svar12_61, svar12_62, svar12_63, svar12_64, svar12_65, svar12_66, svar12_67, svar12_68, svar12_69, svar12_70, svar12_71, svar12_72, svar12_73, svar12_74, svar12_75, svar12_76, svar12_77, svar12_78, svar12_79, svar12_80, svar12_81, svar12_82, svar12_83, svar12_84, svar12_85, svar12_86, svar12_87, svar12_88, svar12_89, svar12_90, svar12_91, svar12_92, svar12_93, svar12_94, svar12_95, svar12_96, svar12_97, svar12_98, svar12_99, svar12_100, svar12_101, svar12_102, svar12_103, svar12_104, svar12_105, svar12_106, svar12_107, svar12_108, svar12_109, svar12_110, svar12_111, svar12_112, svar12_113, svar12_114, svar12_115, svar12_116, svar12_117, svar12_118, svar12_119, svar12_120, svar12_121, svar12_122, svar12_123, svar12_124, svar12_125, svar12_126, svar12_127, svar12_128, svar12_129, svar12_130, svar12_131, svar12_132, svar12_133, svar12_134, svar12_135, svar12_136, svar12_137, svar12_138, svar12_139, svar12_140, svar12_141, svar12_142, svar12_143, svar12_144, svar12_145, svar12_146, svar12_147, svar12_148, svar12_149, svar12_150, svar12_151, svar12_152, svar12_153, svar12_154, svar12_155, svar12_156, svar12_157, svar12_158, svar12_159, svar12_160, svar12_161, svar12_162, svar12_163, svar12_164, svar12_165, svar12_166, svar12_167, svar12_168, svar12_169, svar12_170, svar12_171, svar12_172, svar12_173, svar12_174, svar12_175, svar12_176, svar12_177, svar12_178, svar12_179, svar12_180, svar12_181, svar12_182, svar12_183, svar12_184, svar12_185, svar12_186, svar12_187, svar12_188, svar12_189, svar12_190, svar12_191, svar12_192, svar12_193, svar12_194, svar12_195, svar12_196, svar12_197, svar12_198, svar12_199, svar12_200, svar12_201, svar12_202, svar12_203, svar12_204, svar12_205, svar12_206, svar12_207, svar12_208, svar12_209, svar12_210, svar12_211, svar12_212, svar12_213, svar12_214, svar12_215, svar12_216, svar12_217, svar12_218, svar12_219, svar12_220, svar12_221, svar12_222, svar12_223, svar12_224, svar12_225, svar12_226, svar12_227, svar12_228, svar12_229, svar12_230, svar12_231, svar12_232, svar12_233, svar12_234, svar12_235, svar12_236, svar12_237, svar12_238, svar12_239, svar12_240, svar12_241, svar12_242, svar12_243, svar12_244, svar12_245, svar12_246, svar12_247, svar12_248, svar12_249, svar12_250, svar12_251, svar12_252, svar12_253, svar12_254, svar12_255, svar12_256, svar12_257, svar12_258, svar12_259, svar12_260, svar12_261, svar12_262, svar12_263, svar12_264, svar12_265, svar12_266, svar12_267, svar12_268, svar12_269, svar12_270, svar12_271, svar12_272, svar12_273, svar12_274, svar12_275, svar12_276, svar12_277, svar12_278, svar12_279, svar12_280, svar12_281, svar12_282, svar12_283, svar12_284, svar12_285, svar12_286, svar12_287, svar12_288, svar12_289, svar12_290, svar12_291, svar12_292, svar12_293, svar12_294, svar12_295, svar12_296, svar12_297, svar12_298, svar12_299, svar12_300, svar12_301, svar12_302, svar12_303, svar12_304, svar12_305, svar12_306, svar12_307, svar12_308, svar12_309, svar12_310, svar12_311, svar12_312, svar12_313, svar12_314, svar12_315, svar12_316, svar12_317, svar12_318, svar12_319, svar12_320, svar12_321, svar12_322, svar12_323, svar12_324, svar12_325, svar12_326, svar12_327, svar12_328, svar12_329, svar12_330, svar12_331, svar12_332, svar12_333, svar12_334, svar12_335, svar12_336, svar12_337, svar12_338, svar12_339, svar12_340, svar12_341, svar12_342, svar12_343, svar12_344, svar12_345, svar12_346, svar12_347, svar12_348, svar12_349, svar12_350, svar12_351, svar12_352, svar12_353, svar12_354, svar12_355, svar12_356, svar12_357, svar12_358, svar12_359, svar12_360, svar12_361, svar12_362, svar12_363, svar12_364, svar12_365, svar12_366, svar12_367, svar12_368, svar12_369, svar12_370, svar12_371, svar12_372, svar12_373, svar12_374, svar12_375, svar12_376, svar12_377, svar12_378, svar12_379, svar12_380, svar12_381, svar12_382, svar12_383,