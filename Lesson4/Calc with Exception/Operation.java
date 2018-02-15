package Lesson4_1;

public abstract class Operation implements IOperation{
    private double num1;
    private double num2;

    public Operation (double num1, double num2){
        setNum1(num1);
        setNum2(num2);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}