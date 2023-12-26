public class Employee {
public String name;
public double salary;
public int worksHours, hireYear;
Employee(String name, double salary, int worksHours, int hireYear) {
    this.name = name;
    this.salary = salary;
    this.worksHours = worksHours;
    this.hireYear = hireYear;
}
public double tax() {
    if (this.salary >= 1000) {
        return salary*0.03;
    }
    return 0.0;
}
public double bonus() {
    int extraHours = this.worksHours - 40;
    if (extraHours > 0) {
        return 30*extraHours;
    }
    return 0.0;
}
public double incrase() {
    int year = 2023 - this.hireYear;
    if (year < 10) {
        return salary * 0.5;
    }
    else if (year >= 10 && year < 20) {
        return salary*0.10;
    }
    else {
        return salary * 0.15;
    }
}
public void toString(Employee emp1){
    System.out.println("Tax: " +emp1.tax());
    System.out.println("Bonus: "+emp1.bonus());
    System.out.println("Increase Salary: "+emp1.incrase());
    double totalSalary = emp1.salary - emp1.tax() + emp1.bonus();
    System.out.println("Total Salary with tax and bonus : " + totalSalary);
    System.out.println("Total salary with the raise of salary : " +(emp1.salary+emp1.incrase()) );
}
}
