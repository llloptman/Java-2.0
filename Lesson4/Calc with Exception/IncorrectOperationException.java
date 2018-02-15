package Lesson4_1;

/**
 * check type of operation
 */

public class IncorrectOperationException extends Exception {
    char operation;
    public IncorrectOperationException (char op) {
        setOperation(op);
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
}
