package lesson6;

/**
 * Created by Anna on 12.02.2019.
 */
public class Department {
    private String name;
    private Employee[] employees;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public void  printNameOfDepartment(){
        System.out.println(name);
    }
}
