import java.io.*;
public class Employee{
    float salary = 40000;
}
class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String args[]){
      Programmer p = new Programmer();
      System.out.println("Salary Of the Programmer is "+p.salary);
      System.out.println("Bonus Of the Programmer is "+p.bonus);
      float grossSalary = p.salary + p.bonus;
      System.out.println("Gros Salary Of Programmer is "+grossSalary);
    }
}
