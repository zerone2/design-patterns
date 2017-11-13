public class DeveloperFactory {
    public Developer getClassInstance(String className) {
        if(className.equalsIgnoreCase("PM")){
            return new ProjectManager(10, "Mobile and Web");
        } else if(className.equalsIgnoreCase("Sr")){
            return new SeniorDeveloper(8, "Web");
        } else if(className.equalsIgnoreCase("Jr")){
            return new JuniorDeveloper(6, "Mobile");
        } else return null;
    }
}
