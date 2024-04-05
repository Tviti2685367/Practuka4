package Pr2;

// Класс для расчета частоты сердечных сокращений
public class HeartRateCalculator {
    private static final int BASE_HEART_RATE = 60;
    private static final double NORMAL_BODY_TEMPERATURE = 37.0;
    private static final int RATE_CHANGE_PER_DEGREE = 10;

    public static int calculateHeartRate(double bodyTemperature) {
        return BASE_HEART_RATE + (int) ((bodyTemperature - NORMAL_BODY_TEMPERATURE) * RATE_CHANGE_PER_DEGREE);
    }

    public static void main(String[] args) {
        double bodyTemperature = 38.5;
        int heartRate = calculateHeartRate(bodyTemperature);
        System.out.println("Частота сердечных сокращений при температуре " + bodyTemperature + " градусов Цельсия: " + heartRate + " ударов в минуту");
    }
}