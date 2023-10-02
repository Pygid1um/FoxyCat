package ds.Anosov.HomeProjects.Calculator;


import java.util.InputMismatchException;
import java.util.Scanner;

public final class ScanningOfMathOperation {

    private static Double firstNumber;
    private static Double secondNumber;
    private static String operation;
    private static String inputNumber;
    private static final Scanner scanner = new Scanner(System.in);

    MethodsOfMathOperations methodsOfMathOperations = new MethodsOfMathOperations();

    public void scanningFirstNumber() {
        do {
            try {
                System.out.print("Введите первое число: ");
                inputNumber = scanner.next();
                firstNumber = Double.parseDouble(inputNumber);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("___Введите число, пожалуйста!___");
                scanner.nextLine(); // Очистить буфер ввода
            }
        } while (firstNumber == null);
    }

    public void scanningSecondNumber() {
        do {
            try {
                System.out.print("Введите второе число: ");
                inputNumber = scanner.next();
                secondNumber = Double.parseDouble(inputNumber);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("___Введите число, пожалуйста!___");
                scanner.nextLine();
            }
        }
        while (secondNumber == null);
    }

    public void scanningOperation() {
        boolean isEnteredOperation = false;
        do {
            try {
                System.out.println("Выберете операцию (+, -, *, /): ");
                operation = scanner.nextLine();
                if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") ||
                        operation.equals("/"))) {
                    throw new InputMismatchException();
                }
                isEnteredOperation = true;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("___Выберете операцию из предложенных!___");
                scanner.nextLine();
            }
        }
        while (!(isEnteredOperation));
        switchOperation();
    }

    private void switchOperation() {
        switch (operation) {
            case "+":
                methodsOfMathOperations.sum(firstNumber, secondNumber);
                break;
            case "-":
                methodsOfMathOperations.subtraction(firstNumber, secondNumber);
                break;
            case "*":
                methodsOfMathOperations.multiplication(firstNumber, secondNumber);
                break;
            case "/":
                methodsOfMathOperations.division(firstNumber, secondNumber);
                break;
        }
    }
}