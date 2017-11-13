import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{

    public void brew(){
        System.out.println("brewing coffee with filter");
    }
    public void addCondiments(){
        System.out.println("adding milk and sugar");
    }
    @Override
    public boolean customerWantsCondiments(){
        System.out.println("into customerWantescondiments");
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;
        System.out.print("Would you like some sugar and milk with your coffee? (y/n) ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO Exception occured");
        }

        if (answer==null){
            return "no";
        }
        return answer;
    }
}
