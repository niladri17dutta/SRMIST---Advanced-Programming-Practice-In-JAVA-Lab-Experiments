package task;

public class SquaringTask implements Task {
    private final int number;

    public SquaringTask(int number) {
        this.number = number;
    }

    @Override
    public void execute() {
        int result = number * number;
        generateReport(result);
    }

    private void generateReport(int result) {
        System.out.println("Task: Squaring " + number);
        System.out.println("Result: " + result);
    }
}
