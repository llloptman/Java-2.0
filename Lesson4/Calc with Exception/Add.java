package Lesson4_1;

/**
 * addition
 */
public class Add extends Operation {
    public Add(double num1, double num2) {
        super(num1, num2);
    }

    public double getResult() {
        return super.getNum1() + super.getNum2();
    }
}
