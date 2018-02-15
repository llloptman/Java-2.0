package Lesson4_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * IncorrectOperationException added
 * Added check for incorrect answer to exit the program
 * Check for InputMismatchException is corrected
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            try {
                System.out.print("Input first number: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Input second number: ");
                double secondNumber = scanner.nextDouble();
                System.out.print("Choose operation (+,-,*,/): ");
                char op = scanner.next().charAt(0);
                Calc calc = new Calc(op, firstNumber, secondNumber);

            } catch (InputMismatchException a){
                System.out.print("Incorrect number format: ");
                a.printStackTrace();
                break;
            } catch (IncorrectOperationException b) {
                b.printStackTrace();
                break;
            }


            System.out.println("Continue? Y/N");
            char answer = scanner.next().charAt(0);

            switch (answer){
                case 'Y':
                    flag = true;
                    break;
                case 'N':
                    flag = false;
                    break;
                default:

                    System.out.print("Incorrect answer: ");
                    throw new IllegalArgumentException();
            }
        }
    }
}