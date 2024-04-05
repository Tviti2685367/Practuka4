import java.io.Serializable;

public class ProblemSolver implements Serializable {
    private static final long serialVersionUID = 1L;

    private CalculationData calculationData;
    private ResultFactory resultFactory; 

    public ProblemSolver(double parameter1, double parameter2, ResultFactory resultFactory) {
        this.calculationData = new CalculationData(parameter1, parameter2, 0.0);
        this.resultFactory = resultFactory;
    }

    public void solveProblem() {
        double result = calculationData.getParameter1() + calculationData.getParameter2();
        calculationData.setResult(result);
        resultFactory.displayResult(result);
    }

    public double getResult() {
        return calculationData.getResult();
    }
}
