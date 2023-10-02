package ds.Anosov.HomeProjects.Calculator;

import java.text.DecimalFormat;

public class MethodsOfMathOperations {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private String result;

    public void sum(Double firstNumber, Double secondNumber) {
        result = decimalFormat.format(firstNumber + secondNumber);
        System.out.println(result);
    }

    public void subtraction(Double firstNumber, Double secondNumber) {
        result = decimalFormat.format(firstNumber - secondNumber);
        System.out.println(result);
    }

    public void multiplication(Double firstNumber, Double secondNumber) {
        result = decimalFormat.format(firstNumber * secondNumber);
        System.out.println(result);
    }

    public void division(Double firstNumber, Double secondNumber) {
        if (firstNumber == 0.0 && secondNumber == 0.0) {
            System.out.println("___Результат не определён___");
        } else if (firstNumber != 0.0 && secondNumber == 0.0) {
            System.out.println("___На ноль делить нельзя!___");
        } else {
            result = decimalFormat.format(firstNumber / secondNumber);
            System.out.println(result);
        }
    }
}
