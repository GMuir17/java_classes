public class Calculator {
    private int firstNumber;
    private int secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public int firstNumber() {
        return this.firstNumber;
    }

    public int secondNumber() {
        return this.secondNumber;
    }
}
