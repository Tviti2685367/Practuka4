import Pr.Main; // Импортируем класс Main из пакета Pr

public class MainTest {

    public static void main(String[] args) {
        // Перевірка, чи програма коректно виводить повідомлення, якщо немає аргументів командного рядка 
        testNoArguments();
         
        // Перевірка, чи програма коректно виводить передані аргументи командного рядка 
        testWithArguments();
    }

    public static void testNoArguments() {
        String[] args = {};
        Main.main(args); // Вызываем метод main из класса Main 
    }

    public static void testWithArguments() {
        String[] args = {"Hello", "World!", "Olexandr"};
        Main.main(args); // Вызываем метод main из класса Main 
    }
}