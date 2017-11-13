public class SeniorDeveloper extends Developer {
    public SeniorDeveloper(int salary, String department){
        this.salary=salary;
        this.department=department;
    }

    @Override
    void showSalary() {
        System.out.println("Senior developer's salary is " + salary + "M$\n");
    }

    @Override
    void showDepartment() {
        System.out.println("Developer's department is "+ department + "\n");
    }
}
