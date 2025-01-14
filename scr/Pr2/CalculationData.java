package Pr2;

import java.io.Serializable;

// Класс для хранения параметров и результатов вычислений
public class CalculationData implements Serializable {
    private static final long serialVersionUID = 1L;

    private double parameter1;
    private double parameter2;
    private double result;

    public CalculationData(double parameter1, double parameter2, double result) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.result = result;
    }

    public double getParameter1() {
        return parameter1;
    }

    public void setParameter1(double parameter1) {
        this.parameter1 = parameter1;
    }

    public double getParameter2() {
        return parameter2;
    }

    public void setParameter2(double parameter2) {
        this.parameter2 = parameter2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}