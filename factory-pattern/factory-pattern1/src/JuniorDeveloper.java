public class JuniorDeveloper extends Developer {
    public JuniorDeveloper(int salary, String department){
        this.department = department;
        this.salary = salary;
    }

    @Override
    void showSalary() {
        System.out.println("Junior developers salary is " + salary + "M$\n");
    }

    @Override
    void showDepartment() {
        System.out.println("Developers department is " + department + "\n");
    }
}
