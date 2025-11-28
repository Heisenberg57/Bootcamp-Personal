public class Employee extends Person{
    int salary;

    void showEmployee(){
        showDetails();
        System.out.println("salary of employee is: " + salary);
    }
}
