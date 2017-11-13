import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeverageTest {
    public static void main(String[] args){

        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("\npreparing tea...");
        tea.prepareRecipe();

        System.out.println("\npreparing coffee...");
        coffee.prepareRecipe();
    }
}
