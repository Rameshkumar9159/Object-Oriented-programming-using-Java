class Employee {
private double baseSalary;
public Employee(double baseSalary) {
this.baseSalary = baseSalary;
}
public double calculateSalary() {
return baseSalary + 0.2 * baseSalary;
}
}
public class exp01 {
public static void main(String[] args) {Employee emp1 = new Employee(50000);
Employee emp2 = new Employee(40000);
Employee emp3 = new Employee(60000);
Employee emp4 = new Employee(30000);
Employee emp5 = new Employee(20000);
System.out.println("1nd Employee salary adding 20% bonus:"+emp1.calculateSalary());
System.out.println("2nd Employee salary adding 20% bonus:"+emp2.calculateSalary());
System.out.println("3rd Employee salary adding 20% bonus:"+emp3.calculateSalary());
System.out.println("4th Employee salary adding 20% bonus:"+emp4.calculateSalary());
System.out.println("5th Employee salary adding 20% bonus:"+emp5.calculateSalary());
}
}
