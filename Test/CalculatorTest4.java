



public class CalculatorTest4 {
    public void testCalculations() {
        ProblemSolver solver = new ProblemSolver(15, 22, new TextResultFactory()); 
        solver.solveProblem();

        double result = solver.getResult();
        double expected = 37;

        if (result == expected) {
            System.out.println("Тест обчислень пройшов успішно.");
            System.out.println("Результат обчислень: " + result);
        } else {
            System.out.println("Тест обчислень не пройшов.");
        }
    }

    public static void main(String[] args) {
        CalculatorTest4 test = new CalculatorTest4();
        test.testCalculations();
    }
}
