package Lesson4_1;
/**
 * calculate of input
 */

public class Calc {
    private Operation result;

    public Calc (char op, double num1, double num2) throws IncorrectOperationException {

        switch (op) {

            case '+':
                result = new Add(num1, num2);
                break;
            case '-':
                result = new Div(num1, num2);
                break;
            case '*':
                result = new Mult(num1, num2);
                break;
            case '/':
                result = new Quotient(num1, num2);
                break;
            default:

                throw new IncorrectOperationException(op);
        }
        System.out.println(result.getResult());
    }

}
