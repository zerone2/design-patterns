public abstract class Developer {
    int salary = 0;
    String department = null;

    abstract void showSalary();
    abstract void showDepartment();

    public void getClassName(Object o){
        System.out.println("Developer class : " + o.getClass().getSimpleName());
    }

}
