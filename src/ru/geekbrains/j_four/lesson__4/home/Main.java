package ru.geekbrains.j_four.lesson__4.home;

public class Main {
    // 6.
    private static void increaser(Employee[] emp, byte age, float increment){
        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getAge() > age) {
                emp[i].setSalary(increment);
                emp[i].isSalaryChanged = true;
            }
        }
    }

    // 7.
    private static float averageSalary(Employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getSalary();

        return result / emp.length;
    }

    private static float averageAge(Employee[] emp){
        float result = 0;
        for (int i = 0; i < emp.length; i++)
            result += emp[i].getAge();

        return result / emp.length;
    }

    public static void main(String[] args) {
        // 1.
        Employee e = new Employee("Alexandr", "Valerevich",
                "Vakaluyk",80000,1975);

        // 4.
        System.out.println("Please welcome our "  + ", " +
                e.getName() + " " + e.getSecondName() + " " + e.getSurname() + ".");

        // 5.

        Employee[] employees = {
                e,
                new Employee("Roman", "Barisovich",
                        "Guyikov", 100000, 1952),
                new Employee("Evgeniy", "Viktorovich",
                        "Barinov",  80000, 1952),
                new Employee("Olga", "Alexandrovna",
                        "Gerasimova",  75000, 1975),
                new Employee("Ecaterina", "Viktorovna",
                        "Odincova",  65000, 1995)
        };

        for (int i = 0; i < employees.length; i++)
            if (employees[i].getAge() > 40f)
                System.out.println(employees[i].getFullInfo());

    }

}
