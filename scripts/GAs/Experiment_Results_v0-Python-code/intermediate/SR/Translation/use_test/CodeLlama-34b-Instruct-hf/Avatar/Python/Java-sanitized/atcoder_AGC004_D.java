import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC004_D {
    private static final int MAX_LOOP_ITERATIONS = 141;
    private static final int LOOP_STEP = 140;

    private static final int[] AAA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private static final int N = AAA.length;
    private static final int K = 3;

    private static final int[] LINKS = new int[N][N];

    private static final int[] HEIGHTS = new int[N];

    private static final int[] CUTS = new int[N];

    private static final int[] CUT_COUNTS = new int[N];

    private static final int[] CUT_HEIGHTS = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_2 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_3 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_4 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_5 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_6 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_7 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_8 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_9 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_10 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_11 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_12 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_13 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_14 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_15 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_16 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_17 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_18 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_19 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_20 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_21 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_22 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_23 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_24 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_25 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_26 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_27 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_28 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_29 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_30 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_31 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_32 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_33 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_34 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_35 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_36 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_37 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_38 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_39 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_40 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_41 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_42 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_43 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_44 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_45 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_46 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_47 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_48 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_49 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_50 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_51 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_52 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_53 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_54 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_55 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_56 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_57 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_58 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_59 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_60 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_61 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_62 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_63 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_64 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_65 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_66 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_67 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_68 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_69 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_70 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_71 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_72 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_73 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_74 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_75 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_76 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_77 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_78 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_79 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_80 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_81 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_82 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_83 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_84 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_85 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_86 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_87 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_88 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_89 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_90 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_91 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_92 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_93 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_94 = new int[N];

    private static final int[] CUT_COUNT_HEIGHTS_95