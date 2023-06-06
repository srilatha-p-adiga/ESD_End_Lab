package week7;

public class Consumer implements Runnable {
    private NumberGenerator numberGenerator;

    public Consumer(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void run() {
        for (int i = 1; i <= 9; i++) {
            numberGenerator.take();
        }
    }
}
