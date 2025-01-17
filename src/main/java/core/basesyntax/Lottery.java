package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private final ColorSupplier color;

    public Lottery(ColorSupplier color) {
        this.color = color;
    }

    public Ball getRandomBall() {

        int number = new Random().nextInt(MAX_NUMBER);

        return new Ball(color.getRandomColor(), number);
    }
}
