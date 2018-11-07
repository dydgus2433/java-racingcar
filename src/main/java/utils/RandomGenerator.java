package utils;

import java.util.Random;

public class RandomGenerator {
    public static final Random random = new Random();
    public static final int getRandomNum(int bound ) {
        return random.nextInt(bound);
    }
}
