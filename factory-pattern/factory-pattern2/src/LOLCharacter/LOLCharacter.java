package LOLCharacter;

import java.util.ArrayList;

public abstract class LOLCharacter {
    public String name;
    public String speech;
    public ArrayList<String> skills = new ArrayList<String>();

    public void getReady(){
        System.out.println("here comes " + name);
        System.out.println("making skills...");
        for(String skill : skills)
            System.out.println(skill + "...");
        System.out.println("making motions...");
        System.out.println("preparing map...\n");
    }

    public void attack() { System.out.println("Q, W, E, R attack!!"); }

    public void dance() { System.out.println("dance motion~ ctrl+4"); }

    public void talk() { System.out.println("summoner just arrived"); }

    public String getName() { return name; }

    public String toString(){
        StringBuffer display = new StringBuffer();
        display.append("=====").append(name).append("=====\n")
                .append(name).append(" : \"").append(speech).append("\"\n");
        for (String skill : skills){
            display.append("skills : ").append(skill).append("   ");
        }
        display.append("\n");
        return display.toString();
    }
}
