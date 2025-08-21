import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.distribution.TDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.util.FastMath;

public class atcoder_ARC086_B {
    private static final int MAX_RECURSION_LIMIT = 10000000;
    private static final int DEFAULT_RECURSION_LIMIT = 1000;

    private static final int DEFAULT_THREAD_POOL_SIZE = 10;

    private static final int DEFAULT_QUEUE_SIZE = 1000;

    private static final int DEFAULT_MAX_VALUE = 1000000;

    private static final int DEFAULT_MAX_SIGN = 1000000;

    private static final int DEFAULT_MAX_INDEX = -1;

    private static final int DEFAULT_LOOP_COUNTER = 367;

    private static final int DEFAULT_LOOP_LIMIT = 366;

    private static final int DEFAULT_STEP = 1;

    private static final int DEFAULT_STOP = 0;

    private static final int DEFAULT_TIMEOUT = 1000;

    private static final int DEFAULT_SLEEP_TIME = 280;

    private static final int DEFAULT_SHUFFLE_SIZE = 37;

    private static final int DEFAULT_FERNET_KEY_SIZE = 128;

    private static final int DEFAULT_FERNET_KEY_ITERATIONS = 1000;

    private static final int DEFAULT_FERNET_KEY_LENGTH = 16;

    private static final int DEFAULT_FERNET_KEY_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TYPE = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_ALGORITHM = 1;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_SEED = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_NONCE = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_IV = 123456789;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG = 16;

    private static final int DEFAULT_FERNET_KEY_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_LENGTH_TAG_TYPE = 1;

    private static final int DEFAULT_