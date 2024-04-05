import Pr2.ProblemSolver;
import Pr2.ResultFactory;
import Pr2.TextResultFactory;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрики для вывода результатов в текстовом и табличном форматах
        ResultFactory textResultFactory = new TextResultFactory();
        // ResultFactory tableResultFactory = new TableResultFactory(); // Удаляем эту строку

        // Создаем объекты ProblemSolver, используя различные фабрики
        ProblemSolver solver1 = new ProblemSolver(10, 5, textResultFactory);
        // ProblemSolver solver2 = new ProblemSolver(10, 5, tableResultFactory); // Удаляем эту строку

        // Решаем задачу и выводим результаты
        solver1.solveProblem();
        // solver2.solveProblem(); // Удаляем эту строку
    }
}