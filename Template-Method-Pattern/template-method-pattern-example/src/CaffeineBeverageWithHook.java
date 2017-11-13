public abstract class CaffeineBeverageWithHook {

    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){
        System.out.println("boiling water..");
    }

    void pourInCup(){
        System.out.println("pouring into cup");
    }
    boolean customerWantsCondiments(){
        return true;
    }
}
