package ironman;

/**
 * Parent class for all the Ironman suits.
 */
public abstract class IronManSuit {
    public String name = "";
    public String bodyType = "";
    public String power = "";

    public abstract void prepareSuit();

    /**
     * Building the required suit with multiple attributes.
     */
    public void buildSuit() {
        System.out.println("Suit created with following specifications: ");
        System.out.println("Name: " + name);
        System.out.println("Body Type: " + bodyType);
        System.out.println("Power Level: " + power);
    }
}
