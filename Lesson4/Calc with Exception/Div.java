package Lesson4_1;

/**
 * divide
 */

public class Div extends Operation {
    public Div(double num1, double num2) {
        super(num1, num2);
    }

    public double getResult() {
        return super.getNum1() - super.getNum2();
    }
}
