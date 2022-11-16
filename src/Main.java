import java.util.Arrays;

public class Main {
    private static Employee[] employees; //вынесли employees из main

    public static void main(String[] args) {
        employees = new Employee[10]; //Employee[] employees = new Employee[10]; - вынесли employees вовне main
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 100.12);
        employees[1] = new Employee("Иванов", "Иван", "Иванович1", 2, 200);
        employees[2] = new Employee("Иванов", "Иван", "Иванович2", 3, 300);
        employees[3] = new Employee("Иванов", "Иван", "Иванович3", 4, 400);
//        employees[4] = new Employee("Иванов", "Иван", "Иванович4", 5, 500);
        employees[5] = new Employee("Иванов", "Иван", "Иванович5", 1, 500);
        employees[6] = new Employee("Иванов", "Иван", "Иванович6", 2, 600);
        employees[7] = new Employee("Иванов", "Иван", "Иванович7", 3, 700);
        employees[8] = new Employee("Иванов", "Иван", "Иванович8", 4, 800);
        employees[9] = new Employee("Иванов", "Иван", "Иванович9", 5, 900);
        //Список данных по сотрудникам
        listDataEmployees(); //скобки пустые везде, так как вынесли employees вовне main
        //Сумма затрат на зарплаты в месяц
        System.out.printf("Сумма затрат на зарплаты в месяц - %.2f \n", sumSalary());
        //Минимальная зп
        System.out.println("Минимальная зарплата - " + minSalary());
        //Максимальная зп
        maxSalary();
        //Средняя зп
//        averageSalary();
        System.out.printf("Средняя зарплата - %.2f \n", averageSalary());
        //ФИО
        fioEmployees();
    }

    public static void listDataEmployees() {
//        Arrays.stream(employees).forEach(System.out::println);
//        или
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }
//        или
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i]);
        }
    }

    public static double sumSalary() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
//        System.out.printf("Сумма затрат на зарплаты в месяц - %.2f \n", sum);
        return sum;
    }

    public static Employee minSalary() {
        Employee print = employees[0]; //если - public static void - эта строчка не нужна (см. метод maxSalary())
        double min = Double.POSITIVE_INFINITY; //это самое большое (бесконечно большое, плюс бесконечность) значение
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < min) {
                min = employees[i].getSalary();
                print = employees[i];
            }
        }
//        System.out.printf("Минимальная зарплата - %.2f \n", minSalary()); //если public static void
        return print; //если - public static void - эта строчка не нужна (см. метод maxSalary())
    }

    public static void maxSalary() {
        Employee print = employees[0]; //если - public static Employee - эта строчка нужна (см. метод minSalary())
        double max = Double.NEGATIVE_INFINITY; //это самое маленькое (бесконечно маленькое, минус бесконечность) значение
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > max) {
                max = employees[i].getSalary();
            }
        }
        System.out.printf("Максимальная зарплата - %.2f \n", max);
//        return print; //если - public static Employee - (см. метод minSalary())
    }

    public static double averageSalary() {
        int counterNoNull = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counterNoNull++;
            }
        }
//        System.out.printf("Средняя зарплата - %.2f \n", sumSalary() / counterNoNull); //если public static void
        return sumSalary() / counterNoNull; //если public static double
    }

    public static void fioEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.printf("Ф.И.О. работника - %s %s %s \n", employees[i].getSurname(), employees[i].getName(), employees[i].getPatronymic());
            }
        }
    }
}