public class ProjectManager extends Developer {
    public ProjectManager(int salary, String department){
        this.salary=salary;
        this.department=department;
    }

    @Override
    void showSalary() {
        System.out.println("Project manager's salary is " + salary + "M$\n");
    }

    @Override
    void showDepartment() {
        System.out.println("PM's department is " + department + "\n");
    }
}
