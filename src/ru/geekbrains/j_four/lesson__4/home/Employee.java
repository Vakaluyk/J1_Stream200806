package ru.geekbrains.j_four.lesson__4.home;

class Employee {
    private static final int CURRENT_YEAR = 2020;

    public String surname;
    public String secondName;
    public String name;
    public float salary;
    boolean isSalaryChanged;
    public int birthYear;
    public static int id = 0;
    public int uid;

    // 2.
    Employee (String name,
              String secondName,
              String surname,
              float salary,
              int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.salary = salary;
        this.uid = ++id;
    }

    // 3.
    int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    int getSalary() {
        return (int)salary;
    }

    void setSalary(float difference) {
        this.salary = this.salary + difference;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getSecondName() {
        return secondName;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }



    String getFullInfo() {
        return  this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + " years old, " +
                this.getSalary() + " RUR.";
    }
}
