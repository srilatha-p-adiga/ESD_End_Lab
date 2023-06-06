package week7;

public class Producer implements Runnable {
    private NumberGenerator numberGenerator;

    public Producer(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void run() {
        for (int i = 1; i <= 9; i++) {
            numberGenerator.put();
        }
    }
}
