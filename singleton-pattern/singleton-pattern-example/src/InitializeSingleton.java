public class InitializeSingleton {
    private static InitializeSingleton uniqueInstance = new InitializeSingleton();
    private InitializeSingleton(){}

    public static InitializeSingleton getInstance(){
        return uniqueInstance;
    }
}
