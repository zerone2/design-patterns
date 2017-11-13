public class MakeDeveloper {
    public static void main(String[] args){
        DeveloperFactory df = new DeveloperFactory();

        Developer d = df.getClassInstance("PM");
        d.showDepartment();
        d.showSalary();
        d.getClassName(d);
        System.out.println("=====================================");

        d = df.getClassInstance("Sr");
        d.showDepartment();
        d.showSalary();
        d.getClassName(d);
        System.out.println("=====================================");

        d = df.getClassInstance("Jr");
        d.showDepartment();
        d.showSalary();
        d.getClassName(d);
        System.out.println("=====================================");
    }
}
