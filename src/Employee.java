import java.util.Objects;

public class Employee {
    private static int countId;
    private String surname;
    private String name;
    private String patronymic;
    private int department;
    private double salary;
    private int id;

    public Employee(String surname, String name, String patronymic, int department, double salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        countId++;
        this.id = countId;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                department + " отдела, " +
                surname + " " + name + " " + patronymic +
                ", зарплата " + salary +
                ", (id=" + id +
                ')';
    }
}