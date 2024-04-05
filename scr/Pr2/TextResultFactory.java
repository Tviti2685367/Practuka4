package Pr2;

public class TextResultFactory implements ResultFactory {
    @Override
    public void displayResult(double result) {
        System.out.println("Результат вычислений: " + result);
    }
}