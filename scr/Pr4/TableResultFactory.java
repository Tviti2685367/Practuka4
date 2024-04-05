public class TableResultFactory implements ResultFactory {
    @Override
    public void displayResult(double result) {
        System.out.println("Таблиця результатів:");
        System.out.println("Параметр | Результат");
        System.out.println("---------|----------");
        System.out.println("   П1    |   " + result);
    }
}
