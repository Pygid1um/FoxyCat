package ds.Anosov.HomeProjects.Calculator;

public class Main {

    public static void main(String[] args) {
        ScanningOfMathOperation scanningOfMathOperation = new ScanningOfMathOperation();
        scanningOfMathOperation.scanningFirstNumber();

        scanningOfMathOperation.scanningSecondNumber();
        scanningOfMathOperation.scanningOperation();
    }

}

// добавить логику работы при вводе NaN в числа
// сделать проверку что вводятся числа больше чем Double.MAX_VALUE и меньше чем Double.MIN_VALUE
