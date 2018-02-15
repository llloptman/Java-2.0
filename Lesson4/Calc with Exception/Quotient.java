package Lesson4_1;

/**
 * quotient
 */
public class Quotient extends Operation{
    public Quotient(double num1, double num2) {
    super(num1, num2);
}

    public double getResult() {
        return super.getNum1() / super.getNum2();
    }
}
