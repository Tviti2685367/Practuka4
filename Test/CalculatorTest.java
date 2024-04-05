import Pr2.ProblemSolver;
import Pr2.TextResultFactory; // Добавлен импорт класса TextResultFactory

public class CalculatorTest {
    public void testCalculations() {
        ProblemSolver solver = new ProblemSolver(10, 5, new TextResultFactory()); // Исправлена ошибка здесь
        solver.solveProblem();

        double result = solver.getResult();
        double expected = 15;

        if (result == expected) {
            System.out.println("Тест вычислений пройден успешно.");
            System.out.println("Результат вычислений: " + result);
        } else {
            System.out.println("Тест вычислений не пройден.");
        }
    }

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.testCalculations();
    }
}