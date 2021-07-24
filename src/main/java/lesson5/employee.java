package lesson5;

public class employee {
    public static void main(String[] args) {
        employee[] empArray = new employee[5];
        empArray[0] = new employee("Альфарий", "Дворник", "Alpharius@mail.com", 448037, 52_000, (short) 65);
        empArray[1] = new employee("Петров Юрий", "Инженер", "Petrovich@mail.com", 376543, 80_000, (short) 23);
        empArray[2] = new employee("Иордан Александр", "Слесарь", "IOr88@mail.com", 225672, 50_000, (short) 41);
        empArray[3] = new employee("Карпицкий Алексей", "Администратор", "Dimenkus@mail.com", 118097, 54_000, (short) 27);
        empArray[4] = new employee("Всеволодовский Всеволод", "Учитель начальных классов", "Morzss@mail.com", 554126,
                46_000, (short) 24);
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 40) empArray[i].getInfo();
        }
    }

    public employee() {
    }

    public employee(String fullName, String position, String email, int phoneNumber, int salary, short age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    private String fullName, position, email;
    private int phoneNumber, salary;
    private short age;

    void getInfo() {
        System.out.printf("Employee name: %s %nCurrent position: %s %nEmail: %s %nPhone number: %s %nCurrent salary: %s %nAge: %s %n",
                fullName, position, email, phoneNumber, salary, age);
    }
}
