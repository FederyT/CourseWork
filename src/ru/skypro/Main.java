package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Employee[] Employees = new Employee[10];
        Employees[0] = new Employee("Иванов", "Иван", "Иванович", 190_000, 1);
        Employees[1] = new Employee("Петров", "Пётр", "Петрович", 100_000, 2);
        Employees[2] = new Employee("Борисов", "Борис", "Борисович", 100_000, 3);
        Employees[3] = new Employee("Павлов", "Павел", "Павлович", 100_000, 4);
        Employees[4] = new Employee("Семёнов", "Семён", "Семёнович", 100_000, 5);
        Employees[5] = new Employee("Антонов", "Антон", "Антонович", 100_000, 5);
        Employees[6] = new Employee("Александров", "Александр", "Александрович", 100_000, 4);
        Employees[7] = new Employee("Степанов", "Степан", "Степанович", 100_000, 3);
        Employees[8] = new Employee("Алексеев", "Алексей", "Алексеевич", 100_000, 2);
        Employees[9] = new Employee("Михайлов", "Михаил", "Михайлович", 10_000, 1);
        Employee.printEmployeelist(Employees);
        for (int i = 0; i < Employees.length; i++) {
            System.out.println("Employees[i] = " + Employees[i].toString());

        }
        // Employees[1].setId(5);  меняем номер отдела
        //Employees[1].setSallary(5); меняем зп
        whatIsMaxSalary(Employees);
        whatIsMinSalary(Employees);
        whatIsSumSalary(Employees);
        whatIsMiddleSalary(Employees);
        fio(Employees);


    }


    private static void whatIsSumSalary(Employee[] employees) {
        double sum = 0d;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].sallary;
        }
        System.out.println("Затраты на зарплату в месяц " + sum + " руб.");
    }

    private static void whatIsMiddleSalary(Employee[] employees) {
        double sum = 0d;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].sallary / employees.length;
        }
        System.out.println("Среднее значение зарплат " + sum + " руб.");
    }

    private static void whatIsMaxSalary(Employee[] employees) {
        double maxSalary = employees[0].sallary;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].sallary > maxSalary) maxSalary = employees[i].sallary;
        }
        System.out.println("Максимальное значение заработной платы " + maxSalary + "руб.");
    }

    private static void whatIsMinSalary(Employee[] employees) {
                double minSalary = employees[0].sallary;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].sallary < minSalary) minSalary = employees[i].sallary;
        }
        System.out.println("Минимальное значение заработной платы " + minSalary + "руб.");
    }

    private static void fio(Employee[] employees) {
        for (int i = 1; i < employees.length; i++) {
            System.out.println(employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getMiddleName());
        }
    }
}