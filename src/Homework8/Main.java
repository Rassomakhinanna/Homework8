import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName + "";
        System.out.println("ФИО сотрудника — " + fullName);
        // Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));
        // Задание 3
        String fulName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fulName.replace('ё', 'e') );
    }
}