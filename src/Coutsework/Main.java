package Coutsework;

public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        employees [0] = new Employee("Иванов Иван Иванович", 1, 50000);
        employees [1] = new Employee("Петров Петр Петрович", 2, 38800);
        employees [2] = new Employee("Степанов Степан Степанович", 3, 63000);
        employees [3] = new Employee("Александров Александр Александрович", 4, 12500);
        employees [4] = new Employee("Максимов Максим Максимович", 5, 25000);
        employees [5] = new Employee("Смирнова Ольга Владимировна", 1, 48000);
        employees [6] = new Employee("Грознова Надежда Васильевна", 2, 40000);
        employees [7] = new Employee("Караева Анастасия Шамилевна", 3, 18000);
        employees [8] = new Employee("Денисова Алевтина Викторовна", 4, 15300);
        employees [9] = new Employee("Гусарова Ксения Анатольевна",5, 57000);
        for (Employee employee: employees)
        System.out.println(employee);


        //System.out.println("Сумма затрат на зарплаты в месяц - " + totalSalary + " руб.");
        //System.out.println("Сотрудник с минимальной зарплатой - " + minSelary + " руб.");
        //System.out.println("Сотрудник с максимальной зарплатой - " + maxSelary + " руб.");
        //System.out.println("Среднее значение зарплат по компании - " + averageSalary + " руб");
    }
}
