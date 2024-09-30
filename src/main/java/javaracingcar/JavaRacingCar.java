package javaracingcar;

import java.util.Random;

public class JavaRacingCar {

    private int step;
    private Random random;

    private static final int RANDOM_VALUE_RANGE = 10;
    private static final int MIN_MOVING_RANGE = 4;
    private static final int MAX_MOVING_RANGE = 9;

    public JavaRacingCar() {
        this.step = 0;
        this.random = new Random();
    }

    protected int random() {
        int randomValue = random.nextInt(RANDOM_VALUE_RANGE);
        return randomValue;
    }

    protected boolean isMove(int randomValue) {

        if (MIN_MOVING_RANGE <= randomValue && randomValue <= MAX_MOVING_RANGE) {
            return true;
        }

        return false;
    }

    public int step() {
        return this.step;
    }

    public void requireCarCount(int carCount) throws RuntimeException {
        this.step = 1;

        if (carCount < 0) {
            throw new IllegalArgumentException("음수 입력");
        }
    }

    public void requireTryCount(int tryCount) throws RuntimeException {
        this.step = 2;

        if (tryCount < 0) {
            throw new IllegalArgumentException("음수 입력");
        }
    }
}
