package Lesson4_1;

    /**
     * multiplication
     */

    public class Mult extends Operation {
        public Mult(double num1, double num2) {
            super(num1, num2);
        }

        public double getResult() {
            return super.getNum1() * super.getNum2();
        }
    }

